/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package e9_ejercicios;

import java.util.Scanner;

public class E9_EjercicioPractico3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un numero para definir el largo del vector");
        int n = sc.nextInt();
        
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, num;
        int[] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++) { //Relleno el vector con numeros desde el 1 hasta el 10000
            vector[i] = (int) (Math.random()*99999+1);
        }
        
        for (int i = 0; i < vector.length; i++) {
            num = String.valueOf(vector[i]).length(); // Guardo el tamaño del numero en una variable
            
            switch(num){
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
            }
        }
        
        System.out.println("El vector tiene " +d1+ " numeros de un digito");
        System.out.println("El vector tiene " +d2+ " numeros de dos digitos");
        System.out.println("El vector tiene " +d3+ " numeros de tres digitos");
        System.out.println("El vector tiene " +d4+ " numeros de cuatro digitos");
        System.out.println("El vector tiene " +d5+ " numeros de cinco digitos");
    }
}
