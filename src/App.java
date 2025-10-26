import java.util.Scanner;

import net.salesianos.ContactManager;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== GESTOR DE CONTACTOS ===");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Editar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> ContactManager.addContact();
                case 2 -> ContactManager.showContacts();
                case 3 -> ContactManager.editContact();
                case 4 -> ContactManager.deleteContact();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (option != 5);

        scanner.close();
    }
}
