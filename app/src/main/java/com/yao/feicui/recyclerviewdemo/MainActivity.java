package com.yao.feicui.recyclerviewdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {
    private RecyclerView mRecyclerView;
    public  List<String> mData;
    private MyRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //设置布局管理器
        mRecyclerView.setLayoutManager(layoutManager);
        //设置垂直布局，这也是默认的
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        initData();
        //设置adapter
       adapter=new MyRecyclerAdapter(MainActivity.this,mData);
        Log.d("a", String.valueOf(mData));
        mRecyclerView.setAdapter(adapter);
        //设置增加或删除的动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    }
    private void initData(){
        mData = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            mData.add("item" + i);
//            Log.d("sss", String.valueOf(mData.size()));
        }
    }
}
