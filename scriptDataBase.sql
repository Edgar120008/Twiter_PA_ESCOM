create database ProyectoParadigmas;

use ProyectoParadigmas;

create table users(
id_users bigint auto_increment,
name_users varchar(50) not null,
nick_name_user varchar(50) not null,
email_users tinytext not null,
password_users tinytext not null,
is_follow boolean default 0,
primary key (id_users)
);

create table messages(
id_message bigint auto_increment,
content_message text not null,
primary key (id_message),
id_user bigint references users(id_users) on update cascade on delete cascade
);