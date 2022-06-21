package udea.cilclo2.semana1.variables;

/*
    Variables Tipos :   1 Locales
                        2 Intancia / Clase
                        3 Estaticas 
 */
public class VariablesTipos {

    /*
        Esta variable estatica se inicializa e instancia una unica vez cuando la
        clase es cargada, para hacer uso de ella no es necesario instanciar la
        clase, solo con el nombre de la clase y la importación se puede usar.
        ver uso en : UsoVariableEstatica.java
     */
    public static String variableEstatica = "Soy Una variable estatica ";

    /*
        Estas variables, pueden ser usadas en cualquier lugar de la clase o 
        dentro de cualquiera de los metodos. ejemplo en el metodo mensaje. 
     */
    String varibleInstanciaInicializada = "soy una variable de instancia ya Iniciada";

    String varibleInstanciaDeclarada;

    public static void main(String[] args) {

        VariablesTipos varT = new VariablesTipos();

        varT.mensaje();
    }

    /*
        Este bloque de codigo representa un metodo o función, que ejecuta una
        porción de codigo propia, hace parte de la clase, pero puede tener
        variables locales para el.
     */
    public int suma() {

        /* 
           Estas son variables de tipo local, solo visibles y accesibles por el
           meodo suma, ejemplo, el metodo mensaje, no tendra acceso a estas 
            variables.
         */
        int numa = 3;
        int numb = 4;

        int sum = numa + numb;
        return sum;

    }

    /*
        Usamos este metodo para evidenciar el uso de las variables de Instancia.
     */
    public void mensaje() {

        // Uso
        System.out.println("Tipo de variable ::  " + varibleInstanciaInicializada);

        /*
            Esta ejecución arrojara un valor null por que solo esta declarad, pero
            no inicializada.
         */
        System.out.println("Tipo de variable ::  " + varibleInstanciaDeclarada);

    }

}
