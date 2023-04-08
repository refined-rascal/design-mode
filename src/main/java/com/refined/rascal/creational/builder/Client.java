package com.refined.rascal.creational.builder;

/**
 * @author zhanghao
 * @version 1.0.0
 * @date 2023/4/8 13:35
 */
public class Client {

    public static void main(String[] args) {
        AbstractBuilder abstractBuilder = new ConcreteBuilder();
        final Product product = abstractBuilder.setAge(21)
            .setName("小明")
            .setSex(1).build();
    }

}
