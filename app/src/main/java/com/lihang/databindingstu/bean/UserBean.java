package com.lihang.databindingstu.bean;

import java.io.Serializable;

/**
 * Created by leo
 * on 2019/9/17.
 */
public class UserBean implements Serializable {
    private String name;
    private int age;


    public UserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
