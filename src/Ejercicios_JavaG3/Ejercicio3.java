package Ejercicios_JavaG3;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Descripción: Genera la tabla del 5 hasta el producto de 5x10.
        int num = 5;
        int tope = 10;

        System.out.println("Tabla del 5 hasta 5x10:");

        for (int i = 1; i <= tope; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
