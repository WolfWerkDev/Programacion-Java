package Fundamentos;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // Pedir datos al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el 1 o el 2!");

        // Declaración de variables
        int numeroUsuario = entrada.nextInt();

        // Imprimir un valor de estado dependiendo el número -> Máquina de estados
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
    }
}
