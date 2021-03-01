package com.mycompany.tallervectoresymatrices;

import java.util.Scanner;

//Trabajo realizado por Mateo Cardenas y Andres Osorno

public class TallerArray1 {

    public static void main(String[] args) {
        String conjunto;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa una lista de numeros separado por comas (,)");
        conjunto = leer.next();
        String[] Conjunto = conjunto.split(",");
        int[] ConjuntoNum = new int[Conjunto.length];
        for (int i = 0; i < ConjuntoNum.length; i++) {
            ConjuntoNum[i] = Integer.parseInt(Conjunto[i]);
        }
        int suma = 0;
        for (int i = 0; i < ConjuntoNum.length; i++) {
            suma = suma + ConjuntoNum[i];
        }
        double promedio = 0;
        promedio = suma / ConjuntoNum.length;

        int menor = 0, mayor = 0;
        for (int i = 0; i < ConjuntoNum.length; i++) {
            for (int j = i; j < ConjuntoNum.length; j++) {
                if (ConjuntoNum[i] < ConjuntoNum[j]) {
                    menor = ConjuntoNum[i];
                }
            }
        }
        for (int i = 0; i < ConjuntoNum.length; i++) {
            for (int j = i; j < ConjuntoNum.length; j++) {
                if (ConjuntoNum[i] > ConjuntoNum[j]) {
                    mayor = ConjuntoNum[i];
                }
            }
        }

        System.out.println("La suma de ese vector es " + suma);
        System.out.println("El promedio del vector es " + promedio);
        System.out.println("El numero menor es " + menor);
        System.out.println("El numero mayor es " + mayor);
    }

}
