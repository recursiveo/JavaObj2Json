package com.example.JavaO2Gson.service;

import com.example.JavaO2Gson.model.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Process {

    public String toJson(){
        Person person = new Person();
        person.setFname("John");
        person.setLname("Doe");
        person.setAddress("123 Somewhere Rd");
        person.setAge(27);
        person.setPhone("123-123-1224");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        log.info(gson.toJson(person));
        return gson.toJson(person);
    }

    public String toJavaObj(String jsonStr){

        Gson gson = new Gson();

        Person person = gson.fromJson(jsonStr, Person.class);

        log.info(person.toString());
        System.out.println(person);

        return "Success";

    }
}
