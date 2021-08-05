package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);

        TextView testerTextView = findViewById(R.id.testerTextView);

        Intent intent = getIntent();

        String userid = intent.getStringExtra("id");
        testerTextView.setText(userid);

    }
}