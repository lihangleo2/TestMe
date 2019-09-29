package com.lihang.databindingstu.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.lihang.databindingstu.BR;

/**
 * Created by leo
 * on 2019/9/18.
 */
public class TestBean extends BaseObservable {
    //如果属性值为public的话可以直接加上注解 @Bindable
    private String head;
    private String foot;

    @Bindable
    public String getHead() {
        return head;
    }


    public void setHead(String head) {
        this.head = head;
        notifyPropertyChanged(com.lihang.databindingstu.BR.head);
    }

    @Bindable
    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
//        notifyPropertyChanged(com.lihang.databindingstu.BR.foot);
        //这里是改变所有的值
        notifyChange();
    }

    public TestBean(String head, String foot) {
        this.head = head;
        this.foot = foot;
    }
}
