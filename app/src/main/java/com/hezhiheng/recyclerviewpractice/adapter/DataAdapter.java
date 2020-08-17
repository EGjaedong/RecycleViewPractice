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
import com.hezhiheng.recyclerviewpractice.domain.Data;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<TextTypeViewHolder> {
    private List<Data> dataList;

    public DataAdapter(List<Data> dataList) {
        this.dataList = dataList;
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
        Data data = dataList.get(position);

        TextView titleTextView = holder.titleTextView;
        titleTextView.setText(data.getTitle());
        TextView numberTextView = holder.numberTextView;
        numberTextView.setText(String.valueOf(data.getNumber()));
        TextView descTextView = holder.descTextView;
        descTextView.setText(data.getDescription());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
