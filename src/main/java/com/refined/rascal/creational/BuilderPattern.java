package com.refined.rascal.creational;

import org.apache.commons.lang3.StringUtils;

/**
 * @author refined-rascal
 * @version 1.0.0
 * @date 2023/4/7 19:50
 */
public class BuilderPattern {

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

    private BuilderPattern(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public static class Builder {

        private String name;
        private Integer age;
        private Integer sex;

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }

        public Builder name(String name) {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("...");
            }
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            if (age > 20) {
                throw new IllegalArgumentException("...");
            }
            this.age = age;
            return this;
        }


        public Builder sex(Integer sex) {
            if (sex == 1) {
                throw new IllegalArgumentException("...");
            }
            this.sex = sex;
            return this;
        }
    }

    public static void main(String[] args) {
        BuilderPattern builderPattern = new Builder()
            .name("斯文败类")
            .age(21)
            .sex(0)
            .build();
    }

}
