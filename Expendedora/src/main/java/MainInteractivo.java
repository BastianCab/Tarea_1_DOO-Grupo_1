import java.util.Scanner;
public class MainInteractivo {
    public static void main(String[]arg){
        /**
         * Se crean los valores Iniciales
         */
        Scanner mIntScan = new Scanner(System.in);
        Moneda mIntMon = null;
        Expendedor mIntExp = new Expendedor(5);
        Comprador mIntComp = null;
        int Eleccion = 0;
        int EstadoAct = 1;
        int Resp = 0;
        /**
         * El main funciona con 2 capas
         * Switch case Estado
         * |-Switch case Respuesta (dentro de cada estado)
         * Esto para generar un codigo modular donde se puede mover
         * libremente entre las posibles etapas al comprar
         */
        while(EstadoAct!=0){
            switch (EstadoAct){
                /**
                 * Estado 1 Inicio
                 * Es el principio del codigo donde podemos
                 * empezar a comprar o irnos
                 */
                case 1:
                    System.out.print("Expendedor del Tm! \n1=Comprar \n2=Quizá después\n3=Ver consumidor\n>>");
                    Resp = mIntScan.nextInt();
                    switch (Resp){
                        case 1:
                            EstadoAct = 2;
                            break;
                        case 2:
                            EstadoAct = 0;
                            break;
                        case 3:
                            Resp = EstadoAct;
                            EstadoAct = 5;
                            break;
                        default:
                            System.out.println("Valor no valido!");
                            break;
                    }
                    break;
                case 2:
                    /**
                     * Estado 2 Moneda
                     * Aquí se instancian las monedas y se guardan en nuestro
                     * valor null o remplaza nuestra ya usada moneda
                     */
                    System.out.print("Moneda \n1=Moneda100\n2=Moneda500\n3=Moneda1000\n4=Ver consumidor\n>>");
                    Resp = mIntScan.nextInt();
                    switch (Resp){
                        case 1:
                            mIntMon = new Moneda100();
                            EstadoAct = 3;
                            break;
                        case 2:
                            mIntMon = new Moneda500();
                            EstadoAct = 3;
                            break;
                        case 3:
                            mIntMon = new Moneda1000();
                            EstadoAct = 3;
                            break;
                        case 4:
                            Resp = EstadoAct;
                            EstadoAct = 5;
                            break;
                        default:
                            System.out.println("Valor no valido!");
                            break;
                    }
                    break;
                case 3:
                    /**
                     * Estado 3 Producto
                     * Para simplificar el codigo se guarda el valor de preferencia
                     * en vez de crear el consumidor instantaneamente
                     */
                    System.out.print("Producto \n1=Cocacola\n2=Sprite\n3=Fanta\n4=Super8\n5=Snickers\n6=Ver consumidor\n>>");
                    Resp = mIntScan.nextInt();
                    switch (Resp) {
                        case 1:
                            Eleccion = Constantes.COCACOLA.getNumProducto();
                            EstadoAct = 4;
                            break;
                        case 2:
                            Eleccion = Constantes.SPRITE.getNumProducto();
                            EstadoAct = 4;
                            break;
                        case 3:
                            Eleccion = Constantes.FANTA.getNumProducto();
                            EstadoAct = 4;
                            break;
                        case 4:
                            Eleccion = Constantes.SUPER8.getNumProducto();
                            EstadoAct = 4;
                            break;
                        case 5:
                            Eleccion = Constantes.SNICKERS.getNumProducto();
                            EstadoAct = 4;
                            break;
                        case 6:
                            Resp = EstadoAct;
                            EstadoAct = 5;
                            break;
                        default:
                            System.out.println("Valor no valido!");
                            break;
                    }
                    break;
                case 4:
                    /**
                     * Estado 4 Crear Consumidor
                     * Este es peculiar ya que no cuenta como un paso
                     * sino como un proceso, solo podemos llegar aqui por el Estado 3.
                     * Aqui se crea nuestro comprador y para ahorrar memoria
                     * ocupamos el valor Resp como nuestro candidato de errores
                     * como si en vez de preguntar al usuario por un resultado
                     * se le pregunta al programa si se puede crear el nuevo comprador
                     */
                    Resp = 1;
                    try {
                        mIntComp = new Comprador(mIntMon,Eleccion,mIntExp);
                    } catch (NoHayProductoException e) {
                        System.out.println(e.getMessage());
                        Resp = 0;
                    } catch (PagoInsuficienteException e) {
                        System.out.println(e.getMessage());
                        Resp = 0;
                    } catch (PagoIncorrectoException e) {
                        System.out.println(e.getMessage());
                        Resp = 0;
                    }
                    if (Resp==1){
                        EstadoAct=5;
                    } else {
                        EstadoAct=1;
                        Resp=1;
                    }
                    break;
                case 5:
                    /**
                     * Estado 5 Consumidor
                     * Este estado funciona como "hud" donde uno puede ver la ultima compra que hizo.
                     * Cuando Este estado se asigna en un paso anterior Resp guarda el estado al que volveremos
                     * y el buffer EstadoVolver lo guarda. En el caso del estado 4 funciona como final de la compra
                     * entonces guarda en Resp el inicio en vez de donde viene
                     */
                    int EstadoVolver=Resp;
                    System.out.print("Consumidor \n1=Sabor\n2=Vuelto\n3=Volver\n>>");
                    Resp = mIntScan.nextInt();
                    if (mIntComp==null){
                        System.out.println("Todavia no compras!");
                        Resp=3;
                    }
                    switch (Resp) {
                        case 1:
                            System.out.println(mIntComp.getSabor());
                            Resp=EstadoVolver;
                            break;
                        case 2:
                            System.out.println(mIntComp.getVuelto());
                            Resp=EstadoVolver;
                            break;
                        case 3:
                            Resp=EstadoVolver;
                            EstadoAct=EstadoVolver;
                            break;
                        default:
                            System.out.println("Valor no valido!");
                            break;
                    }
                    break;
            }
        }
        System.out.print("Adios!");
        mIntScan.close();
    }
}
