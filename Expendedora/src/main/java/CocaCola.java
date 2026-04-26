/**
 * Representa a la bebida con sabor CocaCola, extiende el funcionamiento de {@link Bebida}
 * y de {@link Producto}
 */
public class CocaCola extends Bebida {
    /**
     * Constructor de CocaCola, con su respectivo número de serie
     * @param serie El número identificador de la bebida.
     */
    public CocaCola(int serie) {
        super(serie);
    }

    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es CocaCola
     * @return El sabor de la bebida, en este caso CocaCola.
     * </p>
     */
    @Override
    public String consumir() {
        return "cocacola";
    }
}
