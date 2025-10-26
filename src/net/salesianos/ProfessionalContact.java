package net.salesianos;

public class ProfessionalContact extends Contact {
    // Atributos
    private String company;

    // Constructor
    public ProfessionalContact(String name, String phone, String mail, String company) {
        super(name, phone, mail);
        this.company = company;
    }

    // Getters y setters
    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    // Sobreescritura del método toString de la clase padre para mostrar también su
    // atributo company
    @Override
    public String toString() {
        return super.toString() +
                "\nEmpresa: " + company;
    }

}
