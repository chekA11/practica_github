/*
Crear una función rellene un vector con números aleatorios,
pasándole un arreglo por parámetro. Después haremos otra función
o procedimiento que imprima el vector.
 */
package e9_ejercicios;

public class E9_EjercicioPracticoExtra3 {
    public static void main(String[] args) {
        
        int[] vector = new int[10];
        
        cargarVector(vector, 10);
        mostrarVector(vector, 10);
        
    }
    
    public static void cargarVector(int[] vector, int largoVector) {  //Le pido al usuario que ingrese numeros al vector
       for(int i = 0; i < largoVector; i++){
           vector[i] = (int) (Math.random()*9+1);
       }
    }

    public static void mostrarVector(int[] vector, int largoVector) {
        
        System.out.print("Numero del vector: ");
        for (int i = 0; i < largoVector; i++) {
            System.out.print(vector[i] +" ");
        }
        
        System.out.println("");
    }
}
