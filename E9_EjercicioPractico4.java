/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B
y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package e9_ejercicios;

public class E9_EjercicioPractico4 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random()*9+1);
            }
        }
        
        System.out.println("Matriz normal\n");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " "); //Matriz normal
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matriz transpuesta\n");
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i] + " "); //Matriz normal
            }
            System.out.println("");
        }
    }
}
