import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> dep;
    public Deposito() {
        dep = new ArrayList();
    }

    public void addProducto(T Producto) {
        dep.add(Producto);
    }

    public T getProducto() {
        if (dep.size() != 0)
            return dep.get(0);
        else
            return null;
    }
}
