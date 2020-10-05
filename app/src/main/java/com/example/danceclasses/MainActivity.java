package com.example.danceclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    Context context;
    String[] Titles = new String[10];
    String[] Descriptions = new String[10];
    String[] LongDescs = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        this.Titles = context.getResources().getStringArray(R.array.titles_array);
        this.Descriptions = context.getResources().getStringArray(R.array.descs_array);
        this.LongDescs = context.getResources().getStringArray(R.array.longdescs_array);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.setAdapter(new RecyclerViewAdapter(this,Titles,Descriptions,LongDescs));
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}