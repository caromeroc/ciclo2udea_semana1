package udea.cilclo2.semana1.vectoresMatriz;

/*
    Estructura ejemplo , entradas y salidas del metodo para reto1
*/


public class EjemploInOutMetodoArray {
    
    int [] datos = {27, 95, 15, 18, 10, 4, 30, 4};

    public int [] miFuncion (int[] datos){
    
        int[] salida = {0,0,0};
        
        int[] notas; 
        notas = new int [3];
        
        salida [0]=27;
        salida [1]=95;
        salida [2]=15;
        
        notas [0]=27;
        notas [1]=95;
        notas [2]=15;
        
        return notas; 
    }
    
    
    public static void main(String[] args) {
        
        EjemploInOutMetodoArray obj = new EjemploInOutMetodoArray();
        
      int [] temp =  obj.miFuncion(obj.datos);
        
        for (int i : temp) {
            
            System.out.println(" :: " + i);
        }

    }
    
    
    
}
