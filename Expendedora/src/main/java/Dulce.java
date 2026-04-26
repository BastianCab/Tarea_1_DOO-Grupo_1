/**
 * Representa un artículo dulce de la máquina expendedora. Extiende la función de
 * {@link Producto} para modelar un producto dulce.
 */
public abstract class Dulce extends Producto{
    /**
     * Constructor de los dulces con su respectivo número de serie
     * @param serie El número identificador del dulce.
     */
    public Dulce(int serie) {
        super(serie);
    }
}