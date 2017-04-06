drop table if exists users;
drop table if exists roles;

create table roles (
	id int auto_increment,
	name varchar(45) not null,
	description varchar(255),
	created_by varchar(45),
    created_on timestamp default now(),
    updated_by varchar(45),
    updated_on timestamp default now(),
    primary key (id)
)

create table role_pages (
	role_id int not null,
	page_id tinyint not null,
	primary key (role_id, page_id)
)
alter table role_pages add constraint fk_role_pages foreign key (role_id) references roles (id);

create table users (
	id int auto_increment,
    username varchar(31) not null,
    email varchar(127) not null,
    password varchar(127) not null,
    status integer not null,
    fullname varchar(45),
    searchable_name varchar(45),
    firstname varchar(15),
    mobile varchar(15),
    photo varchar(127),
    --group_id bigint not null,
    created_by varchar(45),
    created_on timestamp default now(),
    updated_by varchar(45),
    updated_on timestamp default now(),
    primary key (id)
);