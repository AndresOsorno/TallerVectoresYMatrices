package com.mycompany.tallervectoresymatrices;

import java.util.Scanner;

//Trabajo realizado por Mateo Cardenas y Andres Osorno

public class TallerArray3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double[] vector1 = new double[3];
        double[] vector2 = new double[3];

        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingresa un numero para la posición "+(i+1)+" del vector 1:");
            vector1[i] = leer.nextDouble();
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingresa un numero para la posición "+(i+1)+" del vector 2:");
            vector2[i] = leer.nextDouble();
        }
        
        ProductoCruz(vector1,vector2);
        
    }

    public static void ProductoCruz(double[] v1, double[] v2) {
        double I = 0, J = 0, K = 0;
        double[][] matriz = new double[2][3];
        for (int i = 0; i < 3; i++) {
            matriz[0][i] = v1[i];
        }
        for (int i = 0; i < 3; i++) {
            matriz[1][i] = v2[i];
        }
        I= (matriz[0][1]*matriz[1][2])-(matriz[0][2]*matriz[1][1]);
        J=(matriz[0][0]*matriz[1][2])-(matriz[1][0]*matriz[0][2]);
        K=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        
        System.out.println("el resultado es: i( "+I+" ) -j( "+J+" )+k( "+K+" )");
            
    }

}
