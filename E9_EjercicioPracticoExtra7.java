/*
Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n” y
que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: https://quantdare.com/numeros-de-fibonacci/
 */
package e9_ejercicios;

import java.util.Scanner;

public class E9_EjercicioPracticoExtra7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un numero para ver la sucesión de fibonacci hasta ese numero");
        int num = sc.nextInt();
        
        while(num < 0){
            System.out.println("El numero no puede ser negativo ingresalo nuevamente");
            num = sc.nextInt();
        }
        
        Fibonnaci(num);
        
        
    }

    public static void Fibonnaci(int num) {
        int[] vector = new int[num];
        
        //Lleno los dos primeros valores del vector
        vector[0] = 1;
        vector[1] = 1;
        
        
        for (int i = 2; i < vector.length; i++) { //Hago la formula de fibonnaci
            vector[i] = vector[i - 1] + vector[i - 2];
        }
        
        System.out.print("Serie Fibonnaci: ");
        for (int i = 0; i < num; i++) { //Imprimo el vector
            System.out.print(vector[i] + ", ");
        }
        System.out.println("");
    }
}
