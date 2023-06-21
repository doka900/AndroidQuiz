package com.example.androidquiz.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidquiz.MainActivity;
import com.example.androidquiz.R;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        androidx.appcompat.widget.Toolbar menubar = findViewById(R.id.menubar);
        setSupportActionBar(menubar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageView play = findViewById(R.id.menubar_playButton);
        ImageView rangList = findViewById(R.id.menubar_ranglistButton);
        ImageView friends = findViewById(R.id.menubar_friendsButton);
        ImageView profile = findViewById(R.id.toolbar_profileButton);
        ImageView logout = findViewById(R.id.toolbar_logoutButton);

        play.setOnClickListener(view -> {
            Intent intent = new Intent(FriendsActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        friends.setOnClickListener(view -> {
            Intent intent = new Intent(FriendsActivity.this, FriendsActivity.class);
            startActivity(intent);
        });
        profile.setOnClickListener(view -> {
            Intent intent = new Intent(FriendsActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
        logout.setOnClickListener(view -> {
            Intent intent = new Intent(FriendsActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}