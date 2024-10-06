/*
Suma de los cuadrados de los primeros 10 números
Este programa calcula la suma de los cuadrados de los números del 1 al 10.
 */
package tarea08;

public class Ejercicio01 {

    public static void main(String[] args) {

        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i * i;
        }
        System.out.println("La suma de los cuadrados es: " + suma);
    }
}
    
    

