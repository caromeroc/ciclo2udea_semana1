package udea.cilclo2.semana1.vectoresMatriz;


public class Matriz {
    
    
    public static void main(String[] args) {
        
       // {3.1, 4.1, 2.1, 1.1, 5.0}
        
        double[] notas; 
        notas = new double [5];
        
        notas[0] = 3.1;
        notas[1] = 4.1;
        notas[2] = 2.1;
        notas[3] = 1.1;
        notas[4] = 5.0;
        
                
        System.out.println(" Longitud ::  " + notas.length);
        
        for (double i : notas) {
            
            System.out.println("La nota es :: "  + i);
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("2 :: La nota es :: "  + notas[i]);
        }
        
    }
       
}
