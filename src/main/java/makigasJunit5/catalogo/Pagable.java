package makigasJunit5.catalogo;


import makigasJunit5.pago.PagoException;
import makigasJunit5.pago.ProveedorPagos;

public interface Pagable {
    void pagar( ProveedorPagos pagos) throws PagoException;
}