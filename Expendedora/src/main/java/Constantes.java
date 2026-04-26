/**
 * Representa el catálogo de productos para comprar en la máquina expendedora.
 * A cada artículo se le asigna un precio y un número para elegirlo en la máquina
 * expendedora fijos.
 */
public enum Constantes {
    /** Bebida CocaCola */
    COCACOLA(200, 1),

    /** Bebida Sprite */
    SPRITE(100, 2),

    /** Bebida Fanta */
    FANTA(100, 3),

    /** Dulce Super8 */
    SUPER8(100, 4),

    /** Dulce Snickers */
    SNICKERS(200, 5);

    /** El valor de el producto */
    private final int Precio;

    /** El número para elegirlo en la máquina expendedora */
    private final int numProducto;

    /**
     * Constructor de Constantes para asignarle el precio a el producto y su número
     * en la máquina expendedora
     * @param precio El valor que tendrá como precio el artículo
     * @param numProducto El número que tendrá el artículo en la máquina expendedora
     */
    Constantes(int precio, int numProducto) {
        this.Precio = precio;
        this.numProducto = numProducto;
    }

    /**
     * Getter del precio del artículo
     * @return El precio del producto
     */
    public int getPrecio() {
        return Precio;
    }

    /**
     * Getter del número en la máquina expendedora para elegir el artículo
     * @return El número para elegir el artículo en la máquina expendedora
     */
    public int getNumProducto() {
        return numProducto;
    }
}
