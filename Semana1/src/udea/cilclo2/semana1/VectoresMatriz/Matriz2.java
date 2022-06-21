package udea.cilclo2.semana1.VectoresMatriz;


public class Matriz2 {
    
    public static void main(String[] args) {
       
        int[][] matrizBidi;
        matrizBidi = new int [2][2];
        
        /*
                {1, 2}
                {3, 4}
        */
        
        matrizBidi[0][0] = 1;
        matrizBidi[0][1] = 2;
        matrizBidi[1][0] = 3;
        matrizBidi[1][1] = 4;
        
        for (int i = 0; i < matrizBidi.length; i++) {
            
            for (int j = 0; j < matrizBidi[j].length; j++) {
                
                System.out.println("2 :: La nota es :: "  + matrizBidi[i][j]);
                
            }
         
        }
        
        
        
    }
        
    
}
