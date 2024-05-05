--1
create table ambulatorios(nroa int not null, 
						  andar int not null, 
						  capacidade int not null, 
					      primary key(nroa));

create table medicos(codm serial not null, 
					  nome character varying(40) not null, 
					  idade int not null, 
					  especialidade character varying(20),
					  cpf numeric(11,0), 
					  cidade character varying(30), 
					  nroa int, 
					  primary key(codm), 
					  foreign key(nroa) 
							references public.ambulatorios(nroa) match simple
							on update no action
							on delete no action
) with (oids = false);

create table pacientes(codp serial not null,
					   nome character varying(40) not null,
                       idade int not null,
                       cidade character varying(30),
						cpf numeric(11,0),
						doenca character varying(40),
						primary key(codp));

create table funcionarios(codf serial,
						   nome character varying(40),
						   idade int,
						   cidade character varying(30),
						   cpf numeric(11,0),
						   salario numeric(8,2),
						   cargo character varying(20),
						   primary key(codf));

create table consultas(codm int,
						codp int,
						data date,
						hora time,
						primary key(data),
						foreign key(codm) references medicos(codm) match simple,
						foreign key(codp) references pacientes(codp) match simple);

--2

alter table funcionarios
	add nroa int

--3
--a)
create unique index cpf_index on medicos(cpf)

--b)
create index doenca_index on pacientes(doenca)

--4)
drop index doenca_index on pacientes

--5)
alter table funcionarios
	drop column nroa, drop column cargo

--6)
insert into ambulatorios
	values (1,1,1),
	       (2,1,50),
	       (3,2,40),
	       (4,2,25),
           (5,2,55);

insert into medicos
	values (1,'Joao',40,'ortopedia',10000100000,'Florianópolis',1),
	       (2,'Maria',42,'traumatologia',10000110000,'Blumenau',2),
	       (3,'Pedro',51,'pediatria',11000100000,'São José',2),
	       (4,'Carlos',28,'ortopedia',11000110000,'Joinville',null),
           (5,'Marcia',33,'neurologia',11000111000,'Biguaçu',3);

insert into pacientes
	values (1,'Ana',20,'Florianopólis',20000200000,'gripe'),
		   (2,'Paulo',24,'Palhoça',20000220000,'fratura'),
           (3,'Lucia',30,'Biguaçu',22000200000,'tendinite'),
           (4,'Carlos',28,'Joinville',11000110000,'sarampo');

insert into funcionarios
	values (1,'Rita',32,'São José',1200,20000100000),
		   (2,'Maria',55,'Palhoça',1220,30000110000),
		   (3,'Caio',45,'Florianópolis',1100,41000100000),
		   (4,'Carlos',44,'Florianópolis',1200,51000110000),
		   (5,'Paula',33,'Florianópolis',2500,81000111000);

insert into consultas
	values (1,1,'2006-06-12','14:00'),		
		   (1,4,'2006-06-13','10:00'),
		   (2,1,'2006-06-13','09:00'),
		   (2,2,'2006-06-13','11:00'),
		   (2,3,'2006-06-14','14:00'),
		   (2,4,'2006-06-14','17:00'),
		   (3,1,'2006-06-19','18:00'),
		   (3,3,'2006-06-12','10:00'),
		   (3,4,'2006-06-19','13:00'),
		   (4,4,'2006-06-20','13:00'),
		   (4,4,'2006-06-22','19:30');




























	
