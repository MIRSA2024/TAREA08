/*
Números primos del 1 al 50
Este programa imprime todos los números primos entre el 1 y el 50.
 */
package tarea08;

public class Ejercicio03 {

    public static void main(String[] args) {
        System.out.println("Numeros primos entre 1 y 50:");
        
        for (int i = 2; i <= 50; i++) {
            boolean esPrimo = true;
            
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}


