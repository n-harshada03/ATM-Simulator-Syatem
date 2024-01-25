create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formNo varchar(20), name varchar(20), fname varchar(20), dob varchar(20), gender varchar(20), email varchar(30), marital_status varchar(20), address varchar(40), city varchar(20), state varchar(25), pincode varchar(20));

show tables;  

select * from signup;

create table signuptwo(formNo varchar(20), religion varchar(20),category varchar(20),income varchar(20),education varchar(20),occupation varchar(20),pan varchar(20),aadhar varchar(20), seniorcitizen varchar(20), existingaccount varchar(20));

select * from signuptwo;

create table signupthree(formNo varchar(20), accountType varchar(40), cardnumber varchar(25), pinnumber varchar(10), facility varchar (100)); 

create table login(formNo varchar(20), cardnumber varchar(25), pinnumber varchar(10));

select * from signupthree;

select * from login;