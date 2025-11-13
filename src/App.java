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


        double y = Math.sqrt((2 * d * k) / h);
        System.out.println("La cantidad del pedido es: " + y);


    }
}
