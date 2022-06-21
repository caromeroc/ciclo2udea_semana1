package udea.cilclo2.semana1.flujosDeControl;

public class ForControl {
   /*
    La palabra reservada for indica una instrucción de control de tipo ciclo
    la cual es usada para iterar o recorrer entre todos los objetos de un mismo
    tipo. Ejemplo un conteo de numeros, conteo de personas, entre otros.
    
    La estructura básica en sintaxis es la siguiente.
    
        for (var ; condicion ; incremento){
            Que pasa. que quiero que haga
        }
    */
    
    public static void main(String[] args) {
        
        // Ejemplo 1 sencillo conteo de numero del 1 al 10

        for (int i = 0; i<=10 ; i++){
            System.out.println("El numero es :: " + i);
        }
        
        // Ejemplo 2 pasamos el valor de la variable por objeto     
        
        /*
            Acá es importante destacar que la variable i tiene un alcance local
            al ciclo for, por eso podemos tener tantas i como ciclos.
        */
        
        int inicioVar = 0;
        
        for (int i = inicioVar; i<=10 ; i++){
            System.out.println("El numero es :: " + i);
        }
        
        // Ejemplo 3 usando una bandera como incremento

        int banderaIncremento = 2;
        
        for (int i = 0; i<=10 ; i+= banderaIncremento){
            System.out.println("Incrementos de 2 en 2 :: " + i);
        }                
    }    
}