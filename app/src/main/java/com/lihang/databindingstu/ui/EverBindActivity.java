package com.lihang.databindingstu.ui;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ObservableMap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.lihang.databindingstu.BR;
import com.lihang.databindingstu.R;
import com.lihang.databindingstu.bean.Dog;
import com.lihang.databindingstu.bean.Human;
import com.lihang.databindingstu.bean.TestBean;
import com.lihang.databindingstu.databinding.ActivityEverbindBinding;

import java.util.Random;

/**
 * Created by leo
 * on 2019/9/18.
 */
public class EverBindActivity extends AppCompatActivity implements View.OnClickListener {
    private TestBean testBean;
    private Human human;

    private ObservableMap<String, String> map = new ObservableArrayMap<>();
    private Dog hotDog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_everbind);
        ActivityEverbindBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_everbind);
        testBean = new TestBean("测试的头", "测试的脚");
        human = new Human("岩浆李的游鱼", 27);
        binding.setHuman(human);
        binding.setTestBean(testBean);
        binding.setClickListener(this);
        //对继承BaseObservable的监听
        setListener();


        //下面是ObservableColltion
        map.put("key1", "数值one");
        map.put("key2", "数值2222");
        binding.setMap(map);
        ObservableArrayList<String> list = new ObservableArrayList<>();
        list.add("NO.1");
        list.add("NO.222");
        binding.setList(list);
        binding.setIndex(1);
        binding.setKey("name");

        hotDog = new Dog();
        hotDog.dogName.set("金毛");
        binding.setHotDog(hotDog);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                testBean.setHead("漂亮的脸蛋！！");
                testBean.setFoot("空虚的灵魂！");

                break;
            case R.id.btn_filed:
                human.name.set("Sxy");
                human.age.set(18);
                break;

            case R.id.btn_collection:
                map.put("name", "岩浆李" + new Random().nextInt(100));
                break;

            case R.id.btn_two:
                Toast.makeText(EverBindActivity.this, "是不是双向绑定 ==> " + hotDog.dogName.get(), Toast.LENGTH_SHORT).show();
                return;
        }
        Toast.makeText(EverBindActivity.this, "我被点击了！！", Toast.LENGTH_SHORT).show();
    }


    private void setListener() {
        //实现Observable 接口的类允许注册一个监听器
        testBean.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (propertyId == com.lihang.databindingstu.BR.head) {
                    Log.e("看看刷新了哪", "我刷新了头部！！");
                } else if (propertyId == com.lihang.databindingstu.BR.foot) {
                    Log.e("看看刷新了哪", "脚");
                } else if (propertyId == com.lihang.databindingstu.BR._all) {
                    Log.e("看看刷新了哪", "全部全部");
                } else if (propertyId == com.lihang.databindingstu.BR.testBean) {
                    Log.e("看看刷新了哪", "testBean");
                } else {
                    Log.e("看看刷新了哪", "未知错误~");
                }
            }
        });
    }


}
