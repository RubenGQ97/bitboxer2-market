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

