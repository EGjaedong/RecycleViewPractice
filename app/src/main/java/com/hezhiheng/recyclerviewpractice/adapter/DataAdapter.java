package com.hezhiheng.recyclerviewpractice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.R;
import com.hezhiheng.recyclerviewpractice.domain.Data;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    @BindView(R.id.data_title)
    TextView titleTextView;
    @BindView(R.id.data_number)
    TextView numberTextView;
    @BindView(R.id.data_desc)
    TextView descTextView;

    private List<Data> dataList;

    public DataAdapter(List<Data> dataList) {
        this.dataList = dataList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView numberTextView;
        public TextView descTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            titleTextView = DataAdapter.this.titleTextView;
            numberTextView = DataAdapter.this.numberTextView;
            descTextView = DataAdapter.this.descTextView;
        }
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View dataView = inflater.inflate(R.layout.item_data, parent, false);
        return new ViewHolder(dataView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Data data = dataList.get(position);

        holder.titleTextView.setText(data.getTitle());
        holder.numberTextView.setText(data.getNumber());
        holder.descTextView.setText(data.getDescription());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
