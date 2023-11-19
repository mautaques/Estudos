create table usuario(
	id int,
	username varchar(50),
	senha varchar(50),
	primary key(id)
);

create sequence id_usuario;

create table artista(
	id int,
	nome varchar(50),
	primary key(id)
);

create sequence id_artista;

create table musica(
	id int,
	id_artista int,
	nome varchar(50),
	arquivo bytea,
	primary key(id)
	foreign key(id_artista) references artista
);

create sequence id_musica;

create table playlist(
	id int,
	id_musica int,
	id_ulog int,
	nome varchar(50),
	foreign key(id_musica) references musica,
	foreign key(id_ulog) references usuario
);

create sequence id_playlist;