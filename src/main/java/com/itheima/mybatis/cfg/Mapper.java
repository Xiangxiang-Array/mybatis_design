package com.itheima.mybatis.cfg;

/**
 * @version v1.0
 * @ProjectName: day01_eesy_04mybatis_design
 * @ClassName: Mapper
 * @Description: 用于封装执行的SQL语句和结果类型的全限定类名
 * @Author: Array
 * @Date: 2020/4/5 16:50
 */
public class Mapper {

    private String queryString;//SQL
    private String resultType;//实体类的全限定类名

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}