--1
select nome, cpf from medicos where idade < 40 or especialidade != 'traumatologia'

--2
select * from consultas where data > '2006-06-19' and hora > '12:00' and hora < '18:00'

--3
select * from pacientes where cidade != 'Florianopólis'

--4
select hora from consultas where data < '2006-06-14' or data > '2006-06-20'

--5
select nome, (idade*12) from pacientes

--6
select nome, cidade from funcionarios

--7
select min(salario) as minimo,max(salario) as maximo from funcionarios

--8
select max(hora) as ultima_consulta from consultas where data = '2006-06-13'

--9
select avg(idade) as media_idade, count(nroa) as total_ambulatorios from medicos

--10
select codf, nome, salario - (salario * 0.2) from funcionarios

--11
select nome from funcionarios where nome like '%a'

--12
select nome,cpf from funcionarios where 
	cast(cpf as character varying(11)) not like '%00000' and cast(cpf as character varying(11)) not like '00000%'

--13
select nome,especialidade from medicos where nome like '_o%' and nome like '%o'

--14
select codp, nome from pacientes 
	where idade > 25 and doenca in ('tendinite','fratura','gripe','sarampo')
