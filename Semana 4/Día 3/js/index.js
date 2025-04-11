function cerrarSesion(){
    alert("Estás a punto de cerrar sesión. Hasta la próxima");
}

function cambiarFondo(elemento){
    elemento.classList.add('extra');
}

function regresarFondo(elemento){
    elemento.classList.remove('extra');
}

let botonesEliminar = document.querySelectorAll('.cerrar');

for(let i = 0; i < botonesEliminar.length; i ++){
    botonesEliminar[i].addEventListener("click", function(evento){
        evento.target.closest('.card-list-item').remove();
        let numeroDeConexionesPendientes = document.querySelector('#connectionRequestNumber');
        let num = numeroDeConexionesPendientes.textContent;
        num --;
        numeroDeConexionesPendientes.textContent = num;
        /*
        if(num === 0){
            numeroDeConexionesPendientes.remove();
        }*/
    });

}

let activo = false;

function mostrarModal(elemento){
    let modal = document.querySelector('.modal');
    let main = document.querySelector('main');

    let ciudad = document.querySelector('#ciudad').textContent;
    let nombreUsuario = document.querySelector('#nombreUsuario').textContent;
    document.querySelector('#editarCiudad').value = ciudad;
    document.querySelector('#editarNombre').value = nombreUsuario;

    main.classList.add('opacar');
    modal.classList.remove('ocultar');  
    activo = true;
}


function actualizarPerfil(evento){
    evento.preventDefault();
    let nuevaCiudad = document.querySelector('#editarCiudad').value;
    let nuevoNombre = document.querySelector('#editarNombre').value;
    document.querySelector('#ciudad').textContent = nuevaCiudad;
    document.querySelector('#nombreUsuario').textContent = nuevoNombre;

    let modal = document.querySelector('.modal');
    let main = document.querySelector('main');
    main.classList.remove('opacar');
    modal.classList.add('ocultar');  
}

function cerrarModal(elemento){
    let modal = document.querySelector('.modal');
    let main = document.querySelector('main');

    if(activo){
        main.classList.remove('opacar');
        modal.classList.add('ocultar');  
    }
}