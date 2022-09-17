package com.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Person;
import com.services.PersonServices;

@RestController
@RequestMapping("person")
public class PersonController {
     @Autowired
	private PersonServices service;
     
     @RequestMapping("/all")
     public Hashtable<String, Person> getHome() {
    	 return service.getAll();
     }
     
     @RequestMapping("{id}")
     public Person getPerson(@PathVariable("id") String id) {
    	 return service.getPerson(id);
     }
}
