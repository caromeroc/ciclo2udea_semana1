package udea.cilclo2.semana2.visibilidad;

/*
        La palabra reservada protected nos da la posibilidad de usar similar a 
        public con la diferencia que no es abierta para todos, solo a nivel de 
        clase, paquete, subclase, no el mundo, es decir para librerias no.
 */
public class Protegido {

    // Declaramos la variable con visibilidad protected
    protected String nombreProtegido = "Carlos Protegido";
    // Declaramos la variable con visibilidad protected y ademas estatica
    protected static String apellidoProtegido = "Romero Protegido";

    public static void main(String[] args) {

        // uso de variable tipo estatica a nivel de clase
        System.out.println(" " + apellidoProtegido);

        // creación de objeto para acceder a variables no estaticas
        Protegido obj = new Protegido();
        // Uso de variable a través del objeto.
        System.out.println(" " + obj.nombreProtegido);
    }

}
