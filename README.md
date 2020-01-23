# Rest API With Spring Boot And H2 Database

Person Rest API With Spring-Boot and In Memory H2 Database

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

Java 1.8
Maven 3


### Installing

1- Clone/Checkout git repository. Or Download it as a zip file and unzip 
2- Open command prompt and reach to root directory where code is checked out
3- Execute mvn install command to build the application
4- Execute mvn spring-boot:run command to start the application


## Running the tests from command line tool

1 - Save Person Record to H2 Database

execute command as below to save person record

curl -d "{\"person\": [{\"first_name\": \"Emran\",\"last_name\": \"Khan\",\"age\": \"35\",\"favourite_colour\": \"Green\",\"hobby\": [\"cricket\", \"volleyball\"]}]}" -H "Content-Type: application/json" http://localhost:9090/persons/save

2- List All Person Records

curl -v localhost:9090/persons/showall

3- Delete Person By Id

curl -X DELETE http://localhost:9090/persons/delete/1

4- Find Person By Id

curl -v localhost:9090/persons/find/2

5- Update Person

curl -d "{\"id\":2,\"first_name\":\"Sara\",\"last_name\": \"Jacob\",\"age\": 35,\"favourite_colour\":\"Blue\",\"hobby\": [\"acting\", \"cooking\"]}" -H "Content-Type: application/json" http://localhost:9090/persons/update


### Accesing Data From H2 DataBase

Open below url from your browser to access H2 Database Console. Leave the password blank and click on connect

http://localhost:9090/h2db 

## Add password to H2DB
To add password change below property in /src/main/resources/application.properties
spring.datasource.password=


## Author

Mohd Emran Khan


