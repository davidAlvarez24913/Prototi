/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 *
 * @author ASUS
 */
public class Algoritmia {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      
        int n = 1000000;
        int T[] = new int[n];
        int m = n * 5;
        for (int i = 0; i < n ; i++) {
            T[i] = n-i; 
            System.out.println("   " + T[i]);
            //System.out.println( i);
        }
        System.out.println( );
        int T1[] = T;
        Insertar(T);
        System.out.println("T: " );
        for (int i = 0; i<T.length; i++){
        //System.out.println("  " + T[i]);
   
   }
        Seleccionar(T1);
        System.out.println("T1: " );
        for (int i = 0; i<T.length; i++){
       // System.out.println("  " + T1[i]);
        
       
    }
   }
      
       public static void Insertar(int T[]){
        long Inicio = System.currentTimeMillis();
       
        for (int i = 2; i < T.length; i++) {
           int x = T[i];
            int j = i - 1;
        
        while ((j >- 1) && (x < T[j])) {
            T[j + 1] = T[j];
            j = j - 1;

        }
        T[j + 1] = x;
        }
         long Final = System.currentTimeMillis();
         long Total = Final - Inicio;
        System.out.println("\n Tiempo(Insertar: " + Total);
       }
    public static void Seleccionar(int T[]){
        long Inicio = System.currentTimeMillis();
        for (int i = 0; i < (T.length) - 1; i++) {
            int minj = i;
            int minx = T[i];
            for (int j = i + 1; j < T.length; j++) {
                if (T[j] <minx) {
                    //Intercambiamos valores
                  minj = j;
                  minx= T[j];

                }
            }
            T[minj] = T[i];
            T[i] = minx;
        }
        long Final = System.currentTimeMillis();
        long Total = Final - Inicio;
        System.out.println("\n Tiempo(Seleccionar: " + Total);
       
    }
    
}
