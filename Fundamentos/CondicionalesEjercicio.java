package Fundamentos;

import java.util.Scanner;

public class CondicionalesEjercicio {
    public static void main(String[] args) {
        
        // Instanciar el método para entrada de datos

        Scanner entrada = new Scanner(System.in);
        
        // Declarar variables

        System.out.println("Ingrese la nota del estudiante: ");

        float nota = entrada.nextFloat(); // entrada.nextFloat(); -> Para convertir entrada de teclado (String) a numérico Float

        /* Aprobado con excelencia SI nota >= 90        
           Aprobado con buen desempeño SI nota está entre 70 y 89
                SI nota está entre 80 y 89 indicar "Casi excelente"
           Aprobado con lo mínimo SI nota está entre 60 y 69
           Reprobado SI nota < 60
                SI nota < 30 "Reprobado con nota crítica"
        */

        // Lógica de impresión de información dependiendo la nota
        if (nota >= 90 && nota <= 100) {
            System.out.println("Aprobado con excelencia");
        } else if (nota >= 70 && nota <= 89) {
            System.out.println("Aprobado con buen desempeño.");

            // Evaluar casi excelente -> IF ANIDADO
            if (nota >= 80 && nota <= 89) {
                System.out.println("Casi excelente!!");
            }

        } else if (nota >= 60 && nota <= 69) {
            System.out.println("Aprobado con lo mínimo");

        } else{

            if (nota < 60) {
                System.out.println("Reprobado.");

            }

            // Condición de nota crítica
            if (nota < 30) {
                System.out.println("Reprobado con nota crítica");
            }

            System.out.println("Valor incorrecto");
        }

        // Fin de la Lógica de impresión de información dependiendo la nota
    }
}
