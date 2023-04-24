package com.example.androidquiz.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.example.androidquiz.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        androidx.appcompat.widget.Toolbar gamebar = findViewById(R.id.gamebar);
        setSupportActionBar(gamebar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageView play = findViewById(R.id.gamebar_playButton);

        play.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, RegisterActivity.class);
            startActivity(intent);
        });


    }
}