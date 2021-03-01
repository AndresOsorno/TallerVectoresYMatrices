package com.mycompany.tallervectoresymatrices;

import java.util.Scanner;

//Trabajo realizado por Mateo Cardenas y Andres Osorno

public class TallerArray2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor digita el tamaño de los vectores que se multiplicaran:");
        int d = leer.nextInt();
        
        int[] vector1 = new int[d];
        int[] vector2 = new int[d];
        
        for (int i = 0; i < d; i++) {
            System.out.println("Ingresa un numero para la posición "+(i+1)+" del vector 1:");
            vector1[i] = leer.nextInt();
        }
        for (int i = 0; i < d; i++) {
            System.out.println("Ingresa un numero para la posición "+(i+1)+" del vector 2:");
            vector2[i] = leer.nextInt();
        }

        System.out.println("El producto escalar es: "+ProductoPunt(vector1, vector2)); 

    }

    public static int ProductoPunt(int[] v1, int[] v2) {
        int resultado = 0;
        for (int i = 0; i < v1.length; i++) {
            resultado = resultado +(v1[i] * v2[i]);
        }
        return resultado;
    }

}
