package com.hezhiheng.recyclerviewpractice.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.R;
import com.hezhiheng.recyclerviewpractice.adapter.viewHolder.HeaderTypeViewHolder;
import com.hezhiheng.recyclerviewpractice.adapter.viewHolder.ItemTypeViewHolder;
import com.hezhiheng.recyclerviewpractice.domain.MultiTypeData;

import java.util.List;

public class MultiTypeDataAdapter extends RecyclerView.Adapter {
    public List<MultiTypeData> multiTypeDataList;

    public MultiTypeDataAdapter(List<MultiTypeData> multiTypeDataList) {
        this.multiTypeDataList = multiTypeDataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case MultiTypeData.TYPE_HEADER:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header, parent, false);
                return new HeaderTypeViewHolder(view);
            case MultiTypeData.TYPE_ITEM:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
                return new ItemTypeViewHolder(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        switch (multiTypeDataList.get(position).type) {
            case 0:
                return MultiTypeData.TYPE_ITEM;
            case 1:
                return MultiTypeData.TYPE_HEADER;
            default:
                return -1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MultiTypeData multiTypeData = multiTypeDataList.get(position);
        if (multiTypeData != null) {
            switch (multiTypeData.getType()) {
                case MultiTypeData.TYPE_HEADER:
                    ((HeaderTypeViewHolder) holder).headerTextView.setText(multiTypeData.getTitle());
                    break;
                case MultiTypeData.TYPE_ITEM:
                    ItemTypeViewHolder itemHolder = (ItemTypeViewHolder) holder;
                    itemHolder.titleTextView.setText(multiTypeData.getTitle());
                    itemHolder.descTextView.setText(multiTypeData.getDescription());
                    itemHolder.numberTextView.setText(String.valueOf(multiTypeData.getNumber()));
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return multiTypeDataList.size();
    }
}
