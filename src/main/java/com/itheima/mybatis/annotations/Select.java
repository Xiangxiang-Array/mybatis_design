package com.itheima.mybatis.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version v1.0
 * @ProjectName: day01_eesy_04mybatis_design
 * @ClassName: Select
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Array
 * @Date: 2020/4/5 17:43
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {

    /**
     * @return @return
     * @Title:
     * @Description: 配置SQL语句的
     * @author Array
     * @date 2020/4/5 17:44
     */
    String value();
}
