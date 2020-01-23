package com.excercise.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excercise.personapi.model.Person;
 
@Repository
public interface PersonRepository 
        extends JpaRepository<Person, Long> {
 
}
