package com.excercise.personapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excercise.personapi.exception.NoDataFoundException;
import com.excercise.personapi.model.Person;
import com.excercise.personapi.model.Persons;
import com.excercise.personapi.repository.PersonRepository;
 
@Service
public class PersonServiceImpl implements PersonService{
     
    @Autowired
    PersonRepository repository;
   
    public Person getPersonById(Long id) throws NoDataFoundException
    {
        Optional<Person> person = repository.findById(id);         
        if(person.isPresent()) {
            return person.get();
        } else {
            throw new NoDataFoundException("No person found having with id "+id);
        }
    }
    
    public List<Person> getAllPerson()
    {
        List<Person> persons = repository.findAll();         
        if(persons.size() > 0) {
            return persons;
        } else {
            return new ArrayList<Person>();
        }
    }
     
    public Person updatePerson(Person entity) throws NoDataFoundException
    {
        Optional<Person> person = repository.findById(entity.getId());
        if(person.isPresent())
        {
            Person newEntity = person.get();            
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
    
    @Override
	public void savePersons(Persons persons) {
		List<Person> personList = persons.getPerson();
		for (Person person : personList) {
			repository.save(person);
		}
	}   
    
    @Override
    public void deletePersonById(Long id) throws NoDataFoundException
    {
        Optional<Person> person = repository.findById(id);  
        if(person.isPresent())
        {
           repository.deleteById(id);
        } else {
            throw new NoDataFoundException("No person found with id "+ id);
        }
    }
	
	
}