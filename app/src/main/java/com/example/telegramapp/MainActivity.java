package com.example.telegramapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvList;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList = findViewById(R.id.rv_list);
        List<ChatModel> list = new ArrayList<>();
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"name","hello",true ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"name","hello",true ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"adilet","hey",true ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"name","hello",true ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"name","hello",true ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"name","hello",true ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"name","hello",true ));

        rvList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this, list);
        rvList.setAdapter(adapter);



    }
}