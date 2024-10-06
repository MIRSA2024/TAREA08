/*
Crear un programa que te genere un patrón de asteriscos
Este programa imprime un triángulo de asteriscos con 5 filas.
 */
package tarea08;


public class Ejercicio02 {
     public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
