drop table orders;
create table customers 
(c_id number(8),c_name varchar(45),city varchar(45),email varchar(45),phonno varchar(45),
constraint cid_pk primary key(c_id));

create table orders(o_id int,o_date date);
create table products(p_id int,p_name varchar(45),descrip varchar(45),price int);
desc customers;
desc orders;
desc products;
alter table orders add constraint oid_pk primary key(o_id);
insert into customers values(1,'Ramya','chennai','ramya01.com','9840174851');
insert into customers values(2,'senthil','salem','senthil02.com','7708367083');
insert into customers values(3,'malar','karur','malar04.com','9994909306');
insert into customers values(4,'ashok','salem','ashok05@gmail.com','9843940602');
insert into customers values(5,'rani','trichy','rani@gmail.com','9790267083');
update customers set email='malar03@gmail.com' where email='malar04.com';
select * from customers;
select * from orders;
select * from products;
insert into orders values(1,'05-05-19');
insert into orders values(2,'03-04-20');
insert into orders values(3,'07-08-21');
insert into orders values(4,'08-02-18');
insert into orders values(5,'04-07-23');
insert into products values(1,'kurtas','anarkali ethnic wear',1200);
insert into products values(2,'leggins',350);
insert into products values(3,'t-shirt',500);
insert into products values(4,'saree',2000);
insert into products values(5,'patiyala',1500);
alter table products drop column descrip;

alter table products rename column  p_name to pro_name;
savepoint s1;
alter table products modify (pro_name varchar(40));
alter table products add c_id int;

---*********constraint*******------
alter table products add constraint pk_pid primary key(p_id);
alter table products add constraint  cid_fk foreign key(c_id) references customers(c_id) on delete set null;
desc customers;
desc orders;
desc products;
select * from customers;
select * from orders;
select * from products;
alter table products add constraint price_uni unique(price);
insert into products values(6,'jeans',1600,1);
alter table orders modify o_id not null;
alter table products modify pro_name default 'A';
alter table products modify price  default 0;
insert into products (p_id,pro_name)values(7,'pen');
update products set p_id=nvl(p_id,0);
update products set c_id=nvl(c_id,0);
alter table products add constraint p_c check (p_id>0);
