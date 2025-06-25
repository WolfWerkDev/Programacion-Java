package Fundamentos;

public class DoWhile {
    public static void main(String[] args) {
        
        // Sumar los números del 1 al 5 usando doWhile

        // i es el contador
        int i = 0;
        int suma = 0;
        
        do {
            // Lógica de programa
            suma += i;
            i++;
            System.out.println("Suma = " + suma + " y i = " + i);
        } while (i <= 5);
        
        System.out.println("La suma es: " + suma);
    }
}
