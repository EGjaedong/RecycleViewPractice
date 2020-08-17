package com.hezhiheng.recyclerviewpractice.adapter.viewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.hezhiheng.recyclerviewpractice.R;

public class HeaderTypeViewHolder extends ItemTypeViewHolder {
    public TextView headerTextView;

    public HeaderTypeViewHolder(@NonNull View itemView) {
        super(itemView);
        headerTextView = itemView.findViewById(R.id.data_header);
    }
}
