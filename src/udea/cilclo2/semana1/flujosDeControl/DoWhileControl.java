package udea.cilclo2.semana1.flujosDeControl;

public class DoWhileControl {
    
    /*
    La palabra reservada DO se utiliza en este flujo de control para indicar
    que se va a ejecutar esta porción de codigo almenos una vez  y "mientras" 
    se cumpla esa condición, cuando deje de cumplirse no se ejecurará más.   
    
            do {
                Hago algo siempre almenos una vez.      
            } while (condicion);
    */
    public static void main(String[] args) {
        
        /*
            Este primer caso vereomos como se ejecuta mientras el numero sea 
            menor a 10, en el momento inicial cumple la condición
        */
        
        // variable a evaluar
        int numeroUno = 5;
        
        do {
            System.out.println("Este es el numero  :: " + numeroUno);
            numeroUno++;
        } while (numeroUno < 10);
    
        /*
            Este segundo caso vereomos como se ejecuta mientras el numero sea 
            menor a 10, en el momento inicial NO cumple la condición ya que 
            inicia en 11.
        */
        
        int numeroDos =11;
        
        do {
            System.out.println("Se ejecuta almenos una vez  :: " + numeroDos + "  No cumple la condición");
            numeroDos++;
        } while (numeroDos < 10);
    
    }
}