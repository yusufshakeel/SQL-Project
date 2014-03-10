create table cust
(
Cust_id varchar2(3) primary key,
lname varchar2(15),
fname varchar2(15),
area varchar2(2),
phone_no number(8)
);

create table movie
(
mv_no varchar(2) primary key,
title varchar2(25),
type varchar2(10),
star varchar2(25)
);

create table invoice
(
Inv_no varchar2(3) primary key,
Mv_no varchar(2),
Cust_id varchar2(3),
Issue_date date,
Return_date date
);

alter table invoice
add constraint c1
foreign key(cust_id)
references cust(cust_id);

alter table invoice
add constraint c2
foreign key(mv_no)
references movie(mv_no);

alter table cust
modify (lname not null, fname not null);

alter table movie
modify (title not null, type not null);

alter table movie
add price number(8,2);