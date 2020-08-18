package com.hezhiheng.recyclerviewpractice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.R;
import com.hezhiheng.recyclerviewpractice.domain.Data;

import java.util.List;

public class SimpleTypeDataAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    public List<Data> dataList;
    public Context mContext;

    public SimpleTypeDataAdapter(Context mContext, List<Data> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
        dataList.remove(0);
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);;
        return new ItemViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        return Data.TYPE_ITEM;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Data data = dataList.get(position);
        if (data != null) {
            holder.titleTextView.setText(data.getTitle());
            holder.descTextView.setText(data.getDescription());
            holder.numberTextView.setText(String.valueOf(data.getNumber()));
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
