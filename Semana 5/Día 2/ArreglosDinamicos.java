import java.util.ArrayList;

public class ArreglosDinamicos {
    public static void main(String args[]){
        ArrayList<String> nombres = new ArrayList<String>();
       
        System.out.println(nombres.size());

        nombres.add("Alejandro Miller");
        nombres.add("Martha Gómez");
        nombres.add("Roger Anderson");
        nombres.add("Ana López");
        
        System.out.println(nombres.size());
        
        nombres.remove("Roger Anderson");
        
        System.out.println(nombres.size());
        System.out.println(nombres.get(1));

    }
}
