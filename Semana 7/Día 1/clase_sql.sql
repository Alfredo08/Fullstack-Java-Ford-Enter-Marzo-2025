
INSERT INTO directores(nombre, apellido, correo, password)
VALUES ('Alejandro', 'Miller', 'alex@miller.com', 'secreto1234');

INSERT INTO directores(nombre, apellido, correo, password)
VALUES ('Martha', 'Gómez', 'martha@gomez.com', 'secreto1234'),
	   ('Roger', 'Anderson', 'roger@anderson.com', 'secreto1234'),
       ('Alejandro', 'Gutierrez', 'alejandro@gutierrez', 'secreto1234'),
       ('Julieta', 'Vargas', 'julieta@vargas.com', 'secreto1234');
       
INSERT INTO peliculas (titulo, descripcion, fecha, imagen, id_director)
VALUES ('Película 4', 'Muy buena película', '1998-02-20', 'pelicula_4.png', 1);

SELECT *
FROM peliculas;

SELECT *
FROM directores;

SELECT id, nombre, apellido, correo
FROM directores;

SELECT *
FROM directores
WHERE nombre = 'Alex' AND apellido = 'Miller';

SELECT id AS 'Clave', nombre AS 'Nombre', apellido AS 'Apellido', correo
FROM directores;

UPDATE directores
SET correo = 'alejandro@miller.com', password = 'pass1234'
WHERE id = 1;

DELETE FROM directores
WHERE id = 4;