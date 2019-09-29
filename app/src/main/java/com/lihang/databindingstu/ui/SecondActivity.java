package com.lihang.databindingstu.ui;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.lihang.databindingstu.R;
import com.lihang.databindingstu.adapter.SimpleAdapter;
import com.lihang.databindingstu.databinding.ActivitySencondBinding;

import java.util.ArrayList;

/**
 * Created by leo
 * on 2019/9/17.
 */
public class SecondActivity extends AppCompatActivity {
    private SimpleAdapter adapter;
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sencond);

        ActivitySencondBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_sencond);
        //这里是另外一种方式
        binding.setTestName("貌似会有些问题！！");
        arrayList.add("中国男篮");
        arrayList.add("中国男足");
        arrayList.add("中国香港");
        adapter = new SimpleAdapter();
        adapter.setDataList(arrayList);
        binding.recyclerView.setAdapter(adapter);

    }

}
