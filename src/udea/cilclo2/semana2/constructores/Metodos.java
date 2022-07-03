package udea.cilclo2.semana2.constructores;


public class Metodos {

  
    public int[] datos = {5, 2, 6, 8, 3, 7};
    
     public int [] sumatoria(int[] arreglo) {

        int [] total = {0,0,0};
        int suma = 0;
        for (int i : arreglo) {
            suma = suma + i;
        }
        total[0]  = suma;
        total[1]  = suma;
        total[2]  = suma;       
        return total;
    }
    
    public static void main(String[] args) {
        
        Metodos obj = new Metodos();
        
      
        System.out.println(" La suma es :: \n " +  obj.sumatoria(obj.datos));
        
        for (int i : obj.sumatoria(obj.datos)) {
            
            System.out.println(" " + i);
        }
        
    }
    

}
