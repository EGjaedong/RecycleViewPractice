package com.hezhiheng.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn_to_simple_type_activity)
    Button btnToSimpleTypeDataListActivity;
    @BindView(R.id.btn_to_multi_type_activity)
    Button btnToMultiTypeDataListActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_to_simple_type_activity)
    public void btnRecyclerViewClick(Button button) {
        switch (button.getId()) {
            case R.id.btn_to_simple_type_activity:
                startActivity(new Intent(MainActivity.this, SimpleTypeDataListActivity.class));
                break;
            case R.id.btn_to_multi_type_activity:
                startActivity(new Intent(MainActivity.this, MultiTypeDataListActivity.class));
                break;
        }
    }
}