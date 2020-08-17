package com.hezhiheng.recyclerviewpractice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.hezhiheng.recyclerviewpractice.R;
import com.hezhiheng.recyclerviewpractice.domain.Data;

import java.util.List;

public class MultiTypeDataAdapter extends RecyclerView.Adapter<MultiTypeDataAdapter.ItemViewHolder> {
    public List<Data> dataList;
    public Context mContext;

    public MultiTypeDataAdapter(Context mContext, List<Data> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
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

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case Data.TYPE_HEADER:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header, parent, false);
                return new ItemViewHolder(view);
            case Data.TYPE_ITEM:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data_with_avatar, parent, false);
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
                    Glide.with(mContext)
                            .load(data.getAvatar())
                            .into(holder.avatarImageView);
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
