package Fundamentos;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // Pedir datos al usuario
        Scanner entrada = new Scanner(System.in);
        

        // Declaración de variables
        int numeroUsuario;

        // Imprimir un valor de estado dependiendo el número -> Máquina de estados

        do {
            System.out.println("Introduzca el 1 o el 2, o el 9 para salir del programa!");
            numeroUsuario = entrada.nextInt();

            switch (numeroUsuario) {
                case 1:
                    System.out.println("El número es 1");
                    break;
                case 2:
                    System.out.println("El número es 2");
                    break;
                default:
                    System.out.println("Valor fuera de rango");
                    break;
            }

            if (numeroUsuario == 5) {
                System.out.println("Adivinaste el número ganador");
            }
        } while (numeroUsuario != 9);
        
        System.out.println("Bye bye...");

        entrada.close();
    }
}
