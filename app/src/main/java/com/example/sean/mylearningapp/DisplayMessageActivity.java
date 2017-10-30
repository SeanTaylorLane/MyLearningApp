package com.example.sean.mylearningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity
        Intent myIntent = getIntent();

        // Get the extra that I want to display
        String message = myIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Get the TextView and set it's text to the myIntent's message
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText(message);
    }
}
