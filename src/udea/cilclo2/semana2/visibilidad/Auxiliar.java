package udea.cilclo2.semana2.visibilidad;

public class Auxiliar {

    /*
        Esta clase auxiliar nos va a permitir ver la visibilidad que tienen las
        variables de la clase Publico, a través de los paquetes. Ya que auxiliar
        pertenece al mismo paquete [udea.cilclo2.semana2.visibilidad]
     */
    public static void main(String[] args) {

        /*
            Hacemos uso de la variable estatica apellido que viene de la clase
            Publico, como es estatica no necesito crear un objeto con new si no
            solamente con el nombre de la clase. puedo acceder a sus variables
            y metodos estaticos.
         */
        System.out.println(" " + Publico.apellido);

        // Creamos un objeto de la clase Publico, para poder usar las variables NO estaticas.
        Publico obj = new Publico();
        // A través del obj llamamos a la variable nombre
        System.out.println("  " + obj.nombre);

    }
}
