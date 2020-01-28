package com.excercise.personapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excercise.personapi.exception.NoDataFoundException;
import com.excercise.personapi.model.Person;
import com.excercise.personapi.model.Persons;
import com.excercise.personapi.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController
{
	@Autowired
    PersonService service;
    
    @GetMapping("/find/{id}")
    public Person findPersonById(@PathVariable("id") Long id) throws NoDataFoundException {
    	Person entity = service.getPersonById(id);
        return entity;
    }
    
    @GetMapping("showall")
    public List<Person> listAllPersons() {
        List<Person> list = (List<Person>)service.getAllPerson();
        return list;
    }
    
    @PostMapping("/save")
    public HttpStatus savePerson(@RequestBody Persons persons) {
    	service.savePersons(persons);
    	return HttpStatus.OK;
    }
        
    @PostMapping("/update")
    public Person updatePerson(@RequestBody Person person) throws NoDataFoundException {
        Person updated = service.updatePerson(person);
        return updated;
    }
    
    @DeleteMapping("/delete/{id}")
    public HttpStatus deletePerson(@PathVariable("id") Long id) throws NoDataFoundException {
        service.deletePersonById(id);
        return HttpStatus.OK;
    }
}
