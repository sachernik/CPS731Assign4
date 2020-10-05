package com.example.danceclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    /*
    String[] Titles = new String[]{
            "Ballet Beginner",
            "Ballet Intermediate",
            "Ballet Conditioning All-Levels",
            "Jazz Beginner-Intermediate",
            "Tap Intermediate",
            "Salsa Beginner",
            "Salsa Intermediate",
            "Contemporary Intermediate",
            "Contemporary Advanced",
            "Hip Hop All Levels"};
     */
    Context context;
    String[] Titles = new String[10];
    String[] Descriptions = new String[]{
            "The beginner ballet class runs Mondays 5pm - 6pm.",
            "The intermediate ballet class runs Mondays 6pm - 7pm.",
            "The ballet conditioning class runs Saturdays 10am-11am.",
            "The beginner-intermediate jazz class runs Mondays 7pm-9pm.",
            "The intermediate tap class runs Wednesdays 6pm-7pm.",
            "All salsa classes will start running in November 2020, day and time TBD.",
            "All salsa classes will start running in November 2020, day and time TBD.",
            "The intermediate contemporary class runs Tuesdays 6pm-7pm.",
            "The advanced contemporary class runs Tuesdays 7pm-8pm.",
            "The hip hop class runs Thursdays 6pm-7pm and Fridays 5pm-6pm."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        this.Titles = context.getResources().getStringArray(R.array.titles_array);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.setAdapter(new RecyclerViewAdapter(this,Titles,Descriptions));
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}