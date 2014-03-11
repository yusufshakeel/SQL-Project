create table customer
(
id int primary key auto_increment,
firstName char(20) not null,
lastName char(20),
dob datetime,
gender char(1)
);

insert into customer(firstName, lastName, dob, gender) values('Dawood', 'Shakeel', '1995-12-14', 'm');
insert into customer(firstName, dob, gender) values('Sachin', '1995-10-10', 'm');
insert into customer(firstName, lastName, dob, gender) values('Saina', 'Sharma', '1995-12-21', 'f');