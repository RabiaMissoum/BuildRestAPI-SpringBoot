package com.services;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.model.Person;

@Service 
public class PersonServices {
	
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	public PersonServices() {
	Person p= new Person();
    p.setId("1");
    p.setFirstname("Razan");
    p.setLastname("Alaa");
    p.setAge(6);
    persons.put("1", p);
    
    p= new Person();
    p.setId("2");
    p.setFirstname("Huran");
    p.setLastname("Jan");
    p.setAge(10);
    persons.put("2", p);
    
    }
	
	public Person getPerson(String id) {
		if(persons.containsKey(id)) 
		return persons.get(id);
		else
			return null;
	}
	
	public Hashtable<String, Person> getAll(){
		return persons;
	}
}
