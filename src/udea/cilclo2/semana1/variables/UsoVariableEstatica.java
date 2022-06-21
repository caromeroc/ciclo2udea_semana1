package udea.cilclo2.semana1.variables;

import static udea.cilclo2.semana1.variables.VariablesTipos.variableEstatica;

public class UsoVariableEstatica {

    /*
        Metodo que hace uso de la variable estatica de la clase VariablesTipos.java
     */
    public void llamadoVariableEstatica() {

        System.out.println("  " + variableEstatica);
    }

    /*
        Metodo que hace uso de las variables de instancia de la clase
        VariablesTipos.java
     */
    public void llamadoVarialesInstancia() {

        VariablesTipos varT = new VariablesTipos();

        System.out.println(" Imprimo la variable de Instancia  :: " + varT.varibleInstanciaInicializada);

    }

    public static void main(String[] args) {

        //Uso
        UsoVariableEstatica varS = new UsoVariableEstatica();

        varS.llamadoVariableEstatica();
        varS.llamadoVarialesInstancia();

    }

}
