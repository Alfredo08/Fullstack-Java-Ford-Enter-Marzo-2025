class ArreglosEstaticos{
    public static void main(String args []){
        String [] nombres = new String[5];
        String [] apellidos = {"González", "López", "Miller", "Gómez", "Anderson"};
        
        nombres[0] = "Ana";
        nombres[1] = "Miguel";
        nombres[2] = "Alex";
        nombres[3] = "Martha";
        nombres[4] = "Roger";
        
        System.out.println(nombres[0] + " " + apellidos[0]);
        System.out.println(nombres[1] + " " + apellidos[1]);
        System.out.println(nombres[2] + " " + apellidos[2]);
        System.out.println(nombres[3] + " " + apellidos[3]);
        System.out.println(nombres[4] + " " + apellidos[4]);

        System.out.println(nombres.length);
    }
}