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

public class login extends AppCompatActivity {

    EditText correo, contra;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        correo = findViewById(R.id.email);
        contra = findViewById(R.id.pass);
    }

    public void SignIn(View view) {
        Intent dash = new Intent(this, dashboard.class);
        String mail = correo.getText().toString();
        String pass = contra.getText().toString();
        Toast.makeText(getApplicationContext(),mail+pass,Toast.LENGTH_LONG).show();
        mAuth.signInWithEmailAndPassword(mail, pass)
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Authentication success.",Toast.LENGTH_SHORT).show();
                        startActivity(dash);
                    } else {
                        Toast.makeText(getApplicationContext(), "Authentication failed.",Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }

}