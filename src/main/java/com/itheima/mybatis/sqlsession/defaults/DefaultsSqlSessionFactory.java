package com.itheima.mybatis.sqlsession.defaults;

import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.SqlSession;
import com.itheima.mybatis.sqlsession.SqlSessionFactory;

/**
 * @version v1.0
 * @ProjectName: day01_eesy_04mybatis_design
 * @ClassName: DefaultsSqlSessionFactory
 * @Description: SqlSessionFactory接口的实现类
 * @Author: Array
 * @Date: 2020/4/5 17:00
 */
public class DefaultsSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultsSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * @return @return
     * @Description: 用于打开一个新的SqlSession对象
     * @author Array
     * @date 2020/4/5 16:35
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
