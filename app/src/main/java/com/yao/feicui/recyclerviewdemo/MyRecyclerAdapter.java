package com.yao.feicui.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 16245 on 2016/06/17.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>{
    private List<String>mData;
    private Context mContext;
    private LayoutInflater mInflater;

    public MyRecyclerAdapter(Context context,List<String> data ) {
        mData = data;
        mContext = context;
        mInflater=LayoutInflater.from(mContext);
    }

    //重写onCreateViewHolder方法，返回一个自定义的ViewHolder
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=mInflater.inflate(R.layout.item_home,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }
    //填充onCreateViewHolder方法返回的holder中的控件
    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {
        holder.tv.setText( mData.get(position));
    }

    @Override
    public int getItemCount() {
        Log.d("s", String.valueOf(mData.size()));

        return mData.size();

    }


    class MyViewHolder extends ViewHolder {
        TextView tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv= (TextView) itemView.findViewById(R.id.tv_item);
        }
    }
}
