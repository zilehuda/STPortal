package com.zilay.project.stportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FrontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_layout);
    }

    public void MoveToSRegister(View view) {
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }
}
