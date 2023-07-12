
package holamundo;


import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la Opción 1");
                    break;
                case 2:
                    System.out.println("Seleccionaste la Opción 2");
                    break;
                case 3:
                    System.out.println("Seleccionaste la Opción 3");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }
}
