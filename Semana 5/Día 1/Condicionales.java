public class Condicionales {
    public static void main(String args[]){
        double calificacion = 8.8;
        String nombre1 = new String("Alex");
        String nombre2 = new String("Alex");

        if(calificacion >= 8.0){
            System.out.println("Felicidades aprobaste el examen");
        }
        else{
            System.out.println("Esta vez no has aprobado, éxito en el siguiente intento");
        }

        if(nombre1.equals(nombre2)){
            System.out.println("Sí son iguales");
        }
        else{

            System.out.println("No son iguales");
        }
    }
}
