public abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {}

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    @Override
    public int compareTo(Moneda mon) {
        if (this.getValor() < mon.getValor())
            return -1;
        else if (this.getValor() > mon.getValor())
            return 1;
        else
            return 0;
    }
}
