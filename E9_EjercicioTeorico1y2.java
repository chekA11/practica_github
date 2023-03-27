/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package e9_ejercicios;

import java.util.Scanner;

public class E9_EjercicioTeorico1y2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] equipo = new String[10];
        
        for(int i = 0; i < 9; i++){
            System.out.println("Ingresa el nombre de tu compañer@");
            equipo[i] = sc.next();
        }
        
        
        System.out.println("Los compañeros en el equipo son: ");
        for(int i = 0; i < equipo.length; i++){
            if(i < 8){
                System.out.print(equipo[i] + ", ");
            }else{
                System.out.print(equipo[i]);
            }   
        }
        
        System.out.println("");
    }
    
}
