DROP TABLE odontologos IF EXISTS;

CREATE TABLE odontologos (
    numeroMatricula VARCHAR(255) PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL
);