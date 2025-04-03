
alert("Cargando Reporte del Clima");

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
elementoCiudades.addEventListener("click", function(evento){
    alert("Le diste click a la ciudad");
});