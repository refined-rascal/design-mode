package com.refined.rascal.creational.builder;


/**
 * @author zhanghao
 * @version 1.0.0
 * @date 2023/4/8 13:24
 */
public class Product {

    private final String name;
    private final Integer age;
    private final Integer sex;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSex() {
        return sex;
    }

    public Product(AbstractBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }
}
