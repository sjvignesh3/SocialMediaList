package com.example.socialmedialist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    String s1[],s2[];
    int img[]={R.drawable.whatsapp,R.drawable.fb,R.drawable.insta,R.drawable.utube,R.drawable.pintrest,R.drawable.twitter,R.drawable.tele};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerview);
        s1=getResources().getStringArray(R.array.Social_Media);
        s1=getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,img);
        recyclerview.setAdapter(myAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
    }
}