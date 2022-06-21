package udea.cilclo2.semana1.vectoresMatriz;

import java.util.ArrayList;
import java.util.Collections;

public class ClaseArrayList {

    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Moises");
        estudiantes.add("Valentina");
        estudiantes.add("David");

        for (String estudiante : estudiantes) {

            System.out.println(" Valor ::  " + estudiante);
        }

        Collections.sort(estudiantes);

        for (String estudiante : estudiantes) {

            System.out.println(" Valor ::  " + estudiante);
        }

    }

}
