desc customer;
desc transaction;
DESC fixeddepositaccount;

alter table savingsaccount
add foreign key (IFSC) references intereste(IFSC);

alter table fixeddepositaccount
add foreign key (IFSC) references intereste(IFSC);

alter table intereste
rename to interestrate;


alter table savingsaccount
add column savstartdate int not null after balance;

alter table savingsaccount
add column savclosedate int not null after savstartdate;

alter table fixeddepositaccount
add column fdstartdate int not null,
add column fdclosedate int not null after balance;

alter table fixeddepositaccount
drop column fdstartdate, 
drop fdclosedate;

alter table fixeddepositaccount
add column fdstartdate int not null after balance,
add column fdclosedate int not null after fdstartdate;

create table adminlogin(
AdminUsername varchar(20),
AdminPassword varchar(40));

Insert into adminlogin(AdminUsername, Adminpassword)
Values('Admin', 'admin123');

SELECT * FROM minibank.adminlogin;

DESC transaction;

ALTER TABLE fixeddepositaccount
ALTER COLUMN fdstartdate DATE;

alter table savingsaccount
alter column savstartdate datetime;

select mobile from customer where cid=1;
create table login(
username varchar(20),
password varchar(20));

Insert into login (username, password)
values ('admin', 'admin123');