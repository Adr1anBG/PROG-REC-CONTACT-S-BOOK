package net.salesianos;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    private static ArrayList<Contact> contactList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Método para agregar un contacto
    public static void addContact() {
        System.out.println("¿Es un contacto profesional? (s/n): ");
        String tipe = scanner.nextLine();

        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        System.out.print("Teléfono: ");
        String phone = scanner.nextLine();
        System.out.print("Correo: ");
        String mail = scanner.nextLine();
        
        // Se pregunta por el nombre de la compañia en caso de ser de tipo profesional
        if (tipe.equalsIgnoreCase("s")) {
            System.out.print("Empresa: ");
            String company = scanner.nextLine();
            contactList.add(new ProfessionalContact(name, phone, mail, company));
        } else {
            contactList.add(new Contact(name, phone, mail));
        }

        System.out.println("Contacto agregado correctamente.");
    }

    // Método para mostrar todos los contactos
    public static void mostrarContactos() {
        if (contactList.isEmpty()) {
            System.out.println("No hay contactos guardados.");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println("\nContacto #" + (i + 1));
                contactList.get(i);
            }
        }
    }

    // Método para eliminar un contacto
    public static void eliminarContacto() {
        mostrarContactos();
        System.out.print("\nIngrese el número del contacto a eliminar: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < contactList.size()) {
            contactList.remove(index);
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("Número inválido.");
        }
    }

    // Método para editar un contacto
    public static void editarContacto() {
        mostrarContactos();
        System.out.print("\nIngrese el número del contacto a editar: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < contactList.size()) {
            Contact contact = contactList.get(index);

            System.out.print("Nuevo nombre (" + contact.getName() + "): ");
            contact.setName(scanner.nextLine());
            System.out.print("Nuevo teléfono (" + contact.getPhone() + "): ");
            contact.setPhone(scanner.nextLine());
            System.out.print("Nuevo correo (" + contact.getMail() + "): ");
            contact.setMail(scanner.nextLine());

            // Se comprueba si el contacto es de tipo profesional
            if (contact instanceof ProfessionalContact) {
                ProfessionalContact professionalContact = (ProfessionalContact) contact;
                System.out.print("Nueva empresa (" + professionalContact.getCompany() + "): ");
                professionalContact.setCompany(scanner.nextLine());
            }

            System.out.println("Contacto editado correctamente.");
        } else {
            System.out.println("Número inválido.");
        }
    }
}
