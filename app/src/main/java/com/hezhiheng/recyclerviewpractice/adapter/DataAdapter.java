package com.hezhiheng.recyclerviewpractice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.R;
import com.hezhiheng.recyclerviewpractice.adapter.viewHolder.TextTypeViewHolder;
import com.hezhiheng.recyclerviewpractice.domain.SimpleTypeData;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<TextTypeViewHolder> {
    private List<SimpleTypeData> simpleTypeDataList;

    public DataAdapter(List<SimpleTypeData> simpleTypeDataList) {
        this.simpleTypeDataList = simpleTypeDataList;
    }

    @NonNull
    @Override
    public TextTypeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View dataView = inflater.inflate(R.layout.item_data, parent, false);
        return new TextTypeViewHolder(dataView);
    }

    @Override
    public void onBindViewHolder(@NonNull TextTypeViewHolder holder, int position) {
        SimpleTypeData simpleTypeData = simpleTypeDataList.get(position);

        TextView titleTextView = holder.titleTextView;
        titleTextView.setText(simpleTypeData.getTitle());
        TextView numberTextView = holder.numberTextView;
        numberTextView.setText(String.valueOf(simpleTypeData.getNumber()));
        TextView descTextView = holder.descTextView;
        descTextView.setText(simpleTypeData.getDescription());
    }

    @Override
    public int getItemCount() {
        return simpleTypeDataList.size();
    }
}
