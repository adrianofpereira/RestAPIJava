package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/country")
public class helloworldcontroller {

    private List<String> countries = new ArrayList<>();

        //CREATE

        //READ
        //readAll
        @GetMapping
        public List<String> getAll() {
            return countries;
        }
        //readSpecific
        //filtering

        //UPDATE - PUT/PATCH

        //DELETE


        @GetMapping("hello")
        public String helloWorld(){
            return "Hello World";
        }


}
