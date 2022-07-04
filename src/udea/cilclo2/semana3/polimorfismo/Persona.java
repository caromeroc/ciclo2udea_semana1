package udea.cilclo2.semana3.polimorfismo;

public abstract class Persona {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    public abstract int correr();

    public abstract int saltar();

    public abstract int dormi();
}
