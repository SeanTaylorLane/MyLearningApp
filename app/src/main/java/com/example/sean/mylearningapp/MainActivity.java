package com.example.sean.mylearningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.mylearningapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Instead of using an onClickListener I put this method as the onclick attribute of the button
    public void sendMessage(View view) {
        Intent myIntent = new Intent(this, DisplayMessageActivity.class);
        EditText myEditText = (EditText) findViewById(R.id.editText);
        String message = myEditText.getText().toString();
        myIntent.putExtra(EXTRA_MESSAGE, message);
        startActivity(myIntent);
    }
}
