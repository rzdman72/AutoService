insert into client (name)
values ('Oleg'),
       ('Petr'),
       ('Ivan');

insert into car (brand)
values ('Audi'),
       ('WV'),
       ('Kia');

insert into work_car (name, car_id, client_id)
values ('TO1 na 15000 km', 1, 1),
       ('TO2 na 30000 km', 1, 2),
       ('Zamena masla', 3, 3);