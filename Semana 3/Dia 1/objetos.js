let libro = {
    titulo: "El fin del principio",
    capitulos: 12,
    autores: ["Alex Miller", "Martha Gómez", "Roger Anderson"],
    editorial: "Skillnest"
};

let listaLibros = [{
    titulo: "El fin del principio",
    capitulos: 12,
    autores: ["Alex Miller", "Martha Gómez", "Roger Anderson"],
    editorial: "Skillnest"
},
{
    titulo: "El fin del principio 2",
    capitulos: 14 ,
    autores: ["Alex Miller", "Roger Anderson"],
    editorial: "Skillnest"
}];

for(let i = 0; i < listaLibros.length; i ++){
    console.log(listaLibros[i].titulo);
}


/*
for(let i = 0; i < libro.autores.length; i ++){
    console.log(libro.autores[i]);
}

libro.capitulos = 14;
console.log(libro);
*/