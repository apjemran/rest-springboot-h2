package com.excercise.personapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excercise.personapi.exception.NoDataFoundException;
import com.excercise.personapi.model.PersonEntity;
import com.excercise.personapi.repository.PersonRepository;
 
@Service
public class PersonServiceImpl implements PersonService{
     
    @Autowired
    PersonRepository repository;
   
    public PersonEntity getPersonById(Long id) throws NoDataFoundException
    {
        Optional<PersonEntity> person = repository.findById(id);         
        if(person.isPresent()) {
            return person.get();
        } else {
            throw new NoDataFoundException("No person found having with id "+id);
        }
    }
    
    public List<PersonEntity> getAllPerson()
    {
        List<PersonEntity> persons = repository.findAll();         
        if(persons.size() > 0) {
            return persons;
        } else {
            return new ArrayList<PersonEntity>();
        }
    }
     
    public PersonEntity updatePerson(PersonEntity entity) throws NoDataFoundException
    {
        Optional<PersonEntity> employee = repository.findById(entity.getId());
         
        if(employee.isPresent())
        {
            PersonEntity newEntity = employee.get();            
            newEntity.setFirstName(entity.getFirstName());
            newEntity.setLastName(entity.getLastName());
            newEntity.setAge(entity.getAge());
            newEntity.setFavouriteColour(entity.getFavouriteColour());
            newEntity.setHobby(entity.getHobby());
 
            newEntity = repository.save(newEntity);
             
            return newEntity;
        } else {
        	throw new NoDataFoundException("No record found with given data :"+entity.toString());
        }
    }
    
	public Long addPerson(PersonEntity entity) {
		entity = repository.save(entity);
		return entity.getId();
	}   
     
    public void deletePerson(Long id) throws NoDataFoundException
    {
        Optional<PersonEntity> person = repository.findById(id);
         
        if(person.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new NoDataFoundException("No person found with id "+ id);
        }
    }
}