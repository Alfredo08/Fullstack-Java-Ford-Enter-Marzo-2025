function sumarDosNumeros(num1, num2){
    let resultado = num1 + num2;
    return resultado;
}

let sumaUno = sumarDosNumeros(10, 20);
console.log(sumaUno);
let sumaDos = sumarDosNumeros(50, 100);
console.log(sumaDos);
let sumaTotal = sumarDosNumeros(sumaUno, sumaDos);
console.log(sumaTotal);
