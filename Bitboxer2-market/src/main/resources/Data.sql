CREATE TABLE proveedor(
	idProveedor INT,
	nombre varchar(50) NOT NULL,
	pais	varchar(50) NOT NULL,
	PRIMARY KEY (idProveedor)
);

CREATE TABLE usuario(
	idUsuario	INT,
	nombre varchar(50) NOT NULL,
	contrasenia varchar(50) NOT NULL,
	PRIMARY KEY (idUsuario)
);

CREATE TABLE articulo(
	idArticulo INT,
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
	idReduccion INT,
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
INSERT INTO articulo VALUES (1,636,'Sofa behsje',true,'2021-12-12',100,1);
INSERT INTO reduccion VALUES (1,'2021-12-14','2021-12-15',6,1);
INSERT INTO PROVEEDOR_ARTICULO VALUES (1,1);

INSERT INTO usuario (idusuario,nombre,contrasenia) VALUES (2,'Alejandro', 'aa');
INSERT INTO proveedor VALUES (2,'Alejandro', 'España');
INSERT INTO articulo VALUES (2,637,'Silla cuerns',true,'2021-12-12',30,1);
INSERT INTO reduccion VALUES (2,'2021-12-14','2021-12-15',10,2);
INSERT INTO PROVEEDOR_ARTICULO VALUES (2,2);

INSERT INTO usuario (idusuario,nombre,contrasenia) VALUES (3,'Ruben', 'aa');
INSERT INTO proveedor VALUES (3,'Ruben', 'España');
INSERT INTO articulo VALUES (3,638,'Botella Ronaldo',true,'2021-12-12',60,1);
INSERT INTO PROVEEDOR_ARTICULO VALUES (1,3);

INSERT INTO usuario (idusuario,nombre,contrasenia) VALUES (4,'Raul', 'aa');
INSERT INTO proveedor VALUES (4,'Raul', 'España');
INSERT INTO articulo VALUES (4,639,'alfombreDoBanio',true,'2021-12-12',10,1);
INSERT INTO PROVEEDOR_ARTICULO VALUES (1,4);


INSERT INTO articulo VALUES (5,640,'EspejoEspejito',true,'2021-12-12',35,2);
INSERT INTO articulo VALUES (6,641,'Banco de Spain',true,'2021-12-12',20,1);
INSERT INTO articulo VALUES (7,642,'Bombilla Gaming',true,'2021-12-12',8,3);
INSERT INTO articulo VALUES (8,643,'Escritorio escrito',true,'2021-12-12',120,1);
INSERT INTO articulo VALUES (9,644,'Melocar goalhombro',true,'2021-12-12',66,3);
INSERT INTO articulo VALUES (10,645,'Ikeago mininio',true,'2021-12-12',636,1);
INSERT INTO articulo VALUES (11,646,'zizu',true,'2021-12-12',10000,2);
INSERT INTO PROVEEDOR_ARTICULO VALUES (1,2);