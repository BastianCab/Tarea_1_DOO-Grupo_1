/**
 * Representa a una moneda cuyo valor es de 1000. Extiende el funcionamiento de
 * {@link Moneda} para modelar los valores específicos de las monedas.
 * @author Bastian, Laura y Ricardo
 * @version 1.0
 */
public class Moneda1000 extends Moneda {
    /**
     * {@inheritDoc}
     * <p>
     * En este caso, la moneda tendría el valor de 1000
     * </p>
     * @return El valor de la moneda, en este caso 1000.
     */
    @Override
    public int getValor() {
        return 1000;
    }
}
