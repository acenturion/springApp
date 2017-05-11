/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  AlejandroThalamus
 * Created: May 9, 2017
 */

create database springNinja;
use springNinja;
drop table curso;
create table curso(
    id int PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(150),
    descripcion varchar(300),
    precio int,
    horas varchar(45)
);

insert into curso VALUES (1,'Spring','Curso de java Spring',150,'7 horas');
insert into curso VALUES (2,'Hibernate','Curso de Framework Hibernate',100,'6 horas');
select * from curso
