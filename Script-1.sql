create database mercado;
use mercado;

select * from account a;
select * from sku s;
select * from account_sku;

create table account_sku(
id int primary key auto_increment,
account_id int,
sku_id int
);

create table account(
id int primary key auto_increment,
nome varchar(100) not null,
document varchar(14)
);

create table sku(
id int primary key auto_increment,
nome varchar(100),
data_criacao date);

insert into sku(nome, data_criacao)values ('maça', now());
insert into account (nome, document) values ('Diego', '504.035.078-39');
insert into account_sku(account_id, sku_id) values (1,1);

ALTER TABLE account_sku  
ADD FOREIGN KEY (account_id) REFERENCES account(id);

ALTER TABLE account_sku  
ADD FOREIGN KEY (sku_id) REFERENCES sku(id);









