package com.excercise.personapi.service;

import java.util.List;

import com.excercise.personapi.exception.NoDataFoundException;
import com.excercise.personapi.model.PersonEntity;

public interface PersonService {
	
	public PersonEntity getPersonById(Long id) throws NoDataFoundException;
	
	public List<PersonEntity> getAllPerson();
	
	public PersonEntity updatePerson(PersonEntity entity) throws NoDataFoundException;
	
	public Long addPerson(PersonEntity entity);
	
	public void deletePerson(Long id) throws NoDataFoundException;
	

}
