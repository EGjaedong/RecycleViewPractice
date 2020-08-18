package com.hezhiheng.recyclerviewpractice;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.hezhiheng.recyclerviewpractice.domain.Data;

import java.util.List;

import butterknife.BindDimen;

public abstract class AbstractDataListActivity extends AppCompatActivity {
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
}
