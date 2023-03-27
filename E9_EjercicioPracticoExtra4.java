/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos
para luego obtener una cantidad de aprobados y desaprobados.
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package e9_ejercicios;

import java.util.Scanner;

public class E9_EjercicioPracticoExtra4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[][] alumnos = new double[10][4];
        double[] notas = new double[4];
        double[] promedios = new double[10];
        int contadorAprobados = 0, contadorDesaprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola alumno " +(i + 1)+ "\n");
            for (int j = 0; j < 4; j++) {
                switch(j){
                    case 0:
                        System.out.println("Ingresa la nota del trabajo práctico 1");
                        notas[j] = sc.nextDouble();
                        alumnos[i][j] = notas[j] * 0.10;
                        break;
                    case 1:
                        System.out.println("Ingresa la nota del trabajo práctico 2");
                        notas[j] = sc.nextDouble();
                        alumnos[i][j] = notas[j] * 0.15;
                        break;
                    case 2:
                        System.out.println("Ingresa la nota del parcial 1");
                        notas[j] = sc.nextDouble();
                        alumnos[i][j] = notas[j] * 0.25;
                        break;
                    case 3:
                        System.out.println("Ingresa la nota del parcial 2");
                        notas[j] = sc.nextDouble();
                        alumnos[i][j] = notas[j] * 0.50;
                        break;
                }
                
                promedios[i] += notas[j] / 4;
            }
            
            if(promedios[i] >= 7.0){
                contadorAprobados++;
            }else{
                contadorDesaprobados++;
            }
        }
        
        System.out.println("La cantidad de alumnos aprobados son: " +contadorAprobados);
        System.out.println("La cantidad de alumnos desaprobados son: " +contadorDesaprobados);
        
    }
}
