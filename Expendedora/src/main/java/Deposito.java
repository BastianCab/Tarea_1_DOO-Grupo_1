import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> productos;
    public Deposito() {
        productos = new ArrayList();
    }

    public void addProducto(T Producto) {
        productos.add(Producto);
    }

    public T getProducto() {
        if (productos.size() != 0)
            return productos.get(0);
        else
            return null;
    }
}
