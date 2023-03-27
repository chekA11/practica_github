/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.
 */
package e9_ejercicios;

import java.util.Scanner;


public class E9_EjercicioPracticoExtra1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el largo del vector");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        
        cargarVector(vector, n);
        System.out.println("La suma de todos los elementos del vector es: " +calcularSumaVector(vector, n));
        
    }

    public static void cargarVector(int[] vector, int largoVector) {  //Le pido al usuario que ingrese numeros al vector
        Scanner sc = new Scanner(System.in);
        
       for(int i = 0; i < largoVector; i++){
           System.out.println("Ingresa un numero entero para cargar el vector");
           vector[i] = sc.nextInt();
       }
    }

    public static int calcularSumaVector(int[] vector, int largoVector) { //Calculo la suma de los elementos del vector
        int suma = 0;
        
        for (int i = 0; i < largoVector; i++) {
            suma += vector[i];
        }
        
        return suma;
    }
}
