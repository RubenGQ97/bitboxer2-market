DROP TABLE IF EXISTS proveedor_articulo;
DROP TABLE IF EXISTS reduccion;
DROP TABLE IF EXISTS articulo;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS proveedor;

CREATE TABLE proveedor(
	idProveedor SERIAL,
	nombre varchar(50) NOT NULL,
	pais	varchar(50) NOT NULL,
	PRIMARY KEY (idProveedor)
);

CREATE TABLE usuario(
	idUsuario	SERIAL,
	nombre varchar(50) NOT NULL,
	contrasenia varchar(50) NOT NULL,
	PRIMARY KEY (idUsuario)
);

CREATE TABLE articulo(
	idArticulo SERIAL,
	codigo INT NOT NULL UNIQUE,
	descripcion varchar(50),
	precio numeric NOT NULL ,
	estado boolean DEFAULT true,
	fechaDeCreacion date,
	idUsuario INT NOT NULL,
	PRIMARY KEY(idArticulo),
	FOREIGN KEY(idUsuario) REFERENCES usuario(idUsuario)

);

CREATE TABLE reduccion (
	idReduccion SERIAL,
	precio numeric NOT NULL,
	fechaInicio date NOT NULL,
	fechaFin	date NOT NULL,
	idArticulo INT NOT NULL,
	PRIMARY KEY (idReduccion),
	FOREIGN KEY(idArticulo) REFERENCES reduccion(idArticulo)

);

CREATE TABLE proveedor_articulo(
	idArticulo INT,
	idProveedor INT,
	PRIMARY KEY (idArticulo,idProveedor),
	FOREIGN KEY(idArticulo) REFERENCES articulo(idArticulo),
	FOREIGN KEY(idProveedor) REFERENCES proveedor(idProveedor)
);


INSERT INTO usuario (idusuario,nombre,contrasenia) VALUES (1,'Javi', 'aa');
INSERT INTO proveedor VALUES (1,'Javi', 'España');
INSERT INTO articulo VALUES (1,636,'Sofa behsje',100,true,'2021-12-12',1);
INSERT INTO reduccion VALUES (1,6,'2021-12-14','2021-12-15',1);
INSERT INTO PROVEEDOR_ARTICULO VALUES (1,1);

INSERT INTO usuario (idusuario,nombre,contrasenia) VALUES (2,'Alejandro', 'aa');
INSERT INTO proveedor VALUES (2,'Alejandro', 'España');
INSERT INTO articulo VALUES (2,637,'Silla cuerns',30,true,'2021-12-12',1);
INSERT INTO reduccion VALUES (2,10,'2021-12-14','2021-12-15',2);
INSERT INTO PROVEEDOR_ARTICULO VALUES (2,2);

INSERT INTO usuario (idusuario,nombre,contrasenia) VALUES (3,'Ruben', 'aa');
INSERT INTO proveedor VALUES (3,'Ruben', 'España');
INSERT INTO articulo VALUES (3,638,'Botella Ronaldo',60,true,'2021-12-12',1);
INSERT INTO PROVEEDOR_ARTICULO VALUES (1,3);

INSERT INTO usuario (idusuario,nombre,contrasenia) VALUES (4,'Raul', 'aa');
INSERT INTO proveedor VALUES (4,'Raul', 'España');
INSERT INTO articulo VALUES (4,639,'alfombreDoBanio',10,true,'2021-12-12',1);
INSERT INTO PROVEEDOR_ARTICULO VALUES (1,4);


INSERT INTO articulo VALUES (5,640,'EspejoEspejito',35,true,'2021-12-12',1);
INSERT INTO articulo VALUES (6,641,'Banco de Spain',20,true,'2021-12-12',1);
INSERT INTO articulo VALUES (7,642,'Bombilla Gaming',8,true,'2021-12-12',1);
INSERT INTO articulo VALUES (8,643,'Escritorio escrito',120,true,'2021-12-12',1);
INSERT INTO articulo VALUES (9,644,'Melocar goalhombro',66,true,'2021-12-12',1);
INSERT INTO articulo VALUES (10,645,'Ikeago mininio',636,true,'2021-12-12',1);
INSERT INTO PROVEEDOR_ARTICULO VALUES (1,2);