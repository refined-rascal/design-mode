package com.refined.rascal.creational.builder;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhanghao
 * @version 1.0.0
 * @date 2023/4/8 13:33
 */
public class ConcreteBuilder extends AbstractBuilder{

    public AbstractBuilder setName(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("...");
        }
        this.name = name;
        return this;
    }

    public AbstractBuilder setAge(Integer age) {
        if (age > 20) {
            throw new IllegalArgumentException("...");
        }
        this.age = age;
        return this;
    }

    public AbstractBuilder setSex(Integer sex) {
        if (sex == 1) {
            throw new IllegalArgumentException("...");
        }
        this.sex = sex;
        return this;
    }
}
