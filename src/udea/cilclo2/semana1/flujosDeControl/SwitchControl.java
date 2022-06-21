package udea.cilclo2.semana1.flujosDeControl;

public class SwitchControl {
    /*
    
    La sentencia switch evalua una codiciín y ejecuta una porción de codigo
    cuando se cumpla el caso evaluado.
    
    Puede ser usada con los siguientes tipos de datos:
        byte, short, char, int
        String, Character, Integer , entre otros
    
    La palabra reservada break, indica que cuando se ejecuta el codigo que esta 
    en ese case el flujo de control termina.
    
    la palabra reservada default es un tipo de "case" que se va a ejecutar 
    siempre que ninguna de las condiciones anteriormente evaluada sea correcta.
    
   switch (condicion){
        
            case opcion1:
                que pasa acá
                break;
            case opcion2:
                que pasa acá
                break;
             case opcion3:
                que pasa acá
                break;               
             default:
                que pasa acá
                break;
        }    
     */
    public static void main(String[] args) {

    // Ejemplo número uno con String       
        String palabra = "Hola2";

        switch (palabra) {

            case "Hola":
                System.out.println("La palabra evaluada es  :: " + palabra);
                break;
            case "Hola2":
                System.out.println("La palabra evaluada es  :: " + palabra);
                break;                
            case "Hola3":
                System.out.println("La palabra evaluada es  :: " + palabra);
                break;  
            default:
                System.out.println("No es ninguna de las opciones");
                break;
        }
        
        
        // Ejemplo número dos con numeros (Int)       
        int numero = 5;

        switch (numero) {

            case 1:
                System.out.println("El numero coincide con  :: " + numero);
                break;
            case 2:
                System.out.println("El numero coincide con  :: " + numero);
                break;                
            case 5:
                System.out.println("El numero coincide con  :: " + numero);
                break;  
            default:
                System.out.println("No es ninguna de las opciones");
                break;
        }
                
        // Ejemplo numeor tres Switch anidado
        int mes = 2;
        int anio = 2000;
        int numeroDias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (((anio % 4 == 0)
                        && !(anio % 100 == 0))
                        || (anio % 400 == 0)) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }
        System.out.println("Número de días = " + numeroDias);
    }
}