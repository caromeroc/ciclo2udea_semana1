package udea.cilclo2.semana1.flujosDeControl;

public class IfThenControl {
    /*
    Palabra reservada If indica la evaluación de la condición SI, Cuando se
    cumpla dicha condición se ejecutara el codigo que esta dentro del bloque.
        
        if (condicion){
            Que pasa
        }
    
    Esta instrucción se puede complementar con más preguntas del tipo IF y al final
    con una codición de cierre Else, la cual se ejecutara si ninguna de las
    condiciones IF se cumple.
    
        if (condicion){
            Que pasa
        }else if (condicion){
            Que pasa
        }else if (condicion){
            Que pasa
        }else{
            Que pasa si no se cumple ningun If.
        }
    
    
     */
    public static void main(String[] args) {

        //esta es la variable a evaluar
        int numeroUno = 5;

        //Condición de evaluación principal
        if (numeroUno == 1) {
            System.out.println("Son iguales");
        } else if (numeroUno == 2) {
            System.out.println("Es igual a 2");
        } else if (numeroUno == 3) {
            System.out.println("Es igual a 3");
        } else {
            System.out.println("No se pudo evaluar");
        }
    }   
}