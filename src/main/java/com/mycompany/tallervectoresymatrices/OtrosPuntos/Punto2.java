package com.mycompany.tallervectoresymatrices;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int tamaño;
        int resultado = 0;
        
        System.out.println("Por favor digita el tamaño de los vectores que se multiplicaran: ");
        tamaño = leer.nextInt();
        
        int[] vecA = new int[tamaño];
        int[] vecB = new int[tamaño];
        
        for (int i=0; i<tamaño;i++){
            System.out.println("Digite el valor para la posicion "+(i+1)+" del vector 1: ");
            vecA[i] = leer.nextInt();
        }
        for (int i=0; i<tamaño;i++){
            System.out.println("Digite el valor para la posicion "+(i+1)+" del vector 2: ");
            vecB[i] = leer.nextInt();
        }
        
        for (int i=0; i<tamaño;i++){
            resultado = resultado + (vecA[i]*vecB[i]);
        }
        
        System.out.println("El resultado es: "+resultado);
        
        
    }
    
}
