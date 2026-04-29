/**
 * Representa una máquina expendedora que expende cinco clases productos
 * de dos tipos, bebidas y dulces.
 */
public class Expendedor {
    private Deposito<CocaCola> depCocaCola;
    private Deposito<Sprite> depSprite;
    private Deposito<Fanta> depFanta;
    private Deposito<Snickers> depSnickers;
    private Deposito<Super8> depSuper8s;
    private Deposito<Moneda> depMonedasVuelto;
    private int precio;

    /**
     * Constructor del expendedor, se llenan los depositos de cada producto y
     * se instancia el deposito de las monedas de vuelto.
     * @param llenarDepositos el numero de productos que va a tener cada deposito
     */
    public Expendedor(int llenarDepositos){
        this.depCocaCola = new Deposito<CocaCola>();
        this.depSprite = new Deposito<Sprite>();
        this.depFanta = new Deposito<Fanta>();
        this.depSnickers = new Deposito<Snickers>();
        this.depSuper8s = new Deposito<Super8>();
        this.depMonedasVuelto = new Deposito<Moneda>();
        for(int i = 0; i < llenarDepositos; i++){
            this.depCocaCola.addProducto(new CocaCola((i+1) + 4*i));
            this.depSprite.addProducto(new Sprite((i+2) + 4*i));
            this.depFanta.addProducto(new Fanta((i+3) + 4*i));
            this.depSnickers.addProducto(new Snickers((i+4) + 4*i));
            this.depSuper8s.addProducto(new Super8((i+5) + 4*i));
        }
    }

    /**
     * Compra del producto deseado.
     * @param moneda El dinero para comprar el producto.
     * @param cual El numero identificador del producto que se desea comprar.
     * @throws PagoIncorrectoException Si la moneda recibida es null.
     * @throws PagoInsuficienteException Si el valor de la moneda es menor al precio del producto.
     * @throws NoHayProductoException Si no quedan unidades en el depósito o el depósito no existe.
     * @return El producto comprado.
     */
    public Producto comprarProducto(Moneda moneda, int cual)
            throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        Producto p = null;
        int vueltoM100 = 0;
        if(moneda == null){
            throw new PagoIncorrectoException("No se ha ingresado una moneda válida (moneda es null).");
        }
        else if(cual != 1 && cual != 2 && cual != 3 && cual != 4 &&cual != 5){
            throw new NoHayProductoException("El número de depósito no existe o el producto no está disponible.");
        }
        else if(cual == Constantes.COCACOLA.getNumProducto()) {
            if(moneda.getValor() >= Constantes.COCACOLA.getPrecio()){
                vueltoM100 = (moneda.getValor() - Constantes.COCACOLA.getPrecio()) / 100;
            } else{
                throw new PagoInsuficienteException("El valor de la moneda es inferior al precio del producto.");
            }
            p = depCocaCola.getProducto();

        }else if(cual == Constantes.SPRITE.getNumProducto()){
            if(moneda.getValor() >= Constantes.SPRITE.getPrecio()){
                vueltoM100 = (moneda.getValor() - Constantes.SPRITE.getPrecio()) / 100;
            }else{
                throw new PagoInsuficienteException("El valor de la moneda es inferior al precio del producto.");
            }
            p = depSprite.getProducto();

        }else if(cual == Constantes.FANTA.getNumProducto()){
            if(moneda.getValor() >= Constantes.FANTA.getPrecio()){
                vueltoM100 = (moneda.getValor() - Constantes.FANTA.getPrecio()) / 100;
            }else{
                throw new PagoInsuficienteException("El valor de la moneda es inferior al precio del producto.");
            }
            p = depFanta.getProducto();

        }else if(cual == Constantes.SNICKERS.getNumProducto()){
            if(moneda.getValor() >= Constantes.SNICKERS.getPrecio()){
                vueltoM100 = (moneda.getValor() - Constantes.SNICKERS.getPrecio()) / 100;
            }else{
                throw new PagoInsuficienteException("El valor de la moneda es inferior al precio del producto.");
            }
            p = depSnickers.getProducto();

        }else if(cual == Constantes.SUPER8.getNumProducto()){
            if(moneda.getValor() >= Constantes.SUPER8.getPrecio()){
                vueltoM100 = (moneda.getValor() - Constantes.SUPER8.getPrecio()) / 100;
            }else{
                throw new PagoInsuficienteException("El valor de la moneda es inferior al precio del producto.");
            }
            p = depSuper8s.getProducto();
        }
        if(vueltoM100 > 0){
            for(int i= 0; i < vueltoM100; i++){
                depMonedasVuelto.addProducto(new Moneda100());
            }
        }
        if(p == null){
            throw new NoHayProductoException("El número de depósito no existe o el producto no está disponible.");

        }
        return p;
    }

    /**
     * Un getter para obtener las monedas de vuelto de la compra, se tiene
     * que llamar varias veces el metodo hasta sacar todas las monedas.
     * @return las monedas una por una.
     */
    public Moneda getVuelto(){
        return depMonedasVuelto.getProducto();
    }
}
