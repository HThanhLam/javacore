create database test;
use test;

CREATE TABLE Manager (
    id INT PRIMARY KEY AUTO_INCREMENT,
    FullName VARCHAR(30),
    Email VARCHAR(50),
    Password VARCHAR(50),
    ExpInYear TINYINT
    
);
CREATE TABLE Employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    FullName VARCHAR(30),
    Email VARCHAR(50),
    Password VARCHAR(50),
    Projectid INT,
    Proskill VARCHAR(30),
    FOREIGN KEY (Projectid)
        REFERENCES Project (Projectid)
);
CREATE TABLE Project (
    Projectid INT PRIMARY KEY AUTO_INCREMENT,
    teamSize SMALLINT,
    idManager INT,
    idEmployees INT,
    FOREIGN KEY (idManager)
        REFERENCES Manager (idManager),
    FOREIGN KEY (idEmployees)
        REFERENCES Employee (idEmployees)
);