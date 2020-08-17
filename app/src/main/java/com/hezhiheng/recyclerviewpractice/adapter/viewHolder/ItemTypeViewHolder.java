package com.hezhiheng.recyclerviewpractice.adapter.viewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.R;

public class ItemTypeViewHolder extends RecyclerView.ViewHolder {
    public TextView titleTextView;
    public TextView numberTextView;
    public TextView descTextView;

    public ItemTypeViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTextView = itemView.findViewById(R.id.data_title);
        numberTextView = itemView.findViewById(R.id.data_number);
        descTextView = itemView.findViewById(R.id.data_desc);
    }
}
