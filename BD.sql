
create database employee
use employee


create table employee(
 id varchar(20) primary key,
 name varchar(30) ,
 lastname varchar(30),
 phone varchar(15),
 email varchar(40),
 id_boss varchar(20) foreign key (id_boss) references employee (id)
)



