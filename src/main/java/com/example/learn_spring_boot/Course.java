package com.example.learn_spring_boot;

public class Course {

    private int courseNumber;

    private String courseName;

    private String courseAuthor;


    public Course(int courseNumber, String courseName, String courseAuthor) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.courseAuthor = courseAuthor;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAuthor() {
        return courseAuthor;
    }

    public void setCourseAuthor(String courseAuthor) {
        this.courseAuthor = courseAuthor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNumber=" + courseNumber +
                ", courseName='" + courseName + '\'' +
                ", courseAuthor='" + courseAuthor + '\'' +
                '}';
    }
}
