package modulo;

public class Gato extends Animal {
    boolean testLeucemia;

    public Gato(String chip, String nombre, int edad, String raza, boolean adoptado, boolean testLeucemia) { // Construct, cuando se cree un objeto de esta clase se introducirán aquí todos los datos del cuestionario
        super(chip, nombre, edad, raza, adoptado);
        this.testLeucemia = testLeucemia;
    }

    public void mostrar() { // Mostrará la información del objeto
        System.out.println("GATO:");
        System.out.println("Chip: " + chip);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("Adoptado: " + adoptado);
        System.out.println("Test de leucemia: " + testLeucemia);
    }
    
    public String getChip() { // Método para encotnrar el animal por el número de su chip, cuando se requiera, esta función valdrá como el núemro del chip del animal
        return chip;
    }
    
    public boolean testLeucemia() {
        return testLeucemia;
    }
}
