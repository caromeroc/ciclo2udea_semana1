package udea.cilclo2.semana1.VectoresMatriz;

import java.util.ArrayList;

public class ClaseArrayList {
    
    public static void main(String[] args) {
       
        ArrayList <String> estudiantes = new ArrayList<>();
        
        estudiantes.add("Valentina");
        estudiantes.add("Moises");
        estudiantes.add("David");
        
        for (String estudiante : estudiantes) {
            
            System.out.println(" Valor ::  "  + estudiante);
        }
    }
    
}
