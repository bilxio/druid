package com.alibaba.druid.pool.ha;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import com.alibaba.druid.pool.DataSourceAdapter;
import com.alibaba.druid.pool.DruidDataSource;

public abstract class MultiDataSource extends DataSourceAdapter {

    protected ArrayList<DruidDataSource> dataSources;

    private Properties                   properties = new Properties();

    public MultiDataSource(){
        dataSources = new ArrayList<DruidDataSource>();
    }

    public List<DruidDataSource> getDataSources() {
        return Collections.unmodifiableList(dataSources);
    }

    public void setDataSources(List<DruidDataSource> dataSources) {
        this.dataSources = new ArrayList<DruidDataSource>(dataSources);
        ;
    }

    public Properties getProperties() {
        return properties;
    }

    @Override
    public abstract Connection getConnection() throws SQLException;
}