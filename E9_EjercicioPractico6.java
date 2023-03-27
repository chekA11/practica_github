/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */

package e9_ejercicios;

import java.util.Scanner;

public class E9_EjercicioPractico6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int[] sumas = new int[8];
        boolean esMagico = true;
        
        for (int i = 0; i < sumas.length; i++){
            sumas[i] = 0;
        }
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingresa un valor en la matriz");
                matriz[i][j] = sc.nextInt();
                
                while(matriz[i][j] < 1 || matriz[i][j] > 9){
                    System.out.println("El numero es invalido, ingresa un numero entre 1 y 9");
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
        System.out.println("Matriz: \n");
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < matriz[0].length; i++) { //Comprobaciones de las sumas de filas, columnas y diagonales
            for (int j = 0; j < matriz[i].length; j++) {
                
                sumas[i] += matriz[i][j]; // suma de filas
                sumas[j + 3] += matriz[i][j]; // suma de columnas
                
                if(i == j){
                    sumas[6] += matriz[i][j]; // suma de diagonal 1
                }
                
                if(i + j == 2){
                    sumas[7] += matriz[i][j]; // suma de diagonal 2
                }
            }
        }
        
        for (int i = 0; i < sumas.length; i++) {
            if (sumas[i] != sumas[0]) {
                esMagico = false;
                break;
            }
        }
        
        if(esMagico == true){
            System.out.println("La matriz es magica!");
        }else{
            System.out.println("La matriz no es magica");
        }
    }
}
