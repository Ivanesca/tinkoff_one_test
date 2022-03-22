create table students
(
    id        uuid primary key,
    name      varchar(64) not null,
    age       int     not null,
    time_from int,
    time_to   int
);