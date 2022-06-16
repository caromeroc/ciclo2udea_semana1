package udea.cilclo2.semana1.flujosDeControl;


public class WhileControl {
    /*
    La palabra reservada while se utiliza en este flujo de control para indicar
    que se va a ejecutar una porción de codigo "mientras" se cumpla esa condición.   
    
    
        while (condicion){
            que pasa acá si se cumple la condición
        }
    */
       
    public static void main(String[] args) {       
        // variable a evaluar
        int numeroUno = 5;
        //Instrucción de control
        while (numeroUno < 10){           
            System.out.println(" Si cumple :: "  + numeroUno + "  es menor que 10");
            //Operador de incremento, para terminar la instrucción de control
            numeroUno++;
        }   
    }   
}