package modulo;

public class Perro extends Animal {
    String tamaño;

    public Perro(String chip, String nombre, int edad, String raza, boolean adoptado, String tamaño) { // Construct, cuando se cree un objeto de esta clase se introducirán aquí todos los datos del cuestionario
        super(chip, nombre, edad, raza, adoptado);
        this.tamaño = tamaño;
    }

    public void mostrar() { // Mostrará la información del objeto
        System.out.println("PERRO:");
        System.out.println("Chip: " + chip);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("Adoptado: " + adoptado);
        System.out.println("Tamaño: " + tamaño);
    }
    
    public String getChip() { // Método para encotnrar el animal por el número de su chip, cuando se requiera, esta función valdrá como el núemro del chip del animal
        return chip;
    }
}