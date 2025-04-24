package modulo;

public class Adopcion {
    // Atributos de la clase, se almacenan los datos relacionados con la adopción
    private String chipAnimal;
    private String nombreAdoptante;
    private String dniAdoptante;

    // Constructor que inicializa los atributos de la adopción
    public Adopcion(String chipAnimal, String nombreAdoptante, String dniAdoptante) {
        this.chipAnimal = chipAnimal;
        this.nombreAdoptante = nombreAdoptante;
        this.dniAdoptante = dniAdoptante;
    }

    // Método para mostrar los detalles de la adopción realizada
    public void mostrar() {
        System.out.println("Adopción realizada:");
        System.out.println("Animal con chip: " + chipAnimal);
        System.out.println("Adoptado por: " + nombreAdoptante + " (DNI: " + dniAdoptante + ")");
    }
}