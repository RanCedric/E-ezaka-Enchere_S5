\c postgres;
drop database rencontre;
create database rencontre;
\c rencontre;

create table client(
    client_id serial,
    nom varchar(40),
    sexe int default 0,
    naissance int not null,
    salaire double precision default 0,
    longitude double precision not null,
    poids double precision not null,
    couleur double precision default 0,
    bacc int not null,
    finoana int default 0,
    fiangonana int default 0,
    lettre text,
    primary key (client_id),
    unique(nom,sexe,naissance)
);

CREATE TABLE condition (
    conditionid int unique,
    sexe VARCHAR(255),
    naissance1 VARCHAR(255),
    naissance2 VARCHAR(255),
    naissance3 VARCHAR(255),
    salaire1 VARCHAR(255),
    salaire2 VARCHAR(255),
    salaire3 VARCHAR(255),
    longitude1 VARCHAR(255),
    longitude2 VARCHAR(255),
    longitude3 VARCHAR(255),
    poids1 VARCHAR(255),
    poids2 VARCHAR(255),
    poids3 VARCHAR(255),
    couleur1 VARCHAR(255),
    couleur2 VARCHAR(255),
    couleur3 VARCHAR(255),
    bacc1 VARCHAR(255),
    bacc2 VARCHAR(255),
    bacc3 VARCHAR(255),
    finoana1 VARCHAR(255),
    finoana2 VARCHAR(255),
    fiangonana1 VARCHAR(255),
    fiangonana2 VARCHAR(255),
    fiangonana3 VARCHAR(255),
    note varchar(50)
);

alter table condition
add foreign key (conditionid) references client(client_id);

