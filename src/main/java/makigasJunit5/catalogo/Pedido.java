package makigasJunit5.catalogo;

import makigasJunit5.pago.PagoException;
import makigasJunit5.pago.ProveedorPagos;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Carrito, Pagable{

    private final List<Producto> productos = new ArrayList<>();

    @Override
    public void agregar(Producto p) {
        this.productos.add(p);
    }

    @Override
    public int cantidad() {
        return productos.size();
    }

    @Override
    public int total() {
        return this.productos.stream()
                .map(Producto::getPrecio)
                .reduce(0, Integer::sum);
    }

    @Override
    public void vaciar() {
        productos.clear();
    }

    @Override
    public void pagar(ProveedorPagos pagos) throws PagoException {

    }
}