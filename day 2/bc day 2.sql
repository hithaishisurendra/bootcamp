show databases;

use bootcamp;

CREATE TABLE Student (
    StudentID int,
    LastName varchar(50),
    FirstName varchar(50),
    Address varchar(255),
    Country varchar(3)
);

DESC Student;

INSERT INTO Student VALUES(04, 'NOLAN', 'CHRISTOPHER', '#212 MARINE DRIVE UK', 'ENG');
INSERT INTO Student VALUES(05, 'CHAZZELE', 'DAMIEN', '#92 CITY DRIVE USA', 'USA');
INSERT INTO Student VALUES(06, 'GERWIG', 'GRETA', '#43 PINK DRIVE IRELAND', 'IRE');

SELECT * FROM STUDENT;
SELECT LastName FROM STUDENT;
SELECT StudentID, LastName, Country FROM STUDENT;

INSERT INTO Student(LastName, FirstName) VALUES ('Ratnam','Mani');
INSERT INTO Student(LastName, FirstName) VALUES ('Shetty','Rishab');
INSERT INTO Student(LastName, FirstName) VALUES ('Scorsese','Martin');

SELECT * FROM STUDENT ORDER BY FirstName;
SELECT * FROM STUDENT ORDER BY FirstName desc;

SELECT MIN(STUDENTID), MAX(STUDENTID),COUNT(STUDENTID) FROM STUDENT;

SELECT UPPER(LASTNAME), LENGTH(LASTNAME) FROM STUDENT;

ALTER TABLE STUDENT ADD BoxOffice int;
INSERT INTO Student(BoxOffice) VALUES (250000.50);
INSERT INTO Student(BoxOffice) VALUES (50000.50);
INSERT INTO Student(BoxOffice) VALUES (150000.50);
INSERT INTO Student(BoxOffice) VALUES (220000.50);
INSERT INTO Student(BoxOffice) VALUES (140000.50);

SELECT * FROM STUDENT;

SELECT LASTNAME, SUM(BOXOFFICE), COUNT(STUDENTID) FROM STUDENT
GROUP BY LASTNAME
ORDER BY COUNT(STUDENTID) DESC;

UPDATE STUDENT SET BOXOFFICE=1000000 WHERE STUDENTID=4;
UPDATE STUDENT SET BOXOFFICE=900000 WHERE STUDENTID=5;
UPDATE STUDENT SET BOXOFFICE=950000 WHERE STUDENTID=6;
UPDATE STUDENT SET BOXOFFICE=900000 WHERE FIRSTNAME="MANI";
UPDATE STUDENT SET BOXOFFICE=900000 WHERE FIRSTNAME="RISHAB";
UPDATE STUDENT SET BOXOFFICE=900000 WHERE FIRSTNAME="MARTIN";
UPDATE STUDENT SET STUDENTID=7 WHERE FIRSTNAME="MANI";
UPDATE STUDENT SET STUDENTID=8 WHERE FIRSTNAME="RISHAB";
UPDATE STUDENT SET STUDENTID=9 WHERE FIRSTNAME="MARTIN";
UPDATE STUDENT SET COUNTRY="IND" WHERE FIRSTNAME="MANI";
UPDATE STUDENT SET COUNTRY="IND" WHERE FIRSTNAME="RISHAB";
UPDATE STUDENT SET COUNTRY="USA" WHERE FIRSTNAME="MARTIN";


SELECT COUNTRY, COUNT(*) FROM STUDENT
GROUP BY COUNTRY
HAVING COUNT(COUNTRY)>1;

SELECT * FROM STUDENT WHERE ADDRESS IS NULL;
SELECT * FROM STUDENT WHERE ADDRESS IS NOT NULL;

SELECT * FROM STUDENT 
WHERE BOXOFFICE >(SELECT BOXOFFICE FROM STUDENT WHERE FIRSTNAME="MARTIN");

SELECT LASTNAME, BOXOFFICE, BOXOFFICE*0.2 AS TAX FROM STUDENT;

SELECT COUNTRY,COUNT(*) FROM STUDENT
GROUP BY COUNTRY
HAVING COUNT(*)>1
ORDER BY COUNT(*) DESC;

SELECT * FROM STUDENT
WHERE BOXOFFICE IN (900000,950000);

SELECT * FROM STUDENT
WHERE BOXOFFICE > ANY(SELECT BOXOFFICE FROM STUDENT WHERE COUNTRY="IRE");

ALTER TABLE Student RENAME TO Directors;


