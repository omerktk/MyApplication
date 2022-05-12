package com.zofa.myapplication;

public class Student {
    public String stdname;
    public String course;
    public String grade;


    public Student()
    {

    }

    public Student(String stdname, String course, String grade) {
        this.stdname = stdname;
        this.course = course;
        this.grade = grade;
    }


    public String getStdname() {
        return stdname;
    }

    public String getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }
}
