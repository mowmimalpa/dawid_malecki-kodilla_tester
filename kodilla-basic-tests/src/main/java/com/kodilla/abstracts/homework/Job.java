package com.kodilla.abstracts.homework;

public  abstract class Job {
    //String firstName;
    int salary;
    //int age;
    String responsibilities;
    //String job;


    public Job(int salary,String responsibilities){
       // this.firstName = name;
        this.salary = salary;
        this.responsibilities = responsibilities;
        //this.age = age;
        //this.job = job;

    }
    public String showResponsibilities(){
        return responsibilities;
    }
    //public String getName(){
        //return firstName;

    //public void setName(String name){
        //this.firstName = name;


    public int getSalary(){
        return salary;

    }
    public String getResponsibilities(){
        return responsibilities;
    }
    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public void setSalary(int salary){
        this.salary = salary;

    }
    //public int getAge(){
        //return age;


    //public void setAge(int age){
    //this.age= age;

    //public String getJob(){
        //return job;


    //public void setJob(String name) {
       // this.job = job;

    public abstract void test();







}
