package com.zofa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Alldata extends AppCompatActivity {

    Button btn,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alldata);

        btn2 = findViewById(R.id.button2);

        //button 2 change screen onclick
        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(Alldata.this,MainActivity.class);
            startActivity(intent);
        });

    }
}