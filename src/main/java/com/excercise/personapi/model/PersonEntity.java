package com.excercise.personapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSONS")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="first_name", nullable=false)
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="age")
    private Integer age;
    
    @Column(name="favourite_colour")
    private String favouriteColour;
    
    @Column(name="hobby")
    private String hobby;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFavouriteColour() {
		return favouriteColour;
	}

	public void setFavouriteColour(String favouriteColour) {
		this.favouriteColour = favouriteColour;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", favouriteColour=" + favouriteColour + ", hobby=" + hobby + "]";
	}
    
    
}