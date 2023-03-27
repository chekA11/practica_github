/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package e9_ejercicios;


public class E9_EjercicioPracticoExtra2 {
    public static void main(String[] args) {
        
        int[] vector1 = {1,2,3,4};
        int[] vector2 = {2,8,7,6};
        boolean sonIguales = true;
        
        
        for (int i = 0; i < vector1.length; i++) {
            
            if(vector1[i] != vector2[i]){
                sonIguales = false;
                break;
            }
        }
        
        if(sonIguales == true){
            System.out.println("Los vectores 1 y 2 son iguales");
        }else{
            System.out.println("Los vectores 1 y 2 NO son iguales");
        }
    }
}
