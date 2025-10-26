package net.salesianos;

public class Contact {
    // Atributos 
    private String name;
    private String phone;
    private String mail;

    // Constructor
    public Contact(String name, String phone, String mail) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
//Formato para mostrar objetos Contact
@Override
    public String toString() {
        return "Nombre: " + name + "\n" +
        "Teléfono: " + phone + "\n" +
        "Correo: " + mail;
    }
}
