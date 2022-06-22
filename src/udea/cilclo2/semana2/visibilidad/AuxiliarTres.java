package udea.cilclo2.semana2.visibilidad;

/*
    Usaremos esta clase auxiliar para ejemplificar como se acceder a variables 
    privadas a través de metodos Get y Set publicos.
 */

public class AuxiliarTres {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Privadas
        Privadas objPri = new Privadas();

        // Obtenemos el valor que tiene nombre en este momento, a través del Get
        System.out.println(" " + objPri.getNombreVar());

        // Renobramos el valor del nombre a través del metodo Set
        System.out.println("" + objPri.setNombreVar(" Hola mundo"));

    }

}
