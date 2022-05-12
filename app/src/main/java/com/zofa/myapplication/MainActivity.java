package com.zofa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    DatabaseReference ref;
    EditText name,mail,pass;


    Button btn,btn2,btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.et_name);
        mail = findViewById(R.id.et_mail);
        pass = findViewById(R.id.et_pass);
        btn = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);

        Student member = new Student(name.getText().toString(),mail.getText().toString(),pass.getText().toString());
        String maxid = System.currentTimeMillis()+"" ;
        ref = FirebaseDatabase.getInstance("https://android-data-3da67-default-rtdb.asia-southeast1.firebasedatabase.app").getReference("User");

       //button 1 SEND DATA AND TEST
        btn.setOnClickListener(view -> {

            ref.child(maxid).setValue(member);
            Toast.makeText(MainActivity.this,"inserted",Toast.LENGTH_LONG).show();

        });

        //button 2 change screen onclick
        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Alldata.class);
            startActivity(intent);
        });

        //button 2 change screen onclick
        btn3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        });


    }
}
