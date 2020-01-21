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
import com.excercise.personapi.model.PersonEntity;
import com.excercise.personapi.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController
{
	@Autowired
    PersonService service;
    
    @GetMapping("/find/{id}")
    public PersonEntity findPersonById(@PathVariable("id") Long id) throws NoDataFoundException {
    	PersonEntity entity = service.getPersonById(id);
        return entity;
    }
    
    @GetMapping
    public List<PersonEntity> listAllPersons() {
        List<PersonEntity> list = (List<PersonEntity>)service.getAllPerson();
        return list;
    }
    
    @PostMapping("/add")
    public Long addPerson(@RequestBody PersonEntity person) {
        Long id = service.addPerson(person);
        return id;
    }
    
    @PostMapping("/update")
    public PersonEntity updatePerson(@RequestBody PersonEntity person) throws NoDataFoundException {
        PersonEntity updated = service.updatePerson(person);
        return updated;
    }
    
    @DeleteMapping("/delete/{id}")
    public HttpStatus deletePerson(@PathVariable("id") Long id) throws NoDataFoundException {
        service.deletePerson(id);
        return HttpStatus.OK;
    }
}
