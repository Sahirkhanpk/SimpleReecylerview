package com.example.simplerecylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> list;
    LinearLayoutManager linearLayoutManager;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        mRecyclerView = findViewById(R.id.rcFName);
        mRecyclerView.hasFixedSize();
        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        mRecyclerView.setLayoutManager(linearLayoutManager);


        list.add("sahir");
        list.add("khan");
        list.add("zeeshan");
        list.add("sahir");
        list.add("khan");
        list.add("zeeshan");
        list.add("sahir");
        list.add("khan");
        list.add("zeeshan");
        list.add("sahir");
        list.add("khan");
        list.add("zeeshan");
        list.add("sahir");
        list.add("khan");
        list.add("zeeshan");
        list.add("sahir");
        list.add("khan");
        list.add("zeeshan");
        list.add("zeeshan");
        list.add("sahir");
        list.add("khan");
        list.add("zeeshan");


        MyAdapter myAdapter = new MyAdapter(MainActivity.this,list);
        mRecyclerView.setAdapter(myAdapter);

    }
}
