package com.example.androidquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.androidquiz.activities.HomeActivity;
import com.example.androidquiz.activities.KzzActivity;
import com.example.androidquiz.activities.LoginActivity;
import com.example.androidquiz.activities.ProfileActivity;

public class MainActivity extends AppCompatActivity {

    Button loginPageButton;
    Button homepageButton;
    Button profilePageButton;
    Button kzzPageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_main);

        loginPageButton = findViewById(R.id.activity_main_loginPageButton);
        homepageButton = findViewById(R.id.activity_main_homepageButton);
        profilePageButton = findViewById(R.id.activity_main_profilePageButton);
        kzzPageButton = findViewById(R.id.activity_main_kzzPageButton);

        loginPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });
        homepageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        profilePageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
        kzzPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, KzzActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}