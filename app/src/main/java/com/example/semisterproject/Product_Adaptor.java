package com.example.semisterproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Product_Adaptor extends RecyclerView.Adapter<Product_Adaptor.MyViewHolder> {

    private Context mContext;
    private List<Products> mDatalist;

    public Product_Adaptor(Context mContext, List<Products> mDatalist) {
this.mContext= mContext;
this.mDatalist = mDatalist;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootview = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(rootview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    Products pro = mDatalist.get(position);
holder.textView.setText(pro.getPro_name()+" |  "+pro.getAva_sto()+"  |  "+pro.getPro_s_price()+"  |  "+pro.getPro_p_price());
    }

    @Override
    public int getItemCount() {
        return mDatalist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.textView);
        }
    }
}
