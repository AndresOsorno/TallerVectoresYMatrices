package com.mycompany.tallervectoresymatrices;

import java.util.Scanner;

//Trabajo realizado por Mateo Cardenas y Andres Osorno

public class TallerArray4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, M;
        System.out.println("ingrea un numero N ");
        N = leer.nextInt();
        System.out.println("Ingreas un numero M ");
        M = leer.nextInt();
        double[][] matriz = new double[N][M];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("ingresa un numero");
                matriz[i][j] = leer.nextDouble();
            }
        }
        System.out.println("la matriz es ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print(matriz[i][j] + "|");

            }
            System.out.println(" ");
        }

    }

}
