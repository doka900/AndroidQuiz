package com.example.androidquiz.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.androidquiz.MainActivity;
import com.example.androidquiz.R;

public class LoginActivity extends AppCompatActivity {

    ImageView profile;
    EditText username;
    EditText password;
    Button loginButton;
    Button registerPageButton;
    Button guestButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        username = findViewById(R.id.activity_login_usernameInput);
        password = findViewById(R.id.activity_login_passwordInput);

        loginButton = findViewById(R.id.activity_login_loginButton);
        registerPageButton = findViewById(R.id.activity_login_registerButton);
        guestButton = findViewById(R.id.activity_login_guestButton);

        loginButton.setOnClickListener(v -> login());

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

    public void login(){
        String usernameString = username.getText().toString();
        String passwordString = password.getText().toString();



    }

}