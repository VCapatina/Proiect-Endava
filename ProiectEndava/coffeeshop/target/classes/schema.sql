DROP TABLE IF EXISTS TBL_CLIENT;
DROP TABLE IF EXISTS TBL_COMANDA;
DROP TABLE IF EXISTS TBL_BAUTURI;
DROP TABLE IF EXISTS TBL_INGREDIENTE;
DROP TABLE IF EXISTS TBL_LEGATURA;

CREATE TABLE TBL_CLIENT (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    total_plata INT NOT NULL);


CREATE TABLE TBL_COMANDA (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            id_client INT NOT NULL,
                            id_bautura INT NOT NULL,
                           FOREIGN KEY (id_client) references TBL_CLIENT(id),
                        FOREIGN KEY (id_bautura) references TBL_BAUTURI(id));

CREATE TABLE TBL_BAUTURI (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             nume VARCHAR(250) NOT NULL,
                             pret INT NOT NULL,
                            custom BOOL NOT NULL);


CREATE TABLE TBL_LEGATURA (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                                id_bautura INT NOT NULL,
                             id_ingrediente INT NOT NULL,
                             FOREIGN KEY (id_bautura) references TBL_BAUTURI(id),
                             FOREIGN KEY (id_ingrediente) references TBL_INGREDIENTE(id) );


CREATE TABLE TBL_INGREDIENTE (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              nume VARCHAR(250) NOT NULL,
                            pret INT NOT NULL,
                               );


