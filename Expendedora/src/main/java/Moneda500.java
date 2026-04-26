/**
 * Representa a una moneda cuyo valor es de 500. Extiende el funcionamiento de
 * {@link Moneda} para modelar los valores específicos de las monedas.
 */
public class Moneda500 extends Moneda {
    /**
     * {@inheritDoc}
     * <p>
     * En este caso, la moneda tendría un valor de 500
     * </p>
     * @return El valor de la moneda, en este caso 500.
     */
    @Override
    public int getValor() {
        return 500;
    }
}
