/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
package e9_ejercicios;

import java.util.Scanner;

public class E9_EjercicioPracticoExtra5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el largo de las filas de la matriz");
        int n = sc.nextInt();
        System.out.println("Ingresa el largo de las columnas de la matriz");
        int m = sc.nextInt();
        
        int[][] matriz = new int[n][m];
        int sumaElementos = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random()*9+1);
                sumaElementos += matriz[i][j];
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
        
        System.out.println("La suma de los elementos de la matriz es: " +sumaElementos);
    }
}
