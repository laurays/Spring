	create table SISTMEMBER(
		id varchar2(50) primary key,
		name varchar2(50) not null,
		pwd varchar2(50) not null,
		email varchar2(50) unique,
		auth number(1) not null
	);