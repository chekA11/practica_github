/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y
le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package e9_ejercicios;

import java.util.Scanner;

public class E9_EjercicioPractico2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        
        for(int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10+1);
        }
        
        int contador = 0, pos = 0;
        
        System.out.println("Ingresa un numero entre 1 y 10 para ver si está en el vector");
        int num = sc.nextInt();
        
        for(int i = 0; i < vector.length; i++) {
            
            if(num == vector[i]){
                if (contador == 0) {
                    pos = i;
                }
                contador++;
            }
        }
        
        if(contador >= 1){
            System.out.println("El numero " +num+ " se encontro en la posición " +pos);
        }else if(contador == 0){
            System.out.println("El numero " +num+ " no se encontro en ninguna posición");
        }
        
        if(contador > 1){
            System.out.println("El numero " +num+ " se encuentra repetido en el vector " +contador+ " veces");
        }
    }
}
