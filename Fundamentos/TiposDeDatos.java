package Fundamentos;

public class TiposDeDatos{
    public static void main(String[] args) {
        
        // Declaración de variables

        // tipo de dato nombreDeLaVariable = valor de la variable
        int anio = 2025;
        String nombre = "Sammy Pulido";
        char primerLetraNombre = 'S';
        float edad = 22.2f;
        double identificacionNumber = 22.2d;
        boolean esActivo = true;


        
        int valor1 = 2;
        int valor2 = 3;
        int totalSuma = valor1 + valor2;
        int potencia = valor1 * valor1;

        final double PI = 3.1416d; // Para declarar constantes

        System.out.println("Bienvenido al sistema!");
        System.out.println("Hola " + nombre + ". Estamos en " + anio + ". Tu estado en el sistema es: " + esActivo);
        System.out.println("Pi es igual a = " + PI);

        nombre = "Alejandro";
        System.out.println("Nuevo nombre: " + nombre);

        System.out.println("Suma: " + totalSuma);

        anio = 2000; // Re asignacion de valor

    }
}
