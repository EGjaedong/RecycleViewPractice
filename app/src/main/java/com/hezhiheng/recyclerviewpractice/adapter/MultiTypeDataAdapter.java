package com.hezhiheng.recyclerviewpractice.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.domain.MultiTypeData;

import java.util.List;

public class MultiTypeDataAdapter extends RecyclerView.Adapter {
    public List<MultiTypeData> multiTypeDataList;

    public MultiTypeDataAdapter(List<MultiTypeData> multiTypeDataList){
        this.multiTypeDataList = multiTypeDataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
