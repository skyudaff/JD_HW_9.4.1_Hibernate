-- changeset skyudaff:1
create table netology.persons
(
    name           varchar(255) not null,
    surname        varchar(255) not null,
    age            int not null ,
    phone_number   varchar(255) not null ,
    city_of_living varchar(255) not null ,
    constraint pk_persons primary key (name, surname, age)
);
-- rollback drop table netology.persons;
