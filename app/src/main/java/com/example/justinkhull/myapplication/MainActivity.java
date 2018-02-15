package com.example.justinkhull.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.class_schedule);

        Course course;

        ArrayList<Course> courses = new ArrayList<>();

        course = new Course();
        course.setCourseName("Data Structures & Algorithms");
        course.setCourseNumber("CSCI 230");
        course.setProfessor("Dr. McCauley");
        courses.add(course);

        course = new Course();
        course.setCourseName("Intro to Android Programming");
        course.setCourseNumber("CSCI 490");
        course.setProfessor("Dr. Briggs");
        courses.add(course);

        //String[] listItems = {"CSCI 230", "CSCI 490", "CSCI 392", "CITA 280", "MATH 207"};

        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);

        CourseAdapter adapter = new CourseAdapter(this, courses);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Short Click", Toast.LENGTH_SHORT).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Long Click", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
