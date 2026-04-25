public enum Constantes {
    COCACOLA(200, 1),
    SPRITE(100, 2),
    FANTA(100, 3),
    SUPER8(100, 4),
    SNICKERS(200, 5);

    private final int Precio;
    private final int numProducto;

    Constantes(int precio, int numProducto) {
        this.Precio = precio;
        this.numProducto = numProducto;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getNumProducto() {
        return numProducto;
    }
}
