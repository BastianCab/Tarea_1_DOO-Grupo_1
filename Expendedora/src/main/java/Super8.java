/**
 * Representa al dulce con sabor Super8, extiende el funcionamiento de {@link Dulce}
 * y de {@link Producto}
 */
public class Super8 extends Dulce {
    /**
     * Constructor de Super8, con su respectivo número de serie
     * @param serie El número identificador del dulce.
     */
    public Super8(int serie) {
        super(serie);
    }

    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es Super8
     * @return El sabor del dulce, en este caso Super8.
     * </p>
     */
    @Override
    public String consumir() {
        return "super8";
    }
}
