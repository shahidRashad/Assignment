package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.badge.BadgeUtils;

public class Login extends AppCompatActivity {

    String user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = (EditText) findViewById(R.id.user);
        EditText password = (EditText) findViewById(R.id.pswd);
        TextView t1 = (TextView) findViewById(R.id.reg);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
            }
        });

        Button sub = (Button) findViewById(R.id.login);
        Intent intent = getIntent();
        user = intent.getStringExtra("username");
        pass = intent.getStringExtra("password");
        username.setText(user);
        password.setText(pass);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = username.getText().toString();
                String pswd = password.getText().toString();
                if (uname.equals(user)){
                    Intent i = new Intent(getApplicationContext(), List.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}