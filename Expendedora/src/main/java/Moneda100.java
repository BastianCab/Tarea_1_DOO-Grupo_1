/**
 * Representa a una moneda cuyo valor es de 100. Extiende el funcionamiento de
 * {@link Moneda} para modelar los valores específicos de las monedas.
 */
public class Moneda100 extends Moneda {
    /**
     * {@inheritDoc}
     * <p>
     * En este caso, la moneda tendría un valor de 100
     * </p>
     * @return El valor de la moneda, en este caso 100.
     */
    @Override
    public int getValor() {
        return 100;
    }
}
