package com.example.JavaO2Gson.controller;


import com.example.JavaO2Gson.service.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private Process process;

    @RequestMapping("/")
    public String home(String obj){

        return process.toJson();
    }

    @RequestMapping("/toObj")
    public String toObj(@RequestBody String jsonStr){

        return process.toJavaObj(jsonStr);
    }

}
