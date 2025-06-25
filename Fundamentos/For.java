package Fundamentos;

public class For {
    public static void main(String[] args) {
        

        // Sumar los números del 1 al 5 con ciclo for

        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            suma += i;
            System.out.println("i = " + i);
        }
        System.out.println("La suma es: " + suma);

        // Imprimir los números pares desde el 1 al 50
        for (int i = 1; i <= 50; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
