create sequence id_pessoa;
create sequence id_endereco;

create table pessoa(
	id int,
	nome varchar(50),
	cpf int,
	telefone int,
	primary key (id)
);

create table endereco(
	id int,
	rua varchar(50),
	numero integer,
	cidade varchar(50),
	id_pessoa integer,
	primary key (id),
	foreign key (id_pessoa) references pessoa
);
