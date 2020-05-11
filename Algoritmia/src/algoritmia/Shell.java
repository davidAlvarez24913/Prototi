/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Shell {


    public static void main(String[] args) {
        

         Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[1000000];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(100);
           // System.out.print(numeros[i] + " ");
            
           // scanf("%d",  & a);
        }
        long Inicio = System.currentTimeMillis();
        int inter = ( numeros.length / 2), i = 0, j = 0, k = 07, aux;
        while (inter > 0) {
            for (i = inter; i < numeros.length; i++) {
                j = i - inter;
                while (j >= 0) {
                    k = j + inter;
                    if (numeros[j] <= numeros[k]) {
                        j--;
                    } else {
                        aux = numeros[j];
                        numeros[j] = numeros[k];
                        numeros[k] = aux;
                        j = j - inter;
                    }
                }
            }
            inter = inter / 2;
        }
         long Final = System.currentTimeMillis();
         long Total = Final - Inicio;
        System.out.println("\n Tiempo Peor CasoShell: " + Total);
        /**
        for (i = 0; i < numeros.length; i++) {
            System.out.printf("%d ", numeros[i]);
           
        }
        **/
    }
}
