package com.zofa.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Alldata extends AppCompatActivity {

    Button btn,btn2;
    ListView lv;

    DatabaseReference ref = FirebaseDatabase.getInstance("https://android-data-3da67-default-rtdb.asia-southeast1.firebasedatabase.app").getReference("User");

    ArrayList<Student> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alldata);
        lv = findViewById(R.id.listalldata);
        fetch();

        btn2 = findViewById(R.id.button2);

        //button 2 change screen onclick
        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(Alldata.this,MainActivity.class);
            startActivity(intent);
        });

    }


    public void fetch(){
        data = new ArrayList<>();

//write data ref / then addvalue / then new space enter

        ValueEventListener valueEventListener = ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot firedata : dataSnapshot.getChildren()) {
                    Student s1 = firedata.getValue(Student.class);
                    data.add(s1);
                }
                fetchdatabase f1 = new fetchdatabase(data, Alldata.this);
                lv.setAdapter(f1);
            }




            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });


    }

}