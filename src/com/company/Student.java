package com.company;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public boolean addCourseGrade(String name,int grade){
        for(int i=0 ; i<courses.size();i++){
            if (name.equals(courses.get(i))){
                grades.set(i,grade);
                return true;
            }
        }
        courses.add(name);
        grades.add(grade);
        return true;
    }

    public boolean removeCourse(String name){
        for (int i = 0;i<courses.size();i++){
            if (name.equals(courses.get(i))){
                courses.remove(i);
                grades.remove(i);
                return true;
            }
        }
        System.out.println("course not found");
        return false;
    }
}
