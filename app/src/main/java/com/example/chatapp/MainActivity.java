package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login,signUp;

    FirebaseUser firebaseUser;

    @Override
    protected void onStart() {
        super.onStart();
        //yaha hum dekh rahe hai ki ager koi user phele sai login hai toh firebaseuser mai koi value ayegi jab woh current user mai dhundega
        //aur agar value koi hue usme toh hum seedhe MainAppActivity pai chale jayenge
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        if(firebaseUser != null){
            Intent intent = new Intent(MainActivity.this,MainAppActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        signUp = findViewById(R.id.signUp);

        login.setOnClickListener(this);
        signUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.login){
            Intent intent = new Intent(MainActivity.this,login_activity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.signUp){
            Intent intent = new Intent(MainActivity.this,signIn_activity.class);
            startActivity(intent);
        }
    }
}