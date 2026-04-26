/**
 * Representa un artículo cualquiera que puede ser almacenado y vendido por la máquina
 * expendedora, define el comportamiento base para los productos consumibles.
 */
public abstract class Producto {
    private int serie;

    /**
     * Constructor base para cualquier producto
     * @param serie El número identificador de cada producto (número de serie).
     */
    public Producto(int serie) {
        this.serie = serie;
    }

    /**
     * Un getter para conseguir el número de serie de cualquier producto
     * @return El número de serie del producto actual
     */
    public int getSerie() {
        return serie;
    }

    /**
     * Consume el producto, lo deben implementar todas las subclases para definir lo que pasa
     * al consumir el artículo.
     * @return El sabor del producto consumido.
     */
    public abstract String consumir();
}
