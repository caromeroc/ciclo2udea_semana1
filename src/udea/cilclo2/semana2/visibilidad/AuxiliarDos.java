
package udea.cilclo2.semana2.visibilidad;

/*
    Podemos hacer uso de la herencia para llamar las variables y metodos que sean
    posiblemnte recicldos.
*/
public class AuxiliarDos extends Protegido {
    
    public static void main(String[] args) {
        //hacemos llamada de la variable estatica apellidoProtegido
        System.out.println("" + Protegido.apellidoProtegido);
    }
    
    
}
