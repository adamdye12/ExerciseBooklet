/*Create database*/

CREATE DATABSE IF NOT EXISTS pets_db;


/*Creating a table for persons*/

CREATE TABLE person (
personId int AUTO_INCREMENT UNIQUE NOT NULL,
fullName varchar (50),
favouriteColour varchar(200,
birthday DATE,
favouriteNumber int,
catchphrase varchar(100)
);

/*Inserting Adam into person table*/

insert into person (fullName, favouriteColour, birthday, favouriteNumber, catchphrase)
	VALUES ('Adam Dye', 'blue', '1993-02-15',5,'And thats the way the news goes');

/*Inserting James into person table*/

insert into person (fullName, favouriteColour, birthday, favouriteNumber, catchphrase)
	VALUES ('Frank Lionel', 'red', '1995-09-10',7,'4 cans of special brew');

/*Creating a table for pets*/

CREATE TABLE pet (
petId int AUTO_INCREMENT UNIQUE NOT NULL,
primary key (petId),
personId int,
FOREIGN KEY (personId) REFERENCES person(personId) ON DELETE CASCADE,
name varchar (50),
age int,
gender char,
type varchar (30),
breed varchar (50)
);

/*Inserting Rocky into pet table*/

INSERT INTO pet (personId, name, age, gender, type, breed)
	VALUES (
		3,
		'Rocky',
		12,
		'M',
		'Rock',
		'Granite')
		;

/*Inserting Theodore into pet table*/

INSERT INTO pet (personId, name, age, gender, type, breed)
	VALUES (
		1,
		'Theodore',
		4,
		'M',
		'Ferret',
		'Long Tailed')
		;

/*Delete James from person table*/

DELETE FROM person WHERE personId = 2;

/*Update Adam to change favorutie number */

UPDATE person SET favouriteNumber = 2 WHERE personId = 1;

/*select names and favourite colours from person table*/

SELECT fullName, favouriteColour FROM person;

/*	Return all unique pet breeds from the pet table */

SELECT DISTINCT type FROM pet;

/* Return full records of anyone whose favourite number if between 3 and 7 */

SELECT * FROM person WHERE (favouriteNumber >= 3 AND favouriteNumber <= 7);

/* Return the full records of anyone whose name begins with a ‘c’ */

SELECT * FROM person WHERE fullName LIKE 'a%';

/*Return the name and value of their favourite number + 1 from the person table 
with the returned columns called newName and newNo*/

SELECT fullname AS newNane, favouriteNumber +1 AS newNo FROM person;

/*Return the full record of the 5 people with the highest favourite numbers */

SELECT * FROM person ORDER BY favouriteNumber DESC LIMIT 5;

/*Return the name and the first 3 letters of everyone’s favourite colour. 
The first 3 letters of the colour should be capitalised. */

SELECT fullname, UPPER (SUBSTRING(favouriteColour, 1, 3)) FROM person;

/* Return everyone’s name and catchphrase returned as a single output separated by a ‘/’ character. */

SELECT CONCAT (fullname, '/', catchphrase) from person;

/*Return the average of the favourite number column */

SELECT AVG(favouriteNumber) FROM person;

/*Return all details on the oldest pet */

SELECT * FROM pet ORDER BY age DESC LIMIT 1;

/* Return all details on the youngest pet */

SELECT * FROM pet ORDER BY age ASC LIMIT 1;

/* Return how many pets you have records for */

SELECT COUNT(*) FROM pet;

/* Return the total sum of the favourite number column  */

SELECT SUM(favouriteNumber) FROM person;

/* Return the average favourite number of everyone whose favourite colour is blue  */

SELECT AVG(favouriteNumber) FROM person WHERE favouriteColour LIKE "blue";

/* Return the average age for each pet type */

SELECT AVG(age) FROM pet GROUP BY type;

/*Return the people name and pet name of everyone who has a pet*/

SELECT p.fullname as personName, pe.name as petName FROM person p JOIN pet pe ON p.personId = pe.personId;

/*Return the people name of everyone who does not have a pet */
SELECT p.fullname as personName
FROM person p 
LEFT JOIN pet pe 
ON p.personId = pe.personId
WHERE pe.petId is NULL;