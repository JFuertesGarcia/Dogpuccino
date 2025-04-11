CREATE TABLE clientes
(
    id                 NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre             VARCHAR2(100) NOT NULL,
    apellido1          VARCHAR2(100) NOT NULL,
    apellido2          VARCHAR2(100) NOT NULL,
    tipo_via           VARCHAR2(20) CHECK (tipo_via IN ('Calle', 'Avenida', 'Plaza', 'Pago')) NOT NULL,
    via                VARCHAR2(100) NOT NULL,
    codigo_postal      CHAR(5) NOT NULL,
    ciudad             VARCHAR2(100) NOT NULL,
    provincia          VARCHAR2(100) NOT NULL,
    correo_electronico VARCHAR2(100) NOT NULL UNIQUE,
    fecha_nacimiento   DATE    NOT NULL,
    telefono           CHAR(9) NOT NULL,
    fecha_alta         DATE,
    fecha_modificacion DATE,
    tfno_contacto      VARCHAR2(15) NOT NULL
);

CREATE TABLE protectora_animales
(
    cif                NUMBER PRIMARY KEY,
    nombre             VARCHAR2(100) NOT NULL,
    tipo_via           VARCHAR2(20) CHECK (tipo_via IN ('Calle', 'Avenida', 'Plaza', 'Pago')) NOT NULL,
    via                VARCHAR2(100) NOT NULL,
    codigo_postal      CHAR(5) NOT NULL,
    ciudad             VARCHAR2(100) NOT NULL,
    provincia          VARCHAR2(100) NOT NULL,
    tiktok             VARCHAR2(100),
    instagram          VARCHAR2(100),
    twitter            VARCHAR2(100),
    telefono           CHAR(9) NOT NULL,
    fecha_alta         DATE,
    fecha_modificacion DATE
);

CREATE TABLE usuario
(
    id          NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre      VARCHAR2(100),
    contrasenya VARCHAR2(50),
    id_cliente NUMBER UNIQUE,
    id_protectora NUMBER UNIQUE,
    FOREIGN KEY (id_protectora) REFERENCES protectora_animales (cif),
    FOREIGN KEY (id_cliente) REFERENCES clientes(id),
    CONSTRAINT ck_usuario_exclusivo CHECK (
        (id_cliente IS NOT NULL AND id_protectora IS NULL) OR
        (id_cliente IS NULL AND id_protectora IS NOT NULL))
);

CREATE TABLE patologia
(
    id          NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre      VARCHAR2(100)
);

CREATE TABLE razas
(
    id                 NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre             VARCHAR2(100)
);

CREATE  TABLE perros
(
    id                 NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre             VARCHAR2(100) NOT NULL,
    sexo               VARCHAR2(20) CHECK(sexo IN ('Macho', 'Hembra')) NOT NULL,
    foto               VARCHAR2(100) NOT NULL,
    adoptado           VARCHAR2(2) CHECK(adoptado IN ('Si', 'No')) NOT NULL,
    fecha_nacimiento   DATE   NOT NULL,
    fecha_alta         DATE,
    fecha_modificacion DATE,
    id_protectora      NUMBER NOT NULL,
    id_raza            NUMBER NOT NULL,
    FOREIGN KEY (id_protectora) REFERENCES protectora_animales (cif),
    FOREIGN KEY (id_raza) REFERENCES razas (id)
);

CREATE TABLE perros_patologia
(
    id_perro         NUMBER NOT NULL,
    id_patologia NUMBER NOT NULL,
    descripcion VARCHAR2(200) NOT NULL,
    PRIMARY KEY (id_perro, id_patologia),
    FOREIGN KEY (id_perro) REFERENCES perros (id),
    FOREIGN KEY (id_patologia) REFERENCES patologia (id)
);

CREATE TABLE perros_clientes
(
    id_perro   NUMBER NOT NULL,
    id_cliente NUMBER NOT NULL,
    PRIMARY KEY (id_perro, id_cliente),
    FOREIGN KEY (id_perro) REFERENCES perros (id),
    FOREIGN KEY (id_cliente) REFERENCES clientes (id)
);

CREATE TABLE citas
(
    id         NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    fecha      DATE NOT NULL,
    estado     VARCHAR2(50),
    id_perro   NUMBER NOT NULL,
    id_cliente NUMBER NOT NULL,
    FOREIGN KEY (id_perro) REFERENCES perros (id),
    FOREIGN KEY (id_cliente) REFERENCES clientes (id)
);

CREATE TABLE modifican
(
    id_protectora NUMBER NOT NULL,
    id_citas NUMBER NOT NULL,
    PRIMARY KEY (id_protectora,id_citas),
    FOREIGN KEY (id_protectora) REFERENCES protectora_animales (cif),
    FOREIGN KEY (id_citas) REFERENCES citas (id)
);
/*
drop table clientes;
drop table protectora_animales;
drop table usuario;
drop table patologia;
drop table razas;
drop table perros;
drop table perros_patologia;
drop table perros_clientes;
drop table citas;
drop table modifican;
*/