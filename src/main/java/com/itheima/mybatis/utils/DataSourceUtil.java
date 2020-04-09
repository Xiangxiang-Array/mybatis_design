package com.itheima.mybatis.utils;

import com.itheima.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @version v1.0
 * @ProjectName: day01_eesy_04mybatis_design
 * @ClassName: DataSourceUtil
 * @Description: 用于创建数据源的工具类
 * @Author: Array
 * @Date: 2020/4/5 17:20
 */
public class DataSourceUtil {
    /**
     * @param cfg
     * @return Connection
     * @Title:
     * @Description: 用于获取一个数据源
     * @author Array
     * @date 2020/4/5 17:20
     */
    public static Connection getConnection(Configuration cfg) {
        try {
            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
