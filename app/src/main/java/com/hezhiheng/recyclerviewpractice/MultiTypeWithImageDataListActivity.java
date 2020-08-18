package com.hezhiheng.recyclerviewpractice;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.adapter.MultiTypeDataAdapter;
import com.hezhiheng.recyclerviewpractice.domain.Data;

import java.util.List;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MultiTypeWithImageDataListActivity extends AppCompatActivity {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindDimen(R.dimen.recycler_view_item_space)
    int itemSpace;

    List<Data> dataList;

    static class SpacesItemDecoration extends RecyclerView.ItemDecoration {
        private int space;

        public SpacesItemDecoration(int space) {
            this.space = space;
        }

        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view,
                                   @NonNull RecyclerView parent,
                                   @NonNull RecyclerView.State state) {
            outRect.top = space;
            outRect.bottom = space;
        }
    }

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