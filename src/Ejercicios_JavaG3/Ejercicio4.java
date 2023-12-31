package Ejercicios_JavaG3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Descripción: Calcula el factorial de un número ingresado por el
        // usuario. El factorial de un número n (representado como
        //) es el producto de todos los enteros positivos menores o iguales a n.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        long factorial = 1;

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            System.out.print(numero + "! = ");

            for (int i = numero; i >= 1; i--) {
                factorial *= i;

                // Muestra el actual factorial positivo
                System.out.print(i);

                // Pome un asterisco si no es el último término
                if (i > 1) {
                    System.out.print(" * ");
                }
            }

            System.out.println(" = " + factorial);
        }

        scanner.close();
    }
}
