package com.excercise.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excercise.personapi.model.PersonEntity;
 
@Repository
public interface PersonRepository
        extends JpaRepository<PersonEntity, Long> {
 
}
