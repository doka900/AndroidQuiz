package com.example.androidquiz.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.example.androidquiz.MainActivity;
import com.example.androidquiz.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        androidx.appcompat.widget.Toolbar gamebar = findViewById(R.id.gamebar);
        setSupportActionBar(gamebar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageView play = findViewById(R.id.gamebar_playButton);
        ImageView rangList = findViewById(R.id.gamebar_ranglistButton);
        ImageView friends = findViewById(R.id.gamebar_friendsButton);
        ImageView profile = findViewById(R.id.toolbar_profileButton);
        ImageView logout = findViewById(R.id.toolbar_logoutButton);

        play.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        profile.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
        logout.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
            startActivity(intent);
        });


    }
}