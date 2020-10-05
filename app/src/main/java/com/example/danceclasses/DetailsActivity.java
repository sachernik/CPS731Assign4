package com.example.danceclasses;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    private static final String TAG = "DetailsActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);
        Log.d(TAG, "onCreate: started");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getIncomingIntent();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getincomingIntent: checking for incoming intents.");

        if (getIntent().hasExtra("title") && getIntent().hasExtra("long_description")) {
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String title = getIntent().getStringExtra("title");
            String long_description = getIntent().getStringExtra("long_description");

            setInfo(title, long_description);
        }
    }

    private void setInfo(String title, String long_description) {
        Log.d(TAG, "setInfo: setting the title and long description to widgets.");

        TextView detTitle = findViewById(R.id.details_title);
        detTitle.setText(title);

        TextView detDesc = findViewById(R.id.details_description);
        detDesc.setText(long_description);

    }

}
