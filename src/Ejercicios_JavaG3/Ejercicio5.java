package Ejercicios_JavaG3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Descripción: Suma todos los dígitos de un número ingresado por el usuario.
        // No usar la conversión a String para resolver el problema.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para sumar sus dígitos: ");
        int num = scanner.nextInt();

        int s_Digitos = 0;
        int numOriginal = num;

        while (num > 0) {
            int digito = num % 10;
            s_Digitos += digito;
            num /= 10;
        }

        System.out.println("La suma de los dígitos de " + numOriginal + " es: " + s_Digitos);

        scanner.close();
    }
}
