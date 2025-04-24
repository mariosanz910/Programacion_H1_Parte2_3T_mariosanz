package modulo;

public abstract class Animal {
    String chip;
    String nombre;
    int edad;
    String raza;
    boolean adoptado;

    public Animal(String chip, String nombre, int edad, String raza, boolean adoptado) { // Construct de animal, de esta clase heredarán el resto a modo de contruct
        this.chip = chip;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.adoptado = adoptado;
    }

    public abstract void mostrar();
    
    public abstract String getChip();
    
    public boolean isAdoptado() {
        return adoptado;
    }
    
    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }


}