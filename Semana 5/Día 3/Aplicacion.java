import clases.Fraccion;

public class Aplicacion {
    public static void main(String args[]){
        Fraccion fraccion1 = new Fraccion(3,4);
        Fraccion fraccion2 = new Fraccion(3, 8);

        Fraccion resultado = fraccion2.sumaFracciones(fraccion1);
        fraccion1.imprimeFraccion();
        fraccion2.imprimeFraccion();
        resultado.imprimeFraccion();
        
    }
}
