/**
 * Representa un comprador cualquiera de producto para la máquina expendedora.
 */
public class Comprador {
    private String sabor;
    private int vuelto;
    /**
     * Constructor del comprador, se hace la compra en el mismo constructor.
     * @param moneda El dinero para comprar algún profucto.
     * @param numProducto El numero identificador del tipo de producto que se desea comprar.
     * @param exp El expendedor en el cual se comprará el producto.
     */
    public Comprador(Moneda moneda, int numProducto, Expendedor exp)
            throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        Producto p = exp.comprarProducto(moneda, numProducto);
        this.sabor = p.consumir();
        this.vuelto = 0;
        Moneda mVuelto;
        while ((mVuelto = exp.getVuelto()) != null){
            this.vuelto += 100;
        }
    }
    /**
     * Un getter para obtener la cantidad de vuelto de la compra.
     * @return la cantidad de vuelto de la compra.
     */
    public int getVuelto(){ return this.vuelto; }

    /**
     * Un getter para obtener el sabor del producto que se compró.
     * @return el sabor del producto comprado.
     */
    public String getSabor(){ return this.sabor; }
}
