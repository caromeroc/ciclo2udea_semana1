package udea.cilclo2.semana1.variables;

public class VariablesMomentos {

    /*
    Variables: Momento 1 Declaración
               Momento 2 Inicialización
               Momento 3 Uso 
     */
    
    public String nombre1 = "Pepe";
    public static void main(String[] args) {

        //Declaración
        String nombre;

        // Inicialización
        nombre = "Carlos ";
        

        // Uso
       // System.err.println("Mi nombre es  : " + nombre);

       VariablesMomentos obj1 = new VariablesMomentos();
        
         System.out.println("¡ Hola " + obj1.nombre1 + "!");
        
    }

}
