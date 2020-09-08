package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> p = Main.getPerson();

        // Imperative approach
        /*List<Person> females = new ArrayList<>();
        for (Person f:p){
            if(f.getGender().equals("Female")){
                females.add(f);
            }
        }
        for (Person f:females) {
            System.out.println(f.getGender());
        }*/

        // Declarative approach

        // Filter
        List<Person> filtrada = p.stream()
                .filter(person -> person.getGender().equals("Female"))
                .collect(Collectors.toList());
        for (Person f:filtrada) {
            System.out.println(f.getGender());
        }

    }

    private static List<Person> getPerson(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Osvaldo", "Male", 19));
        people.add(new Person("Catalina", "Female", 12));
        return people;
    }

}
