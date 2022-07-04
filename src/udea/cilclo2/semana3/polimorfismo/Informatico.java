package udea.cilclo2.semana3.polimorfismo;

public class Informatico extends Persona {

    String apellido;
    int edad;

    public Informatico(String nombre, String apellido) {
        super(nombre);
        this.apellido = apellido;
    }

    public Informatico(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    @Override
    public int correr() {
        return 0;

    }

    @Override
    public int saltar() {
        return 0;
    }

    @Override
    public int dormi() {
        throw new UnsupportedOperationException("Mi excepción"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
