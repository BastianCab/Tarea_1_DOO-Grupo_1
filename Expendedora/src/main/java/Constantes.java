public enum Constantes {
    COCACOLA(200),
    SPRITE(150),
    FANTA(150),
    SUPER8(100),
    SNICKERS(200);

    private final int Precio;

    Constantes(int precio) {
        this.Precio = precio;
    }

    public int getPrecio() {
        return Precio;
    }
}
