package udea.cilclo2.semana1.variables;


/*
        Constantes:  La palabra reservada final indica que es una constante inmutable
        y que su valor no puede ser reasignado.
 */
public class Constantes {

    // Declaración - Inicialización
    static final String PAIS = "COLOMBIA";

    // Variable estatica normal
    static String Departamento = "Bogota";

    public static void main(String[] args) {

        // Intento modificar la constante con final
        //PAIS = "otras cosa"; // NO es permitido
        // Intento modificar la variable sin final
        Departamento = "Antioquia";

        // Uso
        System.err.println("Mi nombre es  : " + PAIS);
        System.err.println("Mi nombre es  : " + Departamento);

    }

}
