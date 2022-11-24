package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Animal;
import com.kodilla.spring.basic.spring_configuration.Dog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
public class AnimalFactoryTestSuite {


    @Test
    public void shouldTestCreatedDog(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Dog dog = context.getBean(Dog.class);
        //when
        String voice = dog.getVoice();
        //then
        Assertions.assertEquals("Bark bark",voice);


    }

    @Test
    public void shouldCreateRandomAnimal(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Animal animal = (Animal) context.getBean("randomAnimal");
        //when
        String voice = animal.getVoice();
        //then
        List<String> animalVoices = Arrays.asList("Bark bark","Meow meow","Quack quack");
        Assertions.assertTrue(animalVoices.contains(voice));
    }




}


