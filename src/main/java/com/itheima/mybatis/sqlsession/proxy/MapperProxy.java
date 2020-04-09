package com.itheima.mybatis.sqlsession.proxy;

import com.itheima.mybatis.cfg.Mapper;
import com.itheima.mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * @version v1.0
 * @ProjectName: day01_eesy_04mybatis_design
 * @ClassName: MapperProxy
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Array
 * @Date: 2020/4/5 17:10
 */
public class MapperProxy implements InvocationHandler {

    //map的key是全限定类名+方法名
    private Map<String, Mapper> mappers;
    private Connection conn;

    public MapperProxy(Map<String, Mapper> mappers, Connection conn) {
        this.mappers = mappers;
        this.conn = conn;
    }

    /**
     * @param @param
     * @return @return
     * @throws
     * @Title:
     * @Description: 用于对方法进行增强，我们的增强其实就是调用selectList方法
     * @author Array
     * @date 2020/4/5 17:10
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        //1.获取方法名
        String methodName = method.getName();
        //2.获取方法所在的类名称
        String className = method.getDeclaringClass().getName();
        //3.组合key
        String key = className + "." + methodName;
        //4.获取mappers中的Mapper对象
        Mapper mapper = mappers.get(key);
        //5.判断是否有mapper
        if (mapper == null) {
            throw new IllegalArgumentException("传入的参数有误");
        }
        //6.调用工具类，查询所有

        return new Executor().selectList(mapper, conn);
    }
}
