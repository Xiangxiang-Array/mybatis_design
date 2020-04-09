package com.itheima.mybatis.io;

import java.io.InputStream;

/**
 * @version v1.0
 * @ProjectName: day01_eesy_04mybatis_design
 * @ClassName: Resources
 * @Description: 使用类加载器读取配置文件的类
 * @Author: Array
 * @Date: 2020/4/5 16:26
 */
public class Resources {

    /**
     * @param filePath
     * @return @return
     * @Title:
     * @Description: 根据传入的参数，获取一个字节输入流
     * @author Array
     * @date 2020/4/5 16:27
     */
    public static InputStream getResourceAsStream(String filePath) {
        //Resources.class 第一步，拿到当前类的字节码
        //getClassLoader() 第二步，获取字节码的类的加载器
        //getResourceAsStream(filePath) 第三步，根据类加载器读取配置
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
