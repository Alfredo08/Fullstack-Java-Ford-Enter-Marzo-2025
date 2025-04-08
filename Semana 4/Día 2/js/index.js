
async function cargarDetalle(urlDetalle){
    let response = await fetch(urlDetalle);
    let datosJSON = await response.json();
    console.log(datosJSON);
    let detalle = document.querySelector('.detalle');

    let tipos = "";

    for(let i = 0; i < datosJSON.types.length; i ++){
        tipos += `<li> ${datosJSON.types[i].type.name} </li>`;
    }

    detalle.innerHTML = `
        <h2> ${datosJSON.name} </h2>
        <img src="${datosJSON.sprites.other.dream_world.front_default}" alt="${datosJSON.name}" >
        <ul>
            ${tipos}
        </ul>
    `;
    console.log();
}

async function cargarListaInicial(){
    const URL = "https://pokeapi.co/api/v2/pokemon?limit=100";
    let response = await fetch(URL);
    let datosJSON = await response.json();
    
    let lista = document.querySelector('.lista');

    for(let i = 0; i < datosJSON.results.length; i ++){
        lista.innerHTML += `<button onclick="cargarDetalle('${datosJSON.results[i].url}')" class="nombre-pokemon"> 
                                ${datosJSON.results[i].name} 
                            </button>`;
    }
}

cargarListaInicial();