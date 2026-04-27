/**
 * Excepción que se lanza si el numero del producto es incorrecto (no existe)
 * o no hay productos en el deposito
 */
public class NoHayProductoException extends Exception{
    public NoHayProductoException(String mensaje){
        super(mensaje);
    }
}
