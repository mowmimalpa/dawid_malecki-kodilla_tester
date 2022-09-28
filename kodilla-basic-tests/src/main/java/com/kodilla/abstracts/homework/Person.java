package com.kodilla.abstracts.homework;

public  class Person {

     String name;
     int age;
     Job job;




    public Person(String name,int age,Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;

    }
    public void showResponsibilities(){
        System.out.println("Imię:"+name+":"+"Obowiązki:"+job.getResponsibilities());
    }
//






    public Job getJob(){
        return job;
    }
    public void setJob (Job job){
        this.job = job;
    }














}