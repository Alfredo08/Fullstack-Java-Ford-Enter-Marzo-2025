
let formularioPerritos = document.querySelector('.info-perritos');

formularioPerritos.addEventListener("submit", function(evento){
    evento.preventDefault();
    let numPerritos = document.querySelector('#num-perritos').value;

    let URL = "https://dog.ceo/api/breeds/image/random/" + numPerritos;
    cargarImagenes(URL);
    console.log("Esto se imprimira al final?");
});

async function cargarImagenes(URL){
    let response = await fetch(URL);
    let datosJSON = await response.json();
    
    let contenedorImagenes = document.querySelector('.imagenes');
    contenedorImagenes.innerHTML = "";
    for(let i = 0; i < datosJSON.message.length; i ++){
        contenedorImagenes.innerHTML += `
            <img class="formato-imagen" src="${datosJSON.message[i]}" alt="Imagen de un perrito">
        `;
    }
}