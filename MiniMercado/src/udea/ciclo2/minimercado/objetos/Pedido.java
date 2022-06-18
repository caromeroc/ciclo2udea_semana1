package udea.ciclo2.minimercado.objetos;

import java.util.ArrayList;

public class Pedido {
   
   public int consecutivo;
   public int clientId ;
   public ArrayList<Articulo> arrayArticulos ;

    public Pedido(int consecutivo, int clientId, ArrayList<Articulo> arrayArticulos) {
        this.consecutivo = consecutivo;
        this.clientId = clientId;
        this.arrayArticulos = arrayArticulos;
    }

}
