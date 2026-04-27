/**
 * Representa a una moneda cualquiera usada para comprar un producto en la máquina
 * expendedora, define los comportamientos base de cualquier moneda.
 */
public abstract class Moneda implements Comparable<Moneda> {

    /**
     * Todas las subclases debe implementarlo para saber el valor de la moneda
     * @return El valor de la moneda actual
     */
    public abstract int getValor();

    /**
     * Sobreescritura de compareTo
     * @param mon el elemento a ser comparado.
     * @return retorna un valor para organizar mas adelante
     */
    @Override
    public int compareTo(Moneda mon) {
        if (this.getValor() < mon.getValor())
            return -1;
        else if (this.getValor() > mon.getValor())
            return 1;
        else
            return 0;
    }

    /**
     * Lo que muestra en pantalla al imprimir una moneda
     * @return El valor de la moneda y su serie
     */
    @Override
    public String toString() {
        String direccion = super.toString();
        return "Valor moneda: " + this.getValor() + "\n" + "Serie: " + direccion;
    }
}
