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
    public List<Person> task1() {
        return task1();
    }

    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
 ///TODO prepareDAta ma tylko przygotowac dane nie ma ich filtrowac ani zmieniac to ma sie zadziac w innej metodzie ktora bedzie zwracac Liste<Person> czyli w metodzie task1 to ona ma zwracac wynik juz pofiltrowany
    public List<Person> prepareData() {
        List<Person> persons = new ArrayList<Person>();
        String[] Name = {"Jan", "Michał", "Dachu", "Barbara", "Jan", "Zygmunt", "Franek", "PAweł", "Janusz", "Andrzej"};
        String[] Surname = {"Maria", "Jerzy", "Ziom", "Ja", "Wiktoria", "O" , "Von", "De", "Sir", "Zero"};
        String[] Adress = {"Wrocław", "Wrocław" , "Wrocław", "Warszawa", "Gdańsk", "Wrocław", "Poznań", "Wrocław","Kraków", "Wrocław",};
        // TODO nazwy zmiennych z malej litery

        for (int i = 0; i < 10; i++) { //TODO zamien na for each
            int count = 0;
            Person newPerson = new Person();
            persons.add(newPerson);
            newPerson.setName(Name[i]);
            newPerson.setSurname(Surname[i]);
            newPerson.setAdress(Adress[i]);
        }
        //TODO nazwy zmiennych powinny byc mowiace co robia
        ArrayList <Person> x = isItUnique(persons, "Jan", "Kraków");
        for (Person z: x) {
            System.out.println(z.getName()+ " "+ z.getSurname() + " "+ z.getAdress());

        }

        return persons;
    }
    //TODO dlaczego publiczna i statyczna?
    public static ArrayList<Person> isItUnique(List<Person> persons, String name, String adress) {
        ArrayList<Person> newPErsonList = new ArrayList<>();

        for (Person p : persons) {

            if (p.getName().equalsIgnoreCase(name) || p.getAdress().equalsIgnoreCase(adress)) {
                newPErsonList.add(p);


            }

        }

        return newPErsonList;//TODO PE
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

