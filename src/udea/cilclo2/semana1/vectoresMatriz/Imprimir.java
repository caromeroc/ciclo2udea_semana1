package udea.cilclo2.semana1.vectoresMatriz;

import java.util.Arrays;


public class Imprimir {
    /*
        Pequeño ejemplo clase Arrays de Java Util, para comprender el 
        potencial del API de Java.
    */
    
    public static void main(String[] args) {
        
        int arreglo [][] = {{1,2},{3,4}};
        
        int arreglo2 [] = {1, 3, 5};
        
        for (int[] is : arreglo) {
            System.out.println(" " +  Arrays.toString(is));
        }
        
        
        
    }
    
}
