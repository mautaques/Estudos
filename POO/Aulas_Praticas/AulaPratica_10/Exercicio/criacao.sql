create sequence id_cidade;

create table animal(
    id int,
    idade int,
    descricao varchar(20),
    primary key (id)
);

create table endereco(
    rua varchar(20),
    numero int,
    cep int,
    cidade varchar(20),
    estado varchar(20),
    pais varchar(20),
    
)

create table tipoAnimal(
    cachorro int,
    gato int,
    passaro int,
    roedor int,
)

create sequence id_pessoa;

create table pessoa(
    id int,
    cpf int,
    nome varchar(20),
    primary key (id)
);

create sequence id_reserva;

create table animais(
    primary key (id),
    foreign key (id) references tipoAnimal,
    foreign key (id) references endereco,
    foreign key (id) references animal,
    foreign key (id) references pessoa
);

