package com.example.androidquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.androidquiz.activities.AsocijacijeActivity;
import com.example.androidquiz.activities.HomeActivity;
import com.example.androidquiz.activities.KpkActivity;
import com.example.androidquiz.activities.KzzActivity;
import com.example.androidquiz.activities.LoginActivity;
import com.example.androidquiz.activities.MojBrojActivity;
import com.example.androidquiz.activities.ProfileActivity;
import com.example.androidquiz.activities.SkockoActivity;
import com.example.androidquiz.activities.SpojniceActivity;

public class MainActivity extends AppCompatActivity {

    Button loginPageButton;
    Button homepageButton;
    Button profilePageButton;


    Button skockoPageButton;
    Button mojBrojPageButton;
    Button kpkPageButton;

    Button kzzPageButton;
    Button asocijacijePageButton;
    Button spojnicePageButton;

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


        skockoPageButton = findViewById(R.id.activity_main_skockoPageButton);
        mojBrojPageButton = findViewById(R.id.activity_main_mojBrojPageButton);
        kpkPageButton = findViewById(R.id.activity_main_KPKPageButton);

        kzzPageButton = findViewById(R.id.activity_main_kzzPageButton);
        asocijacijePageButton = findViewById(R.id.activity_main_asocijacijePageButton);
        spojnicePageButton = findViewById(R.id.activity_main_spojnicePageButton);


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
        skockoPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SkockoActivity.class);
            startActivity(intent);
        });
        mojBrojPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MojBrojActivity.class);
            startActivity(intent);
        });
        kpkPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, KpkActivity.class);
            startActivity(intent);
        });
        asocijacijePageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AsocijacijeActivity.class);
            startActivity(intent);
        });
        spojnicePageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SpojniceActivity.class);
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