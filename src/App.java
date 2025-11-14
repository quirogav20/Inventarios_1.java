import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);


        int option = 0;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("Bienvenido a calculadora de inventarios");
            System.out.println("----------------------------------");
            System.out.println("Menu de opciones:");
            System.out.println("1. Inventarios sin descuentos");
            System.out.println("2. Inventarios con descuentos");
            System.out.println("3. Salir");
            option = lector.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Has seleccionado inventarios sin descuentos");
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
                    double t = y / d;
                    double n = l / t;
                    System.out.println("El pedido se realiza cada : " + t + " dias");
                    double le = l - (Math.floor(n) * t);
                    System.out.println("Cuando el inventario sea menor a:  " + le * d + " unidades");
                    double tcu = (k / (y / d)) + (y / 2) * h;
                    System.out.println("El costo total del inventarios es: " + tcu);
                    System.out.println("----------------------------------");
                    break;
                }
                case 2: {
                    System.out.println("Has seleccionado inventarios con descuentos");
                    System.out.println("Ingresa el valor de la demanda (D): ");
                    int d = lector.nextInt();
                    System.out.println("Ingresa el porcentaje del costo de almacenamiento (ejemplo: 0.20): ");
                    double ph = lector.nextDouble();
                    System.out.println("Ingresa el valor del costo de pedido (k): ");
                    double k = lector.nextDouble();
                    System.out.println("Ingresa el precio unitario uno (c1): ");
                    double c1 = lector.nextDouble();
                    System.out.println("Ingresa la cantidad minima para descuento (Q1): ");
                    double q1 = lector.nextDouble();
                    System.out.println("Ingresa el precio unitario dos (c2): ");
                    double c2 = lector.nextDouble();
                    System.out.println("----------------------------------");
                    System.out.println("");

                    double h1 = ph * c1;
                    double y1 = Math.sqrt((2 * d * k) / h1);
                    double tcu1 = (d * c1) + (k * d / y1) + (y1 / 2) * h1;
                    System.out.println("Opcion sin descuento:");
                    System.out.println("La cantidad del pedido es: " + y1);
                    System.out.println("El costo total del inventarios es: " + tcu1);
                    System.out.println("");

                    double h2 = ph * c2;
                    double y2 = Math.sqrt((2 * d * k) / h2);
                    double cantidadDescuento = y2;
                    if (y2 < q1) {
                        cantidadDescuento = q1;
                    }
                    double tcu2 = (d * c2) + (k * d / cantidadDescuento) + (cantidadDescuento / 2) * h2;
                    System.out.println("Opcion con descuento:");
                    System.out.println("La cantidad del pedido es: " + cantidadDescuento);
                    System.out.println("El costo total del inventarios es: " + tcu2);
                    System.out.println("");

                    if (tcu1 < tcu2) {
                        System.out.println("Conviene ordenar: " + y1 + " unidades sin descuento");
                        System.out.println("Costo total minimo: " + tcu1);
                    } else {
                        System.out.println("Conviene ordenar: " + cantidadDescuento + " unidades con descuento");
                        System.out.println("Costo total minimo: " + tcu2);
                    }

                    System.out.println("---------------------------------");
                    break;
                }
                case 3: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Opcion no valida, por favor selecciona una opcion del menu.");
                    break;
                }
            }
        } while (option != 3);
         lector.close();


    



    }
}
