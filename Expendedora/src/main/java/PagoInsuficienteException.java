/**
 * Excepción que se lanza cuando el monto de la moneda ingresada
 * es menor al precio del producto solicitado.
 */
public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
