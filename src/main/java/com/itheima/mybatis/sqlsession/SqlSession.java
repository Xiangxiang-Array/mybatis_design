package com.itheima.mybatis.sqlsession;

/**
 * @version v1.0
 * @ProjectName: day01_eesy_04mybatis_design
 * @ClassName: SqlSession
 * @Description: 自定义mybais中 和 数据库交互的核心类
 * 它里面可以创建 dao 接口的代理对象
 * @Author: Array
 * @Date: 2020/4/5 16:35
 */
public interface SqlSession {

    /**
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return @return
     * @Title:
     * @Description: 根据参数创建一个代理对象
     * @author Array
     * @date 2020/4/5 16:37
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * @Title: 释放资源
     * @author Array
     * @date 2020/4/5 16:39
     */
    void close();

}
