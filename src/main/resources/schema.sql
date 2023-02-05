drop table if exists client;
create table client (
id  bigint auto_increment primary key,
name varchar(255)
);

drop table if exists car;
create table car (
id  bigint auto_increment primary key,
brand varchar(255)
);

drop table if exists work_car;
create table work_car (
id  bigint auto_increment primary key,
name varchar(255),
car_id bigint,
client_id bigint,
foreign key (client_id) references client(id),
foreign key (car_id) references car(id)
);
