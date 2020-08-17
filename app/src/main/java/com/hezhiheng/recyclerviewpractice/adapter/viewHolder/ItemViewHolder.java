package com.hezhiheng.recyclerviewpractice.adapter.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public TextView headerTextView;
    public TextView titleTextView;
    public TextView numberTextView;
    public TextView descTextView;
    public ImageView avatarImageView;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTextView = itemView.findViewById(R.id.data_title);
        numberTextView = itemView.findViewById(R.id.data_number);
        descTextView = itemView.findViewById(R.id.data_desc);
        headerTextView = itemView.findViewById(R.id.data_header);
        avatarImageView = itemView.findViewById(R.id.data_avatar);
    }
}
