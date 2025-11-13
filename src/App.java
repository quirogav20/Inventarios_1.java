import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);


        System.out.println("Ingresa el valor de la demanda (D): ");
        int d = lector.nextInt();
        System.out.println("Ingresa el valor del costo de almacenamiento (h): ");
        int h = lector.nextInt();
        System.out.println("Ingresa el valor del costo de pedido (k): ");
        int k = lector.nextInt();
        System.out.println("Ingresa el tiempo que trada en llegar el pedido (L): ");
        int l = lector.nextInt();
        System.out.println("----------------------------------");
        System.out.println("");


        double y = Math.sqrt((2 * d * k) / h);
        System.out.println("La cantidad del pedido es: " + y);
        double t = (double) y / d;
        System.out.println("El numero se realiza cada : " + t+ "dias");
        double n = l/t;
        double le = l-(Math.floor(n)*t);
        System.out.println("El punto de reorden es: " + le*d);
        double tcu = (k/(y / d) ) + (y / 2) * h;
        System.out.println("El costo total del inventarios es: " + tcu);
        System.out.println("----------------------------------");

    }
}
