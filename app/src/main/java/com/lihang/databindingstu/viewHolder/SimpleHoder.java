package com.lihang.databindingstu.viewHolder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.lihang.databindingstu.databinding.ItemSimpleBinding;

/**
 * Created by leo
 * on 2019/9/17.
 */
public class SimpleHoder extends RecyclerView.ViewHolder {
    public ItemSimpleBinding binding;

    public SimpleHoder(ItemSimpleBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
