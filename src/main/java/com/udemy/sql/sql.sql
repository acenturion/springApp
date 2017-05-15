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
drop database springNinja;
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
insert into user_roles(username,role) VALUES ('user','ROLE_USER');
insert into user_roles(username,role) VALUES ('ale','ROLE_USER');

insert into users values('ale',1,'$2a$10$3vLZ8oYsqNmsK0jHyaFEXOxb0RTjsAipuK7nN.bTjPcdQ1rBaJAJC');
insert into users VALUES ('user',1,'$2a$10$MdEPJ.iGF3p7orJz7AeyA.Q3PwvT9Kp/1bWOoLLUqGYUb7bMj7EjC');

select * from users;
select * from contact;
select * from user_roles;
select * from log;



drop table contact;
