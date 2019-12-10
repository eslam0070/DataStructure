package com.company;

public class Employee {
    private String name;
    private String nationalId;
    private double salary = 1500.0;
    private char gender;
    private int availableVacations;
    private int availablePermissionHours;
    static double deductionPerDay = 85.5;
    static double deductionPerHour = 15.5;
    double actualSalary;

    public Employee() {
        name = "";
        nationalId = "";
        gender = ' ';
        availablePermissionHours = 20;
        availableVacations = 15;
        actualSalary = salary;
    }
    public Employee(String name,String nationalId,char gender) {
        this.name = name;
        this.nationalId = nationalId;
        this.gender = gender;
        availableVacations = 15;
        availablePermissionHours = 20;
        actualSalary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void view(){
        System.out.println("name : "+name);
        System.out.println("national Id : "+nationalId);
        System.out.println("salary : "+salary);
    }
    public void viewDetails(){
        view();
        System.out.println("vacations : "+availableVacations);
        //print other details
    }

    public void takeVacation(int numOfDay){
        availableVacations -= numOfDay;
        if (availableVacations<0){
            calculateActualSalary();
        }

    }

    public void takePermissionHours(int numOfHours){
        availablePermissionHours -= numOfHours;
        if (availablePermissionHours<0){
            calculateActualSalary();
        }
    }

    private double calculateActualSalary() {
        actualSalary = salary;
        if (availableVacations<0){
            actualSalary += (deductionPerDay*availableVacations);
        }else if (availablePermissionHours<0){
            actualSalary += (deductionPerHour*availablePermissionHours);
        }
        return actualSalary;
    }

    public void freeAll(){
        availableVacations = 15;
        availablePermissionHours = 20;
        actualSalary = salary;
    }
}
