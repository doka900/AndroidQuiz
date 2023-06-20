package com.example.androidquiz.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.androidquiz.MainActivity;
import com.example.androidquiz.R;
import com.example.androidquiz.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.Tag;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final TextView username = findViewById(R.id.activity_profile_username);
        final TextView email = findViewById(R.id.activity_profile_email);
        final TextView games = findViewById(R.id.activity_profile_games);
        final TextView score = findViewById(R.id.activity_profile_score);
        final RecyclerView history = findViewById(R.id.activity_profile_history);

        DatabaseReference databaseRef = FirebaseDatabase.getInstance().getReference();
        DatabaseReference loggedInRef = databaseRef.child("loggedIn");




        loggedInRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String loggedIn = dataSnapshot.getValue(String.class);
                if (loggedIn != null) {
                    username.setText(loggedIn);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Handle error
            }
        });

        DatabaseReference userInfo = databaseRef.child("users/email");

        userInfo.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User user = dataSnapshot.child(username.getText().toString()).getValue(User.class);
                email.setText(user.getEmail());
                games.setText("0");
                score.setText("0/0");
                }
                                           @Override
                                           public void onCancelled(@NonNull DatabaseError error) {

                                           }
                                       }

        );



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