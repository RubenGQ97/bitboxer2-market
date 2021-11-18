CREATE TABLE articulo(
	idArticulo INT,
	codigo INT NOT NULL UNIQUE,
	descripcion varchar(50),
	precio numeric NOT NULL ,
	estado boolean DEFAULT true,
	fechaDeCreacion date,
	idUsuario INT NOT NULL,
	idReduccion INT,
	PRIMARY KEY(idArticulo),
	FOREIGN KEY(idUsuario) REFERENCES usuario(idUsuario)

);


CREATE TABLE proveedor(
	idProveedor INT,
	nombre varchar(50) NOT NULL,
	pais	varchar(50) NOT NULL,
	PRIMARY KEY (idProveedor)
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


CREATE TABLE usuario(
	idUsuario	INT,
	nombre varchar(50) NOT NULL,
	contrasenia varchar(50) NOT NULL,
	PRIMARY KEY (idUsuario)
);



CREATE TABLE proveedor_articulo(
	idArticulo INT,
	idProveedor INT,
	PRIMARY KEY (idArticulo,idProveedor),
	FOREIGN KEY(idArticulo) REFERENCES articulo(idArticulo),
	FOREIGN KEY(idProveedor) REFERENCES proveedor(idProveedor)

);


CREATE SEQUENCE articulo_id_seq START WITH 1;
CREATE SEQUENCE proveedor_id_seq START WITH 1;
CREATE SEQUENCE reduccion_id_seq START WITH 1;
CREATE SEQUENCE usuario_id_seq START WITH 1;


