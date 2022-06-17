
package udea.cilclo2.semana1.EjemploInstancias;


public class PrimeraClase {
    
    public int varGlobal = 2;
    
    public int suma (int a, int b){
        
        System.out.println("Entro al metodo suma de la clase PrimeraClase.java");

        /*
            Generamos una instancia de la clase SegundaClase.java y llamamos al
            objeto resultante objetoSegundaClase, con ete podemos tener acceso a los
            metodos y variables publicas de esta clase.
        */
        SegundaClase objetoSegundaClase = new SegundaClase();
        
        // Llamamos al metodo mensaje de la clase SegundaClase.java que no recibe
        // parametros de entrada.
        objetoSegundaClase.mensaje();
        
        
        // logica del metodo suma
        int salida = a+b ;
        
        System.out.println(" La suma es :: "  + salida);
        
        // retorno del metodo suma.
        return salida;       
    }
           
}
