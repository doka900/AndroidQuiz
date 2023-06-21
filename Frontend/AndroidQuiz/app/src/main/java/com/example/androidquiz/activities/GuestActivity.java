package com.example.androidquiz.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.androidquiz.MainActivity;
import com.example.androidquiz.R;

public class GuestActivity extends AppCompatActivity {

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        loginButton = findViewById(R.id.activity_guest_loginButton);

        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(GuestActivity.this, LoginActivity.class);
            startActivity(intent);
        });

    }
}