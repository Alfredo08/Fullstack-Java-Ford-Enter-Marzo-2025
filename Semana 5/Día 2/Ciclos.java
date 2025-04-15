import java.util.ArrayList;

public class Ciclos {
    public static void main(String args[]){
        /*
        for(int i = 1; i <= 10; i ++){
            System.out.println(i);
        }

        double [] calificaciones = {9.8, 8.9, 10.0, 7.6};

        for(int i = 0; i < calificaciones.length; i ++){
            System.out.println(calificaciones[i]);
        }
            */

        ArrayList<String> nombres = new ArrayList<String>();
       
        nombres.add("Alejandro Miller");
        nombres.add("Martha Gómez");
        nombres.add("Roger Anderson");
        nombres.add("Ana López");

        for(int i = 0; i < nombres.size(); i ++){
            System.out.println(nombres.get(i));
        }
        
        System.out.println("--------");
        
        for(String nombre : nombres){
            System.out.println(nombre);
        }
    }
}
