package com.hezhiheng.recyclerviewpractice;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.adapter.MultiTypeDataAdapter;
import com.hezhiheng.recyclerviewpractice.domain.Data;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MultiTypeWithImageDataListActivity extends AbstractDataListActivity {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_activity);
        ButterKnife.bind(this);

        dataList = Data.createMultiTypeDataList(100);
        MultiTypeDataAdapter multiTypeDataAdapter = new MultiTypeDataAdapter(this, dataList);
        recyclerView.setAdapter(multiTypeDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new SpacesItemDecoration(itemSpace));
    }
}
