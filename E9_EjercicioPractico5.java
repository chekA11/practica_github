/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package e9_ejercicios;

public class E9_EjercicioPractico5 {
    public static void main(String[] args) {
        
        int[][] matriz = { {0,2,-4}, {2,0,2}, {-4,-2,0} };
        boolean esAntisimetrica = false;
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == -matriz[j][i]){
                    esAntisimetrica = true;
                    break;
                }
            }
            
            if(!esAntisimetrica == true){
                break;
            }
        }
        
        if (esAntisimetrica == true) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
        
    }
}
