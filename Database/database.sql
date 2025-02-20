create database Utvonalak;

grant all privileges 
on Utvonalak.*
to Utvonalak@localhost;

use Utvonalak;

create table Utvonalak(
id int not null primary key auto_increment,
length double,
difficulty int check (difficulty between 1 and 10),
start varchar(100),
destination varchar(100)
);