package Fundamentos;

public class While {
    public static void main(String[] args) {
        
        // Fichero con bucle while

        // numero es el contador de iteraciones
        int numero = 6;
        // Almacena el resultado de la suma
        int suma = 0;

        // Sumar números del 1 al 5 usando while

        while (numero <= 5) {

            // Lógica de programa o de negocio
            suma += numero;
            //suma = suma + numero;
            numero++;
            //numero = numero + 1;
            System.out.println("Suma = " + suma + " y numero = " + numero);
        }
        System.out.println("La suma es: " + suma);
    }
}
