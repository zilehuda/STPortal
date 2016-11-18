package com.zilay.project.stportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText un;
    EditText pw;
    String username = "";
    String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        un = (EditText) findViewById(R.id.input_email);
        pw = (EditText) findViewById(R.id.input_password);




    }

    public void LogInSucess(View view) {
        username = un.getText().toString();
        password = pw.getText().toString();
        if(username.equals("demo1") && password.equals("demo1"))
        {
            Intent intent = new Intent(this,MainActivity.class);
            Toast.makeText(LoginActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        else
        {
            Toast.makeText(LoginActivity.this, "Invalid Username Or Password", Toast.LENGTH_SHORT).show();
        }

    }
}
