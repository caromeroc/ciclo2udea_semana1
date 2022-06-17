package udea.cilclo2.semana1.EjemploInstancias;

/*
    Esta clase será usada como nuestro main principal y desde acá se empezaran
    a llamar las clsaes neecesarias para el ciclo de vida del programa.
*/


public class Lanzadora {
    
    
    public static void main(String[] args) {
       
        System.out.println("Por aca paso primero  :: "); 
        
        /*
            Generamos una instancia de la clase PrimeraClase.java y llamamos al
            objeto resultante objetoPrimeraClase, con ete podemos tener acceso a los
            metodos y variables publicas de esta clase.
        */
        PrimeraClase objetoPrimeraClase = new PrimeraClase();     
        
        // Llamamos al metodo suma que recibe dos parametros de tipo int como
        // entrada.
        objetoPrimeraClase.suma(7,2);
        
        /*
            Generamos una instancia de la clase PrimeraClase.java y llamamos al
            objeto resultante objetoPrimeraClase, con ete podemos tener acceso a los
            metodos y variables publicas de esta clase.
        */
        TerceraClase objetoTerceraClase = new TerceraClase();    

        // Llamamos al metodo numeroAleatorio que no recibe parametros de entrada
        // y genera un numero aleatorio.        
        System.out.println("Ejecucion TerceraClase ::  "  + objetoTerceraClase.numeroAleatorio()); 


        System.out.println("Termine");
        
    }
    
}
