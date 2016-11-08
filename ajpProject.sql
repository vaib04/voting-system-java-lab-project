create database if not exists ajpProject;
connect ajpProject;
create table if not exists users (username varchar(50) primary key, password varchar(20), admin varchar(1) default 'n');
insert into users values ("vaibhav","123","y");
create table if not exists elections (name varchar(30) primary key);
create table if not exists party (name varchar(30) primary key);
create table if not exists voted (voter varchar(50), election varchar(30), primary key(voter,election));
create table if not exists results (election varchar(30), party varchar(30), votes int,primary key(election,party));

