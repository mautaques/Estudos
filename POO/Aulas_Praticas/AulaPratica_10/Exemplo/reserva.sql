create table cidade(
	id int,
	nome varchar(50),
	estado varchar(50),
	primary key (id)
);

create sequence id_cidade;

create table cliente(
	id int,
	cpf int,
	nome varchar(50),
	endereco varchar(100),
	telefone int,
	primary key (id)
);

create sequence id_cliente;

create table reserva(
	id int;
	data date,
	hora time,
	preco float,
	classeVoo varchar(10),
	idaEvolta boolean,
	id_ida int,
	id_origem int,
	id_destino int,
	id_cliente int,
	primary key (id),
	foreign key (id_ida) references reserva,
	foreign key (id_origem) references cidade,
	foreign key (id_destino) references cidade,
	foreign key (id_cliente) references cliente,
);

create sequence id_reserva;

insert into cidade(select nextval('id_cidade'),'Joinville','SC');
insert into cidade(select nextval('id_cidade'),'Florianopolis','SC');
insert into cidade(select nextval('id_cidade'),'Curitiba','PR');

insert into cliente(select nextval('id_cliente'),11111,'Joao','Rua Joao Colin',213123);

insert into reserva(select nextva('id_reserva'),'2020-06-12','17:00:00','100.00,'Comercial',true,1,2,1,1);
					











