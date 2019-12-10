package com.company;

public class Teacher extends Person {

    int numOfCourses;
    String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        numOfCourses = 0;
        courses = new String[10];
    }

    public boolean addCourse(String courseName){
        if (numOfCourses == courses.length){
            System.out.println("error courses is full");
            return false;
        }
        for (int i = 0; i< numOfCourses; i++){
            if (courseName.equals(courses[i])){
                System.out.println("course already added before");
                return false;
            }
        }
        courses[numOfCourses] = courseName;
        numOfCourses++;
        return true;
    }

    public boolean removeCourse(String name){
        if (numOfCourses ==0){
            System.out.println("error curses is empty");
            return false;
        }
        int index = search(name);
        if (index==-1){
            System.out.println("error course not found");
            return false;
        }
        for (int i=index;index< numOfCourses-1;i++)
            courses[i]=courses[i+1];
        numOfCourses-=1;
        return true;
    }

    public int search(String name){
        for (int i=0;i<numOfCourses;i++){
            if (name.equals(courses[i]))
                return i;
        }
        return -1;
    }
}
