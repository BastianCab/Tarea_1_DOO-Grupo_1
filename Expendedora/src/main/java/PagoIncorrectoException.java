/**
 * Excepción que se lanza cuando se trata de pagar con una moneda null.
 */
public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String mensaje){
        super(mensaje);
    }
}
