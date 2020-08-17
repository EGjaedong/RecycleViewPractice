package com.hezhiheng.recyclerviewpractice.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.R;
import com.hezhiheng.recyclerviewpractice.adapter.viewHolder.ItemViewHolder;
import com.hezhiheng.recyclerviewpractice.domain.Data;

import java.util.List;

public class MultiTypeDataAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    public List<Data> dataList;

    public MultiTypeDataAdapter(List<Data> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case Data.TYPE_HEADER:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header, parent, false);
                return new ItemViewHolder(view);
            case Data.TYPE_ITEM:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
                return new ItemViewHolder(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        switch (dataList.get(position).type) {
            case 0:
                return Data.TYPE_ITEM;
            case 1:
                return Data.TYPE_HEADER;
            default:
                return -1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Data data = dataList.get(position);
        if (data != null) {
            switch (data.getType()) {
                case Data.TYPE_HEADER:
                    holder.headerTextView.setText(data.getTitle());
                    break;
                case Data.TYPE_ITEM:
                    holder.titleTextView.setText(data.getTitle());
                    holder.descTextView.setText(data.getDescription());
                    holder.numberTextView.setText(String.valueOf(data.getNumber()));
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
