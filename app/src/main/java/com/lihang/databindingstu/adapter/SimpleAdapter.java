package com.lihang.databindingstu.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.lihang.databindingstu.R;
import com.lihang.databindingstu.databinding.ItemSimpleBinding;
import com.lihang.databindingstu.viewHolder.SimpleHoder;
import com.lihang.nbadapter.BaseAdapter;

/**
 * Created by leo
 * on 2019/9/17.
 */
public class SimpleAdapter extends BaseAdapter<String> {
    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup viewGroup, int viewType) {
        ItemSimpleBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),R.layout.item_simple,viewGroup,false);
        return new SimpleHoder(binding);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        String itemBean = dataList.get(position);
        SimpleHoder simpleHoder = (SimpleHoder) viewHolder;
        simpleHoder.binding.setTitle(itemBean);
        simpleHoder.binding.setDestrition(itemBean+"我就是描述咯");
        Log.e("什么问题", position + "===========");
    }
}
