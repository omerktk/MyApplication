package com.zofa.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class fetchdatabase extends BaseAdapter {


    //array with model

    ArrayList<Student> data;

//alt insert to create contractor
Context context;
    public fetchdatabase(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
//write in this
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View root = LayoutInflater.from(context).inflate(R.layout.list_layout1, null);

        TextView stdname = root.findViewById(R.id.textView1);
        TextView course = root.findViewById(R.id.textView1);
        TextView grade = root.findViewById(R.id.textView1);

        stdname.setText(data.get(position).getStdname());
        course.setText(data.get(position).getCourse());
        grade.setText(data.get(position).getGrade());

        return root;
    }
}
