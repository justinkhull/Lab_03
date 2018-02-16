package com.example.justinkhull.myapplication;

/**
 * Created by justinkhull on 2/15/18.
 */

public class Course {
    private String courseName;
    private String courseNumber;
    private String professor;

    public Course() {}

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
}
