-- base patatas
drop database if exists base_patatas;
create database if not exists base_patatas;
use base_patatas;

-- creacion de tabla
create table if not exists patatas(
	id int(8) primary key auto_increment,
    nombre_variedad varchar(50),
    calibre tinyint(4),
    kg decimal
)engine = innodb;

drop user if exists admin_patatas;
create user 'patata'@'localhost' identified by 'patata';