package udea.cilclo2.semana2.constructores;


public class Lanzadora {
   
    
    public static void main(String[] args) {
      
        Jugador obj = new Jugador();
        obj.nombre = "Leonel";
        obj.apellido = "Messi";
        obj.edad = 45;  
        
        System.out.println("");
        
        Jugador obj2 = new Jugador("Cristiano", "Ronaldo", 80);
        
        System.out.println("" + obj2);
        
        
        
        
        Metodos objMeth = new Metodos();     
        int da [] = objMeth.datos;       
        System.out.println("  " + objMeth.sumatoria(da) );
    }
}
