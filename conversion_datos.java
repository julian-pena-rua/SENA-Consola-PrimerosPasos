public class conversion_datos {
    public static void main(String args[]) {
        ///////////////////////////////////////
        // Convirtiendo Tipos de Datos y Conversión de Tipos
        ///////////////////////////////////////
        // Convirtiendo datos
        
        // Convertir String a Integer
        int suma = 123 + Integer.parseInt("123");//retorna una versión entera de "123"
        System.out.println(suma);
        
        // Convertir Integer a String
        String concatenar = "Avenida siempre viva - " + Integer.toString(123);//retorna una versión string de 123
        System.out.println(concatenar);
        
    }
}