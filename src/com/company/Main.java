package com.company;

import java.util.Arrays;

public class Main {
   public static void estadisticas_pares_impares(int[] a){
       int sumPar = 0;
       int sumImpar = 0;
       int numPar = 0;
       int numImpar = 0;
       int maxPar = 0;
       int maxImpar = 0;
       int total = 0;
       for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i] + "");
            if (a[i] % 2 != 0){
                sumImpar+=a[i];
                numImpar+=1;
                if (a[i] >= maxImpar){
                    maxImpar=a[i];
                }
                //System.out.println(a[i] + " Es Impar");
            }
            if (a[i] % 2 == 0){
                sumPar+=a[i];
                numPar+=1;
                if (a[i] >= maxPar){
                    maxPar=a[i];
                }
                //System.out.println(a[i] + " Es par");
            }
            total+=a[i];

        }
       System.out.println(sumPar + " Total Suma Par");
       System.out.println(sumImpar + " Total Suma Impar");
       System.out.println(numPar + " Total Cant Par");
       System.out.println(numImpar + " Total Cant Impar");
       System.out.println(maxPar + " Maximo Par");
       System.out.println(maxImpar + " Maximo Impar");
       System.out.println(total + " Total");
    }
    public static void main(String[] args) {
        int[] a ={3,7,12,22,9,25,18,31,21,14,45,2};
        estadisticas_pares_impares(a);
    }
}
