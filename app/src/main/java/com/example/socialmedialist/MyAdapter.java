package com.example.socialmedialist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[],data2[];
    int imgs[];
    Context context;
    public MyAdapter(Context con,String s1[],String s2[],int img[]){
        context=con;
        data1=s1;
        data2=s2;
        imgs=img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt1.setText(data1[position]);
        holder.txt2.setText(data2[position]);
        holder.img1.setImageResource(imgs[position]);
    }

//    @Override
//    public void onBindViewHolder(@NonNull MyAdapter holder, int position) {
//
//    }

    @Override
    public int getItemCount() {
        return imgs.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txt1,txt2;
        ImageView img1;
        public MyViewHolder(@NotNull View itemView){
            super(itemView);
            txt1=itemView.findViewById(R.id.socialmedia_txt);
            txt2=itemView.findViewById(R.id.desc_txt);
            img1=itemView.findViewById(R.id.my_imageView);
        }
    }
}
