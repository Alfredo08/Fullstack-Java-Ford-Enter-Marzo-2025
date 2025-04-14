public class MetodosEstaticos {
    public static void main(String args[]){
        String nombre = "Alex";
        String resultado = MetodosEstaticos.mensaje(nombre);
        String resultado2 = mensaje("Martha");
        System.out.println(resultado);
        System.out.println(resultado2);

        double resultadoSuma = sumaDosNumeros(10.5, 19.5);
        System.out.println(resultadoSuma);
    }

    // Método estático
    public static String mensaje(String nombre){
        return "Bienvenid@ al stack de Java/Spring " + nombre;
    }

    // Método estático
    public static double sumaDosNumeros(double num1, double num2){
        double resultadoSuma = num1 + num2;
        return resultadoSuma;
    }

}
