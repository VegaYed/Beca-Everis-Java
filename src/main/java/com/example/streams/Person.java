package com.example.streams;


import lombok.Data;

@Data
public class Person {

    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

}
