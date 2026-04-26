/**
 * Representa al dulce con sabor Snickers, extiende el funcionamiento de {@link Dulce}
 * y de {@link Producto}
 */
public class Snickers extends Dulce {
    /**
     * Constructor de Snickers, con su respectivo número de serie
     * @param serie El número identificador del dulce.
     */
    public Snickers(int serie) {
        super(serie);
    }

    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es Snickers
     * @return El sabor del dulce, en este caso Snickers.
     * </p>
     */
    @Override
    public String consumir() {
        return "snickers";
    }
}
