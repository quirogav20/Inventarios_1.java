import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);


        System.out.println("Ingresa el valor de la demanda (D): ");
        int d = lector.nextInt();
        System.out.println("Ingresa el valor del costo de almacenamiento (h): ");
        double h = lector.nextDouble();
        System.out.println("Ingresa el valor del costo de pedido (k): ");
        double k = lector.nextDouble();
        System.out.println("Ingresa el tiempo que tarda en llegar el pedido (L): ");
        double l = lector.nextDouble();
        System.out.println("----------------------------------");
        System.out.println("");


        double y = Math.sqrt((2 * d * k) / h);
        System.out.println("La cantidad del pedido es: " + y);
        double t = (double) y / d;
        double n = l / t;
        System.out.println("El pedido se realiza cada : " + t+ "dias"); 
        double le = l-(Math.floor(n)*t);
        System.out.println("Cuando el inventario sea menor a:  " + le*d+ " unidades");
        double tcu = (k/(y / d) ) + (y / 2) * h;
        System.out.println("El costo total del inventarios es: " + tcu);
        System.out.println("----------------------------------");

    }
}
