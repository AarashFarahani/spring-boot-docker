package com.sarv.controller;

import com.sarv.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @RequestMapping("/person/getData")
    public Person greeting(@RequestParam(value="name", defaultValue="Arash") String name) {
        return new Person(name, "Farahani");
    }
}
