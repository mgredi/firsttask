package com.task.michal.firsttask.controller;

import com.task.michal.firsttask.dto.Person;
import com.task.michal.firsttask.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/task1")
    public List<Person> task1(List<Person> persons) {
        ArrayList<Person> task1 = new ArrayList<>();

        for (Person p : persons) {

            if (p.getName().equalsIgnoreCase("Janusz") || p.getName().equalsIgnoreCase("Zygmunt")) {
                task1.add(p);


            }

        }

        return task1;
    }




    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public List<Person> prepareData() {
//       TODO stworz 10 obiektów Person

        List<Person> persons = new ArrayList<Person>();
        String[] name = {"Jan", "Michał", "Dachu", "Barbara", "Jan", "Zygmunt", "Franek", "PAweł", "Janusz", "Andrzej"};
        String[] surname = {"Maria", "Jerzy", "Ziom", "Ja", "Wiktoria", "O", "Von", "De", "Sir", "Zero"};
        String[] adress = {"Wrocław", "Wrocław", "Wrocław", "Warszawa", "Gdańsk", "Wrocław", "Poznań", "Wrocław", "Kraków", "Wrocław",};

        int count = 0;
        while (count != name.length) { //TODO zamien na for each, Jak mam przeiterować przez newPerson pętlą foreach jak nie wiem ile nie person mam stworzyć

            Person newPerson = new Person();
            persons.add(newPerson);
            newPerson.setName(name[count]);
            newPerson.setSurname(surname[count]);
            newPerson.setAdress(adress[count]);

          //  System.out.println(newPerson.getName());

            count++;


        }
for (Person x : persons){
    System.out.println(x.getName() + " "+  x.getSurname()+ " " + x.getAdress());

}





        ArrayList <Person> x = isItUnique(persons, "Jan", "Kraków");
        for (Person z: x) {
            System.out.println(z.getName()+ " "+ z.getSurname() + " "+ z.getAdress());

        }
        System.out.println(persons);


        return persons; // czyli to zwraca referencje do danych jak z souta w linijce 51?
    }

    private  ArrayList<Person> isItUnique(List<Person> persons, String name, String adress) {
        ArrayList<Person> newPErsonList = new ArrayList<>();

        for (Person p : persons) {

            if (p.getName().equalsIgnoreCase(name) || p.getAdress().equalsIgnoreCase(adress)) {
                newPErsonList.add(p);


            }

        }

        return newPErsonList;
    }
}



    //        TODO zad1

//      step 1. Create 10 persons and fill random data
//      step 2. task 1 method should return this 10 persons
//      step 3. task 1 method will return only persons witch surname or name are Janusz or Zdzislaw
//      step 4. Result shoul be unique so Janusz or zdzislaw result should be only one in result list
//      step 5. Create a method for filter list by name and surname so Janusz and Zdzislaw won't be hardcoded
//      step 5 Create a Class name Company with params name and adress
//      step 6. Add company class to person Class and fill Data in prepareData method
//      step 7. Add new search param to method for filter list

