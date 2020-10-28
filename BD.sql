--Se requiere ejecutar por bloques

--Ejecutar Primero
create database employee

--Segundo
use employee

--Tercero
create table employee(
 id varchar(20) primary key,
 name varchar(30) ,
 lastname varchar(30),
 phone varchar(15),
 email varchar(40),
 id_boss varchar(20) foreign key (id_boss) references employee (id)
)

--Cuarto
insert into employee
values ('101010','Juan','Castro','350376544','jp@gmail.com','101010')

insert into employee
values ('111112','Jose','Montoya','344157874','jose@gmail.com','101010')


