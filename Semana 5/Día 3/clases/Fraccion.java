package clases;

public class Fraccion{
    // Atributos
    private int numerador;
    private int denominador;

    // Constructor
    public Fraccion(int num, int den){
        this.numerador = num;
        this.denominador = den;
    }

    // Método instancia
    public void imprimeFraccion(){
        System.out.println(this.numerador + "/" + this.denominador);
    }

    public Fraccion sumaFracciones(Fraccion fraccion2){
        int nuevoNum = this.numerador * fraccion2.getDenominador() + fraccion2.getNumerador() * this.denominador;
        int nuevoDen = this.denominador * fraccion2.getDenominador();
        Fraccion nueva = new Fraccion(nuevoNum, nuevoDen);
        return nueva;
    }


    // Getters y setters
    public int getNumerador(){
        return this.numerador;
    }

    public void setNumerador(int num){
        this.numerador = num;
    }

    public int getDenominador(){
        return this.denominador;
    }

    public void setDenominador(int den){
        this.denominador = den;
    }
}


