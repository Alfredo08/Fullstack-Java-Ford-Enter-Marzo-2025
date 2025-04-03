
//alert("Cargando Reporte del Clima");

function aceptarCookies(elementoBoton){
    elementoBoton.closest('footer').remove();
}

let ciudades = {
    "Buenos Aires": {
        semana: [{
            imagen: "./../imagenes/nublado.png",
            clima: "Nublado",
            max: "22ºC",
            min: "15ºC"
        },
        {
            imagen: "./../imagenes/lluvioso.png",
            clima: "Lluvioso",
            max: "20ºC",
            min: "13ºC"
        },
        {
            imagen: "./../imagenes/tormenta.png",
            clima: "Tormenta",
            max: "28ºC",
            min: "11ºC"
        },
        {
            imagen: "./../imagenes/nublado.png",
            clima: "Parcialmente nublado",
            max: "21ºC",
            min: "14ºC"
        },
        {
            imagen: "./../imagenes/soleado.png",
            clima: "Soleado",
            max: "24ºC",
            min: "17ºC"
        }
    ]
    },
    "Ciudad de México": {
        semana: [{
            imagen: "./../imagenes/soleado.png",
            clima: "Soleado",
            max: "28ºC",
            min: "19ºC"
        },
        {
            imagen: "./../imagenes/nublado.png",
            clima: "Nublado",
            max: "26ºC",
            min: "18ºC"
        },
        {
            imagen: "./../imagenes/lluvioso.png",
            clima: "Lluvioso",
            max: "24ºC",
            min: "17ºC"
        },
        {
            imagen: "./../imagenes/tormenta.png",
            clima: "Tormenta",
            max: "22ºC",
            min: "16ºC"
        },
        {
            imagen: "./../imagenes/nublado.png",
            clima: "Parcialmente nublado",
            max: "25ºC",
            min: "18ºC"
        }
    ]

    },
    "Santiago": {

    },
    "Sao Paulo": {

    },
    "Quito": {

    }
};

let elementoCiudades = document.querySelectorAll('.ciudad');

for(let i = 0; i < elementoCiudades.length; i ++){
    elementoCiudades[i].addEventListener("click", function(evento){
        let nombreCiudad = evento.target.textContent;
        
        for(let j = 0; j < ciudades[nombreCiudad].semana.length; j ++){
            let imagenClima = document.querySelectorAll('.imagen-clima');
            let clima = document.querySelectorAll('.clima');
            let max = document.querySelectorAll('.max');
            let min = document.querySelectorAll('.min');
            imagenClima[j].src = ciudades[nombreCiudad].semana[j].imagen;
            clima[j].textContent = ciudades[nombreCiudad].semana[j].clima;
            max[j].textContent = ciudades[nombreCiudad].semana[j].max;
            min[j].textContent = ciudades[nombreCiudad].semana[j].min;
        }
        
        document.querySelector('.titulo-ciudad').textContent = nombreCiudad;
    });
}


/*
<img class="imagen-clima" src="./imagenes/nublado.png" alt="Nublado">
<p class="dia-semana"> Hoy </p>
<p class="clima"> Nublado </p>
<div class="temperaturas">
    <p class="max"> 22º C </p>
    <p class="min"> 15º C </p>
</div>
*/