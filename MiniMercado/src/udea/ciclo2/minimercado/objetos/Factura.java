package udea.ciclo2.minimercado.objetos;

import java.util.ArrayList;
import java.util.Date;

public class Factura {

    public Date fecha;
    public int consecutivo;
    public Double totalFactura;
    Cliente objCliente;
    ArrayList<Pedido> arrayPedido;

    public Factura(Date fecha, int consecutivo, Double totalFactura, Cliente objCliente, ArrayList<Pedido> arrayPedido) {
        this.fecha = fecha;
        this.consecutivo = consecutivo;
        this.totalFactura = totalFactura;
        this.objCliente = objCliente;
        this.arrayPedido = arrayPedido;
    }
}
