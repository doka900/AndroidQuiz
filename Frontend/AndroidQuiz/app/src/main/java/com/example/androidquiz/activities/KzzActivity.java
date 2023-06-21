package com.example.androidquiz.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidquiz.R;

public class KzzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kzz);

        androidx.appcompat.widget.Toolbar gamebar = findViewById(R.id.gamebar);
        setSupportActionBar(gamebar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        androidx.appcompat.widget.Toolbar resultbar = findViewById(R.id.resultbar);
        setSupportActionBar(resultbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}