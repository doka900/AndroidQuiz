package com.example.androidquiz.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidquiz.MainActivity;
import com.example.androidquiz.R;
import com.example.androidquiz.adapters.FriendAdapter;
import com.example.androidquiz.model.Friend;

import java.util.ArrayList;
import java.util.List;

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
        ImageView friendsButton = findViewById(R.id.menubar_friendsButton);
        ImageView profile = findViewById(R.id.toolbar_profileButton);
        ImageView logout = findViewById(R.id.toolbar_logoutButton);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_friends);

        List<Friend> friends = new ArrayList<Friend>();
        friends.add(new Friend(R.drawable.profile, "Test1", "8", "1"));
        friends.add(new Friend(R.drawable.profile, "Test3", "5", "2"));
        friends.add(new Friend(R.drawable.profile, "Test2", "3", "4"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new FriendAdapter(getApplicationContext(),friends));

        play.setOnClickListener(view -> {
            Intent intent = new Intent(FriendsActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        friendsButton.setOnClickListener(view -> {
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