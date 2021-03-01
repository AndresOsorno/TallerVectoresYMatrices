package com.mycompany.tallervectoresymatrices;

import java.util.Scanner;

//Trabajo realizado por Mateo Cardenas y Andres Osorno

public class Punto4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n;
        int m;
        
        System.out.println("Digite un numero N: ");
        n = leer.nextInt();
        System.out.println("Digite un numero M: ");
        m = leer.nextInt();
        
        double[][] matriz = new double[n][m];
        
        for(int j=0; j < n; j++){
            for(int k=0; k<m; k++){
                System.out.println("Digita el elemento ("+(j+1)+","+(k+1)+") : ");
                matriz[j][k] = leer.nextDouble();
            }
        }
        
        for(int j=0; j < n; j++){
            for(int k=0; k<m; k++){
                System.out.print(" | "+ matriz[j][k]);
            }
            System.out.print(" |\n");
        }
        
    }
    
}
