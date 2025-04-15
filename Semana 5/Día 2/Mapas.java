import java.util.HashMap;
import java.util.Set;

public class Mapas {
    public static void main(String args[]){
        HashMap<Integer, String> correos = new HashMap<Integer, String>();

        correos.put(12345, "alejandro@miller.com");
        correos.put(45678, "martha@gomez.com");
        correos.put(23232, "roger@anderson.com");
        correos.put(98765, "ana@lopez.com");
        correos.put(23232, "julieta@vargas.com");

        /*
        System.out.println(correos.get(23232));
        correos.remove(98765);
         */
        Set<Integer> propiedades = correos.keySet();
        for(Integer clave : propiedades){
            System.out.println(correos.get(clave));
        }

    }
}
