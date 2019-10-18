package com.lihang.databindingstu.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lihang.databindingstu.R;
import com.lihang.databindingstu.bean.AnimalBean;
import com.lihang.databindingstu.bean.OnClickUtil;
import com.lihang.databindingstu.bean.UserBean;
import com.lihang.databindingstu.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
	//我这里随便加上一句话看看

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserBean userBean = new UserBean("DataBinding万岁！！", 12);
        binding.setUser(userBean);
        binding.setAge(27);

        AnimalBean animalBean = new AnimalBean("我是大熊猫~~", "黑白渐变");
        binding.setAnim(animalBean);

        String testNullStr = "我来试试空字符串" + "   " + "哈哈";
        binding.setValueLeo(testNullStr);

        //这里是设置点击事件
        binding.setOnClickListener(this);
        binding.setOnclickUtil(new OnClickUtil());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
//                Toast.makeText(MainActivity.this, "我这是测试成功了！！牛逼", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, EverBindActivity.class));
                break;
            case R.id.btn_activity:
                startActivity(new Intent(MainActivity.this, SecondActivity.class));

                break;
        }
    }
}
