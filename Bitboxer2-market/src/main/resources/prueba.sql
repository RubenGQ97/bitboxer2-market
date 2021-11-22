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

INSERT INTO usuario (id_usuario,nombre,contrasenia) VALUES (1,'Javiii', 'aa');
INSERT INTO articulo VALUES (1,636,'pruebaArticulo',true,'2021-12-12',50,1);
INSERT INTO proveedor VALUES (1,'Javi', 'España');
INSERT INTO reduccion VALUES (1,'2021-12-14','2021-12-15',5,1);
INSERT INTO proveedor_articulo VALUES (1,1);

CREATE SEQUENCE articulo_id_seq START WITH 1;
CREATE SEQUENCE proveedor_id_seq START WITH 1;
CREATE SEQUENCE reduccion_id_seq START WITH 1;
CREATE SEQUENCE usuario_id_seq START WITH 1;