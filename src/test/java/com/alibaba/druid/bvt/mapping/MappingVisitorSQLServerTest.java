package com.alibaba.druid.bvt.mapping;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.druid.mapping.Entity;
import com.alibaba.druid.mapping.MappingEngine;
import com.alibaba.druid.mapping.Property;
import com.alibaba.druid.mapping.spi.MSSQLServerMappingProvider;

public class MappingVisitorSQLServerTest extends TestCase {

    MappingEngine engine = new MappingEngine(new MSSQLServerMappingProvider());

    protected void setUp() throws Exception {
        Entity entity = new Entity();
        entity.setName("设备");
        entity.setDescription("Device");
        entity.setTableName("device");

        entity.addProperty(new Property("编号", "", "serviceTag"));
        entity.addProperty(new Property("IP地址", "", "ip"));

        engine.addEntity(entity);
    }

    public void test_0() throws Exception {

        Assert.assertEquals("SELECT serviceTag AS \"编号\", ip AS \"IP地址\"\nFROM device", engine.explainToSelectSQL("select *"));
        Assert.assertEquals("SELECT serviceTag AS \"编号\", ip AS \"IP地址\"\nFROM device\nWHERE ip = '127.0.0.1'",
                            engine.explainToSelectSQL("select 编号, IP地址 WHERE IP地址 = '127.0.0.1'"));

    }
    
    public void test_1() throws Exception {
        engine.setMaxLimit(10);
        
        Assert.assertEquals("SELECT TOP 10 serviceTag AS \"编号\", ip AS \"IP地址\"\nFROM device", engine.explainToSelectSQL("select *"));
        Assert.assertEquals("SELECT TOP 10 serviceTag AS \"编号\", ip AS \"IP地址\"\nFROM device\nWHERE ip = '127.0.0.1'",
                            engine.explainToSelectSQL("select 编号, IP地址 WHERE IP地址 = '127.0.0.1'"));
        
        Assert.assertEquals("SELECT TOP 3 serviceTag AS \"编号\", ip AS \"IP地址\"\nFROM device\nWHERE ip = '127.0.0.1'",
                            engine.explainToSelectSQL("select top 3 编号, IP地址 WHERE IP地址 = '127.0.0.1'"));
        
        engine.setMaxLimit(null);

    }
}
