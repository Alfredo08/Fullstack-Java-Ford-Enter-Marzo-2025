let nombres = ["Ana", "Miguel", "Jorge", "Julieta", "Brenda", "Alejandro"];

/*
console.log(nombres);
console.log(nombres[0]);
console.log(nombres[3]);
nombres[2] = "Roberto";
console.log(nombres);
*/

/*
nombres.unshift("Alfredo");
console.log("Length:", nombres.length);
console.log(nombres);
nombres.shift();
nombres.shift();
console.log("Length:", nombres.length);
console.log(nombres);

nombres.pop();
nombres.pop();
console.log("Length:", nombres.length);
console.log(nombres);
nombres.push("Sofía");
console.log("Length:", nombres.length);
console.log(nombres);
*/

console.log("Length:", nombres.length);
console.log(nombres);

nombres.splice(3, 0, "Alfredo");
console.log("Length:", nombres.length);
console.log(nombres);
nombres.splice(4, 2);
console.log("Length:", nombres.length);
console.log(nombres);
