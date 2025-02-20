create database Utvonalak;

grant all privileges 
on Utvonalak.*
to utvonalak@localhost;

use utvonalak;

create table Utvonalak(
id int not null primary key auto_increment,
length double,
difficulty int(2),
start varchar(100),
destination varchar(100),

);