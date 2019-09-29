package com.lihang.databindingstu.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by leo
 * on 2019/9/18.
 */
public class ImageHelper {
    @BindingAdapter("textTitle")
    public static void loadImage(TextView textView, String url){
        textView.setText(url);
    }
}
