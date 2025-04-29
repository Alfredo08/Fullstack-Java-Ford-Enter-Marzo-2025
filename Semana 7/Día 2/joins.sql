SELECT *
FROM directores
WHERE nombre LIKE 'Ale%';

SELECT *
FROM directores
LIMIT 2 -- Cuantos renglones a proyectar
OFFSET 2; -- Mostrar los renglones después del que está indicado aquí.

SELECT titulo
FROM peliculas;

SELECT d.nombre, d.apellido, p.titulo, p.descripcion
FROM directores d JOIN peliculas p
	ON d.id = p.id_director;

SELECT directores.nombre, directores.apellido, peliculas.titulo, peliculas.descripcion
FROM peliculas RIGHT JOIN directores
	ON directores.id = peliculas.id_director
ORDER BY directores.nombre DESC;
    
SELECT UPPER(CONCAT(directores.nombre, ' ', directores.apellido)) AS 'Director', COUNT(peliculas.id_director) AS 'Número de películas'
FROM peliculas JOIN directores
	ON directores.id = peliculas.id_director
GROUP BY peliculas.id_director
ORDER BY directores.nombre ASC;