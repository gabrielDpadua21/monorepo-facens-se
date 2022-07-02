package com.ac1.exercicio3.data;

import com.ac1.exercicio3.model.Courses;

import java.util.ArrayList;

public class CoursesDataset {

    private static ArrayList<Courses> courses;

    public static ArrayList<Courses> getItens(){
        courses = new ArrayList<>();

        return courses;
    }
    public static void addCourse(Courses course){
        courses.add(course);
    }

}
