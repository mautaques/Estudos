--1
SELECT m.nome, m.cpf FROM medicos m, pacientes p 
WHERE m.cpf=p.cpf;

--2
SELECT a.nroa, andar FROM ambulatorios a 
JOIN medicos m ON a.nroa=m.nroa AND m.especialidade='ortopedia';

--3
SELECT m.nome, m.idade FROM medicos m 
JOIN consultas c ON m.codm=c.codm 
JOIN pacientes p ON p.codp=c.codp AND p.nome='Ana';

--4
SELECT m1.codm, m1.nome FROM medicos m1 JOIN medicos m2
ON m1.nroa=m2.nroa AND m1.codm!=m2.codm AND m2.nome='Pedro'
JOIN consultas c
ON m1.codm=c.codm AND data='2006-06-14';

--5
SELECT p.nome, p.cpf, p.idade FROM pacientes p JOIN consultas c 
ON p.codp=c.codp JOIN medicos m ON m.codm=c.codm
WHERE especialidade='ortopedia' AND date_part('DAY',data)<16;

--6
SELECT a.*, codm, nome FROM ambulatorios a 
LEFT JOIN medicos m ON a.nroa=m.nroa;

--7
SELECT m.cpf, m.nome, p.cpf, p.nome, data FROM medicos m
LEFT JOIN consultas c ON m.codm=c.codm
LEFT JOIN pacientes p ON c.codp=p.codp;
