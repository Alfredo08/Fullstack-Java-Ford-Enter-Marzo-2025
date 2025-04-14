import java.util.Date;

public class Aplicacion {
    public static void main(String args []){
        double resultado = MiClaseMath.multiplicar(9.0, 8.0);
        System.out.println("9 x 8 = " + resultado);
        resultado = MiClaseMath.sumar(20.45, 97.54);
        System.out.println("20.45 + 97.54 = " + resultado);

        Date fecha = new Date();
        System.out.println(fecha);
    }
}
