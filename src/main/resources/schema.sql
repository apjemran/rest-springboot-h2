DROP TABLE IF EXISTS PERSONS;
 
CREATE TABLE PERSONS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250),
  age INT DEFAULT NULL,
  favourite_colour VARCHAR(100),
  hobby VARCHAR(250) 
);

INSERT INTO 
	PERSONS (first_name, last_name, age, favourite_colour, hobby) 
VALUES
  	('Emran', 'Khan', 36, 'Blue', 'Cricket,Volleyball'),
  	('Anil', 'Singh', 38, 'Red', 'Reading'),
  	('Jon', 'Doe', 23, 'White', 'Cooking');