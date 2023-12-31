package Ejercicios_JavaG3;

public class Ejercicio2
{
    public static void main(String[] args) {

        //Descripción: Suma todos los números impares del 1 al 100.
        int sumaImp = 0;

        for (int i = 1; i <= 100; i += 2) {
            sumaImp += i;
        }

        System.out.println("La suma de los números impares del 1 al 100 es: " + sumaImp);
    }
}
