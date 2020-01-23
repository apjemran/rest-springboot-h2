package com.excercise.personapi.service;

import java.util.List;

import com.excercise.personapi.exception.NoDataFoundException;
import com.excercise.personapi.model.Person;
import com.excercise.personapi.model.Persons;

public interface PersonService {
	
	public Person getPersonById(Long id) throws NoDataFoundException;
	
	public List<Person> getAllPerson();
	
	public Person updatePerson(Person entity) throws NoDataFoundException;
	
	public void deletePersonById(Long id) throws NoDataFoundException;

	public void savePersons(Persons persons);
	

}
