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
INSERT INTO articulo VALUES (1,636,'pruebaArticulo',50,true,'2021-12-12',1);
INSERT INTO reduccion VALUES (1,6,'2021-12-14','2021-12-15',1);
INSERT INTO PROVEEDOR_ARTICULO VALUES (1,1);

INSERT INTO usuario (idusuario,nombre,contrasenia) VALUES (2,'Javi2', 'aa');
INSERT INTO proveedor VALUES (2,'Javi2', 'España');
INSERT INTO articulo VALUES (2,637,'pruebaArticulo2',60,true,'2021-12-12',1);
INSERT INTO reduccion VALUES (2,10,'2021-12-14','2021-12-15',2);
INSERT INTO PROVEEDOR_ARTICULO VALUES (2,2)