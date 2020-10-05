package com.example.danceclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    String[] Titles = new String[]{"Ballet", "Jazz", "Tap", "Salsa", "Contemporary","Hip Hop"};
    String[] Descriptions = new String[]{
            "The beginner ballet class runs Mondays 5pm - 6pm.",
            "The beginner-intermediate jazz class runs Mondays 7pm-9pm.",
            "The intermediate tap class runs Wednesdays 6pm-7pm.",
            "The beginner salsa class will start running in November 2020, day and time TBD.",
            "The intermediate contemporary class runs Tuesdays 6pm-7pm.",
            "The beginner hip hop class runs Thursdays 6pm-7pm and Fridays 5pm-6pm."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.setAdapter(new RecyclerViewAdapter(this,Titles,Descriptions));
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}