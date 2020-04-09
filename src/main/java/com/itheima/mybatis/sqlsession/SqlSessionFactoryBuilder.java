package com.itheima.mybatis.sqlsession;

import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.defaults.DefaultsSqlSessionFactory;
import com.itheima.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @version v1.0
 * @ProjectName: day01_eesy_04mybatis_design
 * @ClassName: SqlSessionFactoryBuilder
 * @Description: 用于创建一个SqlSessionFactory对象
 * @Author: Array
 * @Date: 2020/4/5 16:32
 */
public class SqlSessionFactoryBuilder {

    /**
     * @param config
     * @return @return
     * @throws
     * @Title:
     * @Description: 根据参数的字节输了流来构建一个SqlSessionFactory工厂
     * @author Array
     * @date 2020/4/5 16:42
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultsSqlSessionFactory(cfg);
    }
}
