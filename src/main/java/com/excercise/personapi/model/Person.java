package com.excercise.personapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"first_name",
"last_name",
"age",
"favourite_colour",
"hobby"
})

@Entity
@Table(name="PERSON")
public class Person {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@JsonProperty("id")
private Long id;
@JsonProperty("first_name")
@Column(name="first_name", nullable=false)
private String firstName;

@JsonProperty("last_name")
@Column(name="last_name")
private String lastName;
@JsonProperty("age")
@Column(name="age")
private String age;
@JsonProperty("favourite_colour")
@Column(name="favourite_colour")
private String favouriteColour;

@JsonProperty("hobby")
@ElementCollection
private List<String> hobby = new ArrayList<String>();;

/**
* No args constructor for use in serialization
*
*/
public Person() {
}

/**
*
* @param firstName
* @param lastName
* @param favouriteColour
* @param age
* @param hobby
*/
public Person(Long id, String firstName, String lastName, String age, String favouriteColour, List<String> hobby) {
super();
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.age = age;
this.favouriteColour = favouriteColour;
this.hobby = hobby;
}

@JsonProperty("id")
public Long getId() {
	return id;
}
@JsonProperty("id")
public void setId(Long id) {
	this.id = id;
}

@JsonProperty("first_name")
public String getFirstName() {
return firstName;
}

@JsonProperty("first_name")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("last_name")
public String getLastName() {
return lastName;
}

@JsonProperty("last_name")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("age")
public String getAge() {
return age;
}

@JsonProperty("age")
public void setAge(String age) {
this.age = age;
}

@JsonProperty("favourite_colour")
public String getFavouriteColour() {
return favouriteColour;
}

@JsonProperty("favourite_colour")
public void setFavouriteColour(String favouriteColour) {
this.favouriteColour = favouriteColour;
}

@JsonProperty("hobby")
public List<String> getHobby() {
return hobby;
}

@JsonProperty("hobby")
public void setHobby(List<String> hobby) {
this.hobby = hobby;
}

@Override
public String toString() {
	return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
			+ ", favouriteColour=" + favouriteColour + ", hobby=" + hobby + "]";
}


}