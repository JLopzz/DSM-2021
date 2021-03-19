package com.local.guia7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStart() {
        super.onStart();
        Intent dash = new Intent(this, dashboard.class);
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            startActivity(dash);
        }
    }


    public void goLogIn(View view) {
        Intent logIn = new Intent(this, login.class);
        startActivity(logIn);
    }

    public void goSignUn(View view) {
        Intent signUp = new Intent(this, registry.class);
        startActivity(signUp);
    }
}