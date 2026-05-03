import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static public void main(String[] args) {
        /**
         * Se crea un expendedor que ocuparemos para nuestras pruebas
         */
        Expendedor mainExp = new Expendedor(5);
        /**
         * Prueba #1
         * Compra exitosa con vuelto extra
         * En este caso imprime un resultado normal
         */
        try {
            Comprador mainCom1 = new Comprador(new Moneda1000(),Constantes.COCACOLA.getNumProducto(),mainExp);
            System.out.println("Consumio: " + mainCom1.getSabor() + " Vuelto: " + mainCom1.getVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        /**
         * Prueba #2
         * Comprar sin moneda
         * En este caso imprime la exepcion: PagoIncorrecto
         */
        try {
            Comprador mainCom2 = new Comprador(null,Constantes.SPRITE.getNumProducto(),mainExp);
            System.out.println("Consumio: " + mainCom2.getSabor() + " Vuelto: " + mainCom2.getVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        /**
         * Prueba #3
         * Compra con dinero insuficiente
         * En este caso imprime la exepcion: PagoIncorrecto
         */
        try {
            Comprador mainCom3 = new Comprador(new Moneda100(),Constantes.SNICKERS.getNumProducto(), mainExp);
            System.out.println("Consumio: " + mainCom3.getSabor() + " Vuelto: " + mainCom3.getSabor());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        /**
         * Prueba #4
         * Compra con codigo inexsistente
         * En este caso imprime la exepcion: PagoIncorrecto
         */
        try {
            Comprador mainCom4 = new Comprador(new Moneda500(),99,mainExp);
            System.out.println("Consumio: " + mainCom4.getSabor() + " Vuelto: " + mainCom4.getVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        /**
         * Prueba #5
         * Compra sin deposito
         * En este caso imprime la exepcion: PagoIncorrecto
         */
        Expendedor ExpEmpty = new Expendedor(0);
        try {
            Comprador mainCom5 = new Comprador(new Moneda1000(),Constantes.FANTA.getNumProducto(), ExpEmpty);
            System.out.println("Consumio: " + mainCom5.getSabor() + " Vuelto: " + mainCom5.getVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        /**
         * Prueba #6
         * Sort de monedas
         * Creamos nuestra lista de monedas
         */
        ArrayList<Moneda> sortMon = new ArrayList<Moneda>();
        sortMon.add(new Moneda1000());
        sortMon.add(new Moneda500());
        sortMon.add(new Moneda100());
        sortMon.add(new Moneda500());
        /**
         * Ahora hacemos el sort
         */
        Collections.sort(sortMon);
        for (Moneda m : sortMon) {
            System.out.println(m);
        }
    }
}