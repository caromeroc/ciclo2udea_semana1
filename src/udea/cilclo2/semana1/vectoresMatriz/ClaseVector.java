package udea.cilclo2.semana1.vectoresMatriz;

import java.util.Vector;

public class ClaseVector {
    
    
    public static void main(String[] args) {
        
        Vector miVector = new Vector();
        
        miVector.addElement(2);
        miVector.addElement("Texto");
        
        for (Object imprimir : miVector) {
            
            System.out.println(" El elemento es :: "  + imprimir);
        }
        
    }
    
}
