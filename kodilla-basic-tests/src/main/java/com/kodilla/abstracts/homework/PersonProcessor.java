package com.kodilla.abstracts.homework;



public class PersonProcessor {


    public void process(Job job) {
        System.out.println(job.getResponsibilities()+ ":" +job.getJob()+"" + "  Imię:" + job.getName());
        job.test();
    }
}