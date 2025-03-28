/*
    Jerarquía de operadores
    1. ()
    2. !
    3. * / %
    4. + -
    5. >= > <= < === !==
    6. || &&
    7. =
*/

let edad = 14;
let tienesAuto = true;
/*
    > < >= <= === !== 
    && || !
*/

/* 
    tienesAuto = false;
    ! tienesAuto === true
      ! false === true 
        true === true
            true
    */

if(edad >= 16 || tienesAuto === true){
    console.log("Ya puedes manejar en tu país.");
}
else{
    console.log("O aún no tienes 16, o aún no tienes auto.");
}

/*
if(edad >= 16){
    console.log("Ya puedes manejar LEGALMENTE en tu país.");

    if(! tienesAuto === true){
        console.log("Ya cumples con los requisitos.");
    }
    else{
        console.log("Sabes, aún necesitas comprarte un auto.");
    }
}
else{
    let aniosParaManejar = 16 - edad;
    console.log("Aún te faltan " + aniosParaManejar + " años para manejar legalmente en tu país.");
}
*/


let esPar = 14;
if(esPar % 2 === 0){
    console.log("Sí es un número par.");
}
else{
    console.log("No es un número par.")
}




