package com.refined.rascal.creational.builder;

/**
 * @author zhanghao
 * @version 1.0.0
 * @date 2023/4/8 13:27
 */
public abstract class AbstractBuilder {

    protected String name;
    protected Integer age;
    protected Integer sex;

    public abstract AbstractBuilder setName(String name);
    public abstract AbstractBuilder setAge(Integer age);
    public abstract AbstractBuilder setSex(Integer sex);

    public Product build() {
        return new Product(this);
    }

}
