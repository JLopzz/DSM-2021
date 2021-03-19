package com.local.guia7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class registry extends AppCompatActivity {

    private FirebaseAuth mAuth;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);
        mAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.email);
        password = findViewById(R.id.pass);
    }


    public void SignUp(View view) {
        Intent logIn = new Intent(this, login.class);
        String mail = email.getText().toString();
        String pass = password.getText().toString();
        Toast.makeText(getApplicationContext(),"mail+pass",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),mail+pass,Toast.LENGTH_LONG).show();
        mAuth.createUserWithEmailAndPassword(mail, pass)
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Authentication failed.",Toast.LENGTH_SHORT).show();
                        startActivity(logIn);
                    } else {
                        Toast.makeText(getApplicationContext(), "Authentication failed.",Toast.LENGTH_SHORT).show();
//                            updateUI(null);
                    }

                    // ...
                }
            });
    }
}