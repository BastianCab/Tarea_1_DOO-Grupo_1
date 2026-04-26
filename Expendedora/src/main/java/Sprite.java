/**
 * Representa a la bebida con sabor Sprite, extiende el funcionamiento de {@link Bebida}
 * y de {@link Producto}
 */
public class Sprite extends Bebida {
    /**
     * Constructor de Sprite, con su respectivo número de serie
     * @param serie El número identificador de la bebida.
     */
    public Sprite(int serie) {
        super(serie);
    }

    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es Sprite
     * @return El sabor de la bebida, en este caso Sprite.
     * </p>
     */
    @Override
    public String consumir() {
        return "sprite";
    }
}
