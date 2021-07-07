package com.example.spring2.handlers;

import com.example.spring2.dtos.request.diploma.Course;
import com.example.spring2.dtos.request.diploma.Student;

public class DiplomaHandler {
    public static double average(Student student) {
        double average = 0;
        double sum = 0;
        for(Course course : student.getListCourses()){
            sum += course.getScore();
        }
        average = sum/student.getListCourses().size();
        return average;
    }

    public static String congrats(Student student) {
        double average = average(student);
        if(average> 9){
            return "Congrats!!";
        }else return "";
    }
}
