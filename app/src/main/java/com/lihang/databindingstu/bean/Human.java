package com.lihang.databindingstu.bean;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by leo
 * on 2019/9/18.
 */
//ObservableField 类似对 BaseObservable的封装
//Observable对基本属性类型进行了封装，也可以用泛型来表示ObservableField<T> 表示
public class Human {

    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();

    public Human(String name, int age) {
        this.name.set(name);
        this.age.set(age);
    }
}
