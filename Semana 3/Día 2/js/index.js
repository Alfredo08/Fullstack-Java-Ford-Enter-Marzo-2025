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