package com.example.androidquiz.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidquiz.R;
import com.example.androidquiz.model.User;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegisterActivity extends AppCompatActivity {

    EditText usernameTxt, passwordTxt, emailTxt, rePasswordTxt;
    Button regButton;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("users/email");

        usernameTxt = findViewById(R.id.activity_register_usernameInput);
        passwordTxt = findViewById(R.id.activity_register_passwordInput);
        rePasswordTxt = findViewById(R.id.activity_register_repPasswordInput);
        emailTxt = findViewById(R.id.activity_register_emailInput);
        regButton = findViewById(R.id.activity_register_registerButton);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                final String username = usernameTxt.getText().toString();
                final String email = passwordTxt.getText().toString();
                final String password = passwordTxt.getText().toString();
                final String rePassword = rePasswordTxt.getText().toString();
                User user = new User(username, password, email);
                if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {

                    Toast.makeText(RegisterActivity.this, "No fields can be empty!", Toast.LENGTH_SHORT).show();

                }else if (!password.equals(rePassword)) {
                    Toast.makeText(RegisterActivity.this, "Passwords must match!", Toast.LENGTH_SHORT).show();
                }else{
                    myRef.addListenerForSingleValueEvent(new ValueEventListener() {

                                                             @Override
                                                             public void onDataChange(@NonNull DataSnapshot snapshot) {
                                                                 if(snapshot.hasChild(email)){

                                                                     Toast.makeText(RegisterActivity.this, "Email is already taken!", Toast.LENGTH_SHORT).show();

                                                                 }
                                                                 else {

                                                                     //sending data to firebase Realtime Database
                                                                     myRef.setValue(email);
                                                                     myRef.child(email).setValue(user);


                                                                     Toast.makeText(RegisterActivity.this, "User registred successfully", Toast.LENGTH_SHORT).show();
                                                                     finish();

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


    }
}

