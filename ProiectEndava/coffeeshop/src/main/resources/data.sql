INSERT INTO TBL_CLIENT (name, total_plata) VALUES
('George' ,2),
('Mihai' ,6),
('Alex' ,3);


INSERT INTO TBL_BAUTURI (nume, pret, custom) VALUES
('latte',25,0),
('mocha',12,1),
('lunga cu lapte',7,1);

INSERT INTO TBL_COMANDA(id_client, id_bautura) VALUES
(1,1),
(3,2),
(2,3);

INSERT INTO TBL_INGREDIENTE(nume,pret) VALUES
('cafea',3),
('lapte',2),
('frisca',5);

INSERT INTO TBL_LEGATURA(id_bautura, id_ingrediente) VALUES
(1,1),
(3,2),
(2,3);


