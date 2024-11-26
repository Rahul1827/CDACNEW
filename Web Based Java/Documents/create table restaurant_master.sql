create table restaurant_master
(rest_id integer primary key,
rest_name varchar(30),
rest_cuisine varchar(20),
rest_branch_count integer
);


insert into restaurant_master values (101, 'McDonalds', 'American',40);
insert into restaurant_master values (102, 'Punjabi Tadka', 'Punjabi',25);
insert into restaurant_master values (103, 'Madras Cafe', 'South Indian',35);
insert into restaurant_master values (104, 'Little Italy', 'Italian',15);
insert into restaurant_master values (105, 'Thai Express', 'Thai',17);

select * from restaurant_master;