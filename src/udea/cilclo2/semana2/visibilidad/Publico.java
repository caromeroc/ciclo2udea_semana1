package udea.cilclo2.semana2.visibilidad;

/*
    La palabra reservada public indica que tiene un nivel de visibilidad publico
    a nivel de clase, paquete, subclase, y todos.
 */
public class Publico {

    //Declración e inicialización de variable publica
    public String nombre = "Carlos";

    //Declración e inicialización de variable publica y estatica
    public static String apellido = "Romero";

    public static void main(String[] args) {
        /*
            Uso de la variable estatica, notese que no fue necesario crear un
            objeto para poder accederla.
         */
        System.out.println(" " + apellido);

        // Creamos un objeto de la clase para poder acceder a sus variables no estaticas
        Publico miObjePubli = new Publico();

        // Accedemos a la variale nombre a través del objeto miObjePubli 
        System.out.println(" " + miObjePubli.nombre);
    }

}
