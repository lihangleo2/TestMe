package com.lihang.databindingstu.bean;

import java.io.Serializable;

/**
 * Created by leo
 * on 2019/9/17.
 */
public class AnimalBean implements Serializable {
    private String categoryName;
    private String color;

    public AnimalBean(String categoryName, String color) {
        this.categoryName = categoryName;
        this.color = color;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
