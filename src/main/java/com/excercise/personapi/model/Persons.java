package com.excercise.personapi.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"person"
})
public class Persons {

@JsonProperty("person")
private List<Person> person = null;

/**
* No args constructor for use in serialization
*
*/
public Persons() {
}

/**
*
* @param person
*/
public Persons(List<Person> person) {
super();
this.person = person;
}

@JsonProperty("person")
public List<Person> getPerson() {
return person;
}

@JsonProperty("person")
public void setPerson(List<Person> person) {
this.person = person;
}

}
