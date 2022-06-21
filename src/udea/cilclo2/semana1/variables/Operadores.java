package udea.cilclo2.semana1.variables;

    /*
        Operadores: Los operadores pueden ser de tipo aritmetico, logico , de asignacion
        de igualdad, ternario entre otros
     */
public class Operadores {


    public static void main(String[] args) {

        /*
            Para ejemplofocar algunos de los operadores vamos a utilizar variables
            locales al metodo main.
        */
        
        /*
            cuando le asignamos el valor numerico (2) a la variable, estamos haciendo
            uso de los operadores de asignación
        */   
        int numeroA = 2;
        int numeroB = 7;
        
        // Aritmeticos
        System.out.println("Uso de operadores aritmeticos");
        // Suma
        int Suma = numeroA + numeroB;
        System.out.println("El resultado de la suma es  :: "  + Suma);
        
        // Resta
        
        int resta = numeroB - numeroA;
        System.out.println("El resultado de la resta es  :: "  + resta);
       
        
        //modulo
        
        int modulo = numeroB % numeroA;
        System.out.println("El resultado de el modulo es  :: "  + modulo);
        
        // logicos e igualdad
        System.out.println("Uso de operadores de igualdad y logicos");
        int comparar = 7;
        if (comparar == numeroB && comparar != numeroA)
            System.out.println("Expresion evaluada correctamente");
    }

}
