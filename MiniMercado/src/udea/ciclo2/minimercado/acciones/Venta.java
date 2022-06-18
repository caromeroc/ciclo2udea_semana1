package udea.ciclo2.minimercado.acciones;

import java.util.ArrayList;
import java.util.Date;
import udea.ciclo2.minimercado.objetos.Articulo;
import udea.ciclo2.minimercado.objetos.Cliente;
import udea.ciclo2.minimercado.objetos.Factura;
import udea.ciclo2.minimercado.objetos.Pedido;

public class Venta {

    public void venta() {

        Cliente miCliente = new Cliente("Carlos", "Romero", 33);

        Articulo miArticulo1 = new Articulo("Arroz", 1000);
        Articulo miArticulo2 = new Articulo("Pasta", 2500);
        Articulo miArticulo3 = new Articulo("Carne", 3200);

        ArrayList<Articulo> arrArticulo = new ArrayList<>();
        arrArticulo.add(miArticulo1);
        arrArticulo.add(miArticulo2);
        arrArticulo.add(miArticulo3);

        Pedido miPedido = new Pedido(0001, 12345, arrArticulo);

        ArrayList<Pedido> arrPedido = new ArrayList<>();

        arrPedido.add(miPedido);

        Date fecha = new Date();

        Factura miFactura = new Factura(fecha, 000001, totalFactura(arrPedido), miCliente, arrPedido);
        
        System.out.println("La fecha de esta factura es :: " + miFactura.fecha);
        System.out.println("El toal del pedido es :: " + miFactura.totalFactura);
    }
    
    /*
     Este metodo hae uso de ciclos for para calcular el valor total a pagar por 
     los articulos dentro del pedido.    
    */
    
    public double totalFactura(ArrayList<Pedido> arrayPedido) {

        double totalPagar = 0;

        for (Pedido pedido : arrayPedido) {

            for (Articulo articulo : pedido.arrayArticulos) {
                totalPagar += articulo.precio;
            }

        }
        //System.out.println("El Total de la factura es :: " + totalPagar);
        return totalPagar;

    }

}
