package Ejercicios_JavaG3;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Descripción: Itera sobre los números del 1 al 50 e imprime solo los números pares.
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
