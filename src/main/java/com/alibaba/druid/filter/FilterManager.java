/*
 * Copyright 1999-2011 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.filter;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.druid.logging.Log;
import com.alibaba.druid.logging.LogFactory;
import com.alibaba.druid.util.JdbcUtils;

public class FilterManager {

    private final static Log                               LOG      = LogFactory.getLog(FilterManager.class);

    private static final ConcurrentHashMap<String, String> aliasMap = new ConcurrentHashMap<String, String>();

    static {
        try {
            Properties filterProperties = loadFilterConfig();
            for (Map.Entry<Object, Object> entry : filterProperties.entrySet()) {
                String key = (String) entry.getKey();
                if (key.startsWith("druid.filters.")) {
                    String name = key.substring("druid.filters.".length());
                    aliasMap.put(name, (String) entry.getValue());
                }
            }
        } catch (Exception e) {
            LOG.error("load filter config error", e);
        }
    }

    public static final String getFilter(String alias) {
        return aliasMap.get(alias);
    }

    public static Properties loadFilterConfig() throws IOException {
        Properties filterProperties = new Properties();

        loadFilterConfig(filterProperties, ClassLoader.getSystemClassLoader());
        loadFilterConfig(filterProperties, Thread.currentThread().getContextClassLoader());

        return filterProperties;
    }

    private static void loadFilterConfig(Properties filterProperties, ClassLoader classLoader) throws IOException {
        for (Enumeration<URL> e = classLoader.getResources("META-INF/druid-filter.properties"); e.hasMoreElements();) {
            URL url = e.nextElement();

            Properties property = new Properties();

            InputStream is = null;
            try {
                is = url.openStream();
                property.load(is);
            } finally {
                JdbcUtils.close(is);
            }

            filterProperties.putAll(property);
        }
    }
}
