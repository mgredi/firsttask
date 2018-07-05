package com.task.michal.firsttask;

import com.task.michal.firsttask.controller.PersonController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        PersonController p1 = new PersonController();
        p1.prepareData();
        //SpringApplication.run(Application.class, args);
    }
}
