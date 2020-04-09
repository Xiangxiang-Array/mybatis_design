package com.itheima.mybatis.sqlsession;

/**
 * @version v1.0
 * @ProjectName: day01_eesy_04mybatis_design
 * @ClassName: SqlSessionFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Array
 * @Date: 2020/4/5 16:33
 */
public interface SqlSessionFactory {

    /**
     * @return @return
     * @Description: 用于打开一个新的SqlSession对象
     * @author Array
     * @date 2020/4/5 16:35
     */
    SqlSession openSession();
}
