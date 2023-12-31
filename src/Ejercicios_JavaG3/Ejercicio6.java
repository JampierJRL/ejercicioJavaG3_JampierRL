package Ejercicios_JavaG3;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Descripción: Encuentra y muestra todos los cuadrados perfectos hasta 100.

        System.out.println("Cuadrados perfectos hasta 100:");

        for (int i = 1; i <= 10; i++) {
            int cuadrado = i * i;

            if (cuadrado <= 100) {
                System.out.println(cuadrado);
            }
        }
    }
}
