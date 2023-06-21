package com.example.androidquiz.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.androidquiz.MainActivity;
import com.example.androidquiz.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    ImageView profile;
    EditText usernameTxt;
    EditText passwordTxt;
    Button loginButton;
    Button registerPageButton;
    Button guestButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("users/email");

        usernameTxt = findViewById(R.id.activity_login_usernameInput);
        passwordTxt = findViewById(R.id.activity_login_passwordInput);

        loginButton = findViewById(R.id.activity_login_loginButton);
        registerPageButton = findViewById(R.id.activity_login_registerButton);
        guestButton = findViewById(R.id.activity_login_guestButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameTxt.getText().toString();
                String password = passwordTxt.getText().toString();

                if (username.isEmpty() || password.isEmpty()) {

                    Toast.makeText(LoginActivity.this, "Please enter your credentials!", Toast.LENGTH_SHORT).show();
                }
                else{
                    myRef.addListenerForSingleValueEvent(new ValueEventListener() {
                                                             @Override
                                                             public void onDataChange(@NonNull DataSnapshot snapshot) {
                                                                 if(snapshot.hasChild(username)){
                                                                     if(snapshot.child(username).child("password").getValue(String.class).equals(password)){
                                                                         Toast.makeText(LoginActivity.this, "Login Success!", Toast.LENGTH_SHORT).show();
                                                                         startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                                                                         finish();
                                                                     }else{
                                                                         Toast.makeText(LoginActivity.this, "Bad credentials!", Toast.LENGTH_SHORT).show();

                                                                     }
                                                             }else{
                                                                     Toast.makeText(LoginActivity.this, "Bad credentials!", Toast.LENGTH_SHORT).show();

                                                                 }
                                                             }

                                                             @Override
                                                             public void onCancelled(@NonNull DatabaseError error) {

                                                             }
                                                         }
                    );


                }
            }
        });

        registerPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        guestButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, GuestActivity.class);
            startActivity(intent);
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }



}