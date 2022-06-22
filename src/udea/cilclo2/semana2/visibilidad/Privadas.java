package udea.cilclo2.semana2.visibilidad;
/*
    El modificador de acceso mas restrictivo, solo nos da visibilidad dentro de
    la misma clase, o a través de metodos publicos Get Set podremos tener acceso
    a estas, se conoce como encapsulamiento.
*/
public class Privadas {
    
    // Variable privada
    private String nombreVar = "Carlos Privada";
    // Variable privada y estatica
    private static String apellidoVar = "Romero Privada";


    public static void main(String[] args) {
        // uso de variable dentro de la misma clase
        System.out.println(" " + apellidoVar);
        
        // uso de variable dentro de la misma clase pero a través del metodo get
        System.out.println(" " + getApellidoVar());
    }

    // Metodo Get y Set que nos permiten acceder a estas variables desde clases foraneas

    public String getNombreVar() {
        return nombreVar;
    }

    public String setNombreVar(String nombreVar) {
      return  this.nombreVar = nombreVar;
    }


    public static String getApellidoVar() {
        return apellidoVar;
    }

 
    public static void setApellidoVar(String aApellidoVar) {
        apellidoVar = aApellidoVar;
    }

}
