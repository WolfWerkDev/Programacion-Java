package Fundamentos;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        
        /* 
         * Este fichero contiene información sobre condicionales
         * en Java
         * 
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido ingrese su edad");


        // Declaración y asignación de variables

        int numeroDeIntentos = 0;
        int edad = entrada.nextInt();

        // Fin del bloque de variables

        // Lógica de programa o métodos (Funciones)

        // Estructuras Condicionales
        // If -> Si 

        /* < MENOR QUE
         * > MAYOR QUE
         * <= MENOR O IGUAL
         * >= MAYOR O IGUAL
         * == IGUAL QUE
         * != DIFERENTE DE
         */
        
         // Lógica para validar la edad del usuario
        if (edad >= 18 && edad < 100) {
            // Si estoy acá significa que el user es mayor de edad
            System.out.println("Eres mayor de edad, puedes usar el programa");

            // Lógica para inicializar el contador de intentos
            if (numeroDeIntentos == 0) {
                numeroDeIntentos = 1;
            }

            // Lógica para validar numero de intentos
            if (numeroDeIntentos <= 2 && numeroDeIntentos >= 1) {
                System.out.println("Bienvenido!!");
                // Aquí pongo mi lógica de negocio 
            } else {
                System.out.println("Haz llegado al límite de intentos, intentos = " + numeroDeIntentos);
            }

        } else if (edad < 18 && edad > 0) { // else if = SINO SI
            System.out.println("Eres menor de edad no puedes usar el programa, bye");
        } else { // else = SI NO
            System.out.println("No eres humano xdxd");
        }


        /*
         * Si la persona es mayor de 18 puede usar el programa
         * Si no entonces se le debe decir que no puede usarlo
         * Si no No es humano 
         * PSEUDOCODIGO
         */
    }
}
