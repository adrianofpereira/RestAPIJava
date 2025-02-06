package com.example.demo.controller;

import com.example.demo.dto.CountryDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/country")
public class helloworldcontroller {

    private List<CountryDto> countries =  new ArrayList<>();



        //CREATE - POST
        @PostMapping
        public CountryDto save (@RequestBody final CountryDto countryDto){
            countries.add(countryDto);
            return countryDto;
        }

        //READ
        //readAll
        @GetMapping
        public List<CountryDto> getAll() {

            return countries;
        }
        //readSpecific
    @GetMapping("/{id}")
        public ResponseEntity<CountryDto> findById(@PathVariable("id") final long id){

            for(var country:countries) {
                if (country.getId() == id) {
                    return ResponseEntity.ok(country);
                }
            }
            return ResponseEntity.notFound().build();
        }
        //filtering

        //UPDATE - PUT/PATCH

        //DELETE


        @GetMapping("hello")
        public String helloWorld(){
            return "Hello World";
        }


}
