package udea.cilclo2.semana2.visibilidad;

/*
    Este nivel de visibilidad se asemeja a un public, pero no es accesible a nivel
    de subclase en diferentes paquetes.

    
 */
public class PorDefecto {

    String nombre = "Carlos por defecto";
    static String apellido = "Romero por defecto";

    public static void main(String[] args) {
//Uso de variable dentro de la misma clase
        System.out.println(" " + apellido);
    }

    public class subClase {
// Uso de variable en sub clase mismo paquete, permitido

        public static void main(String[] args) {
            System.out.println("" + apellido);
        }

    }

}
