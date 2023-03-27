/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
 */
package e9_ejercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class E9_EjercicioPracticoExtra6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] palabras = new String[5];
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingresa una palabra de entre 3 y 5 caracteres");
            palabras[i] = sc.next();
            
            while(palabras[i].length() < 3 || palabras[i].length() > 5 ){
                System.out.println("La palabra tiene menos de 3 caracteres o mas de 5, ingresa nuevamente la palabra");
                palabras[i] = sc.next();
            }
        }
        
        char[][] sopaDeLetras = new char[20][20];
        Set<Integer> numerosGenerados = new HashSet<>();
        
        for (int i = 0; i < palabras.length; i++) {
            
            int fila = (int) (Math.random() *20 ); //Fila aleatoria nueva
            
            while(numerosGenerados.contains(fila)){ //Evito repetir un numero ya seleccionado por el Math.random()
                fila = (int) (Math.random() *20 );
            }
            numerosGenerados.add(fila); //Agrego el numero a la lista
            
            for (int j = 0; j < palabras[i].length(); j++) {
                sopaDeLetras[fila][j] = palabras[i].charAt(j); //Guardo la letra en la sopa de letras
            }
        }
        
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                if (sopaDeLetras[i][j] == '\0') { //Cuando hay un caracter vacio
                    sopaDeLetras[i][j] = (char) (int) (Math.random() * 9 + 48); //Guardo un numero aleatorio convertido a char entre 0 y 9
                }
                System.out.print(sopaDeLetras[i][j] + " "); //Imprimo cada letra
            }
            System.out.println(""); //Hago saltos de linea
        }
        
    }
}
