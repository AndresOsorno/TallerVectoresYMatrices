package com.mycompany.tallervectoresymatrices;

import java.util.Scanner;

//Trabajo realizado por Mateo Cardenas y Andres Osorno

public class Punto1 {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int suma = 0;
        double promedio=0;
        int valorMayor=0;
        int valorMenor=0;
        int i;
        
        String numeros;
        
        System.out.println("Por favor digite los numeros separados por coma");
        numeros = leer.nextLine();
        
        String[] lista = numeros.split(",");
        int[] numerosLista = new int[lista.length];
        
        valorMayor = Integer.parseInt(lista[0]);
        
        for (i=0;i<lista.length;i++){
            numerosLista[i] = Integer.parseInt(lista[i]);
            if (numerosLista[i] > valorMayor) {
                valorMayor = numerosLista[i];
            }
        }
        
        valorMenor = valorMayor;
        
        for (i=0;i<numerosLista.length;i++){
            suma = suma + numerosLista[i];
            promedio = suma / numerosLista.length;
            if (numerosLista[i] < valorMenor) {
                valorMenor = numerosLista[i];
            }
        }
        
        System.out.println("a. La suma de los valores es de: "+suma);
        System.out.println("b. El promedio de los valores es: "+promedio);
        System.out.println("c. El numero mayor en los valores es: "+valorMayor);
        System.out.println("d. El numero menor en los valores es: "+valorMenor);
        
    }
    
}
