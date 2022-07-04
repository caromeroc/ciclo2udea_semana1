package udea.cilclo2.semana3.polimorfismo;

public class Deportista extends Persona{

    public Deportista(String nombre) {
        super(nombre);
    }
    
    

    @Override
    public int correr() {
        
        return 100;
    }

    @Override
    public int saltar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int dormi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
