/**
 * Representa a la bebida con sabor Fanta, extiende el funcionamiento de {@link Bebida}
 * y de {@link Producto}
 */
public class Fanta extends Bebida {
    /**
     * Constructor de Fanta, con su respectivo número de serie
     * @param serie El número identificador de la bebida.
     */
    public Fanta(int serie) {
        super(serie);
    }

    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es Fanta
     * @return El sabor de la bebida, en este caso Fanta.
     * </p>
     */
    @Override
    public String consumir() {
        return "fanta";
    }
}
