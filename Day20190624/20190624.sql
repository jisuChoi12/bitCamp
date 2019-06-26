CREATE TABLE STUDENT(
	 no number(3) primary key,
	 age varchar2(100),
	 irum varchar2(100),
	 hakbun varchar2(100)
)
INSERT INTO STUDENT(NO,AGE,IRUM,KAJBUN) values(1,'24','최지수','2014')
SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT
DROP TABLE STUDENT
DELETE FROM STUDENT

CREATE TABLE professor(
	no number(3) primary key,
	age varchar2(100),
	irum varchar2(100),
	subject varchar2(100)
)
INSERT INTO PROFESSOR(NO,AGE,IRUM,SUBJECT) values(1,'56','김교수','자바')
SELECT NO,AGE,IRUM,SUBJECT FROM PROFESSOR
DROP TABLE PROFESSOR

CREATE TABLE MANAGER(
	no number(3) primary key,
	age varchar2(100),
	irum varchar2(100),
	part varchar2(100)
)
INSERT INTO MANAGER(NO,AGE,IRUM,PART) VALUES(1,'60','김관리','개발부')
SELECT NO,AGE,IRUM,PART FROM MANAGER
DROP TABLE MANAGER
