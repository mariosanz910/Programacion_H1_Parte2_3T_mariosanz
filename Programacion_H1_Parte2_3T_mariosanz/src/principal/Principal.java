package principal;

import java.util.ArrayList;
import java.util.Scanner;

import modulo.Animal;
import modulo.Gato;
import modulo.Perro;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        int opcion = 0;
        
        while (opcion != 4) {  
        	// Menú principal, se inicia siempre que opcion no sea igual a 4
            System.out.println("--- MENÚ ---");
            System.out.println("1. Añadir animal");
            System.out.println("2. Ver todos los animales");
            System.out.println("3. Buscar animal por chip");  
            System.out.println("4. Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  

            if (opcion == 1) { // Cuestionario que obtiene los datos necesarios que se incluyen en el contruct del objeto cuando se cree
                System.out.print("¿Qué tipo de animal quieres crear? (perro/gato): ");
                String tipo = sc.nextLine();

                System.out.print("Introduce número de chip: ");
                String chip = sc.nextLine();

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                System.out.print("Raza: ");
                String raza = sc.nextLine();

                System.out.print("¿Está adoptado? (s/n): ");
                String adop = sc.nextLine();
                boolean adoptado = false;
                
                // En función del valor de adopt se cambiará el valor de la variable a True, para mostrar que es adoptado

                if (adop.equals("s") || adop.equals("S")) {
                    adoptado = true;
                }
                
                // En función del valor de tipo, se continuará el cuestionario para preguntar sobre lso valores necesarios para añadir a un perro o un gato:

                if (tipo.equals("perro")) { // Perro con tamaño
                    System.out.print("Tamaño (pequeño/mediano/grande): ");
                    String tamaño = sc.nextLine();

                    Perro perronuevo = new Perro(chip, nombre, edad, raza, adoptado, tamaño); // Creamos el objeto y con su contruct le introducimos los valores que nos ha dado el cuestionario
                    listaAnimales.add(perronuevo); // Añadimos el objeto al array de objetos listaAnimales
                    System.out.println("Perro añadido correctamente.");

                } else if (tipo.equals("gato")) { // Gato con test de leucemia
                    System.out.print("¿Tiene test de leucemia positivo? (s/n): ");
                    String test = sc.nextLine();
                    boolean leucemia = false;

                    if (test.equals("s") || test.equals("S")) {
                        leucemia = true;
                    }

                    Gato gatonuevo = new Gato(chip, nombre, edad, raza, adoptado, leucemia); // Creamos el objeto y con su contruct le introducimos los valores que nos ha dado el cuestionario
                    listaAnimales.add(gatonuevo); // Añadimos el objeto al array de objetos listaAnimales
                    System.out.println("Gato añadido correctamente.");

                } else {
                    System.out.println("Tipo no válido.");
                }

            } else if (opcion == 2) {
                if (listaAnimales.isEmpty()) {
                    System.out.println("No hay animales en la lista.");
                } else {
                    for (Animal animal : listaAnimales) {
                        System.out.println("---------------");
                        animal.mostrar();
                        System.out.println("---------------");
                    }
                }

            } else if (opcion == 3) { 
            		System.out.print("Introduce el número de chip del animal a buscar: ");
                    String chipBuscado = sc.nextLine();

                    for (Animal animal : listaAnimales) { // Recorre el array en busca de que el método getChip de los animales retorne un valor igual al chip que se busca, si eso es así, muestra el animal usando el método
                        if ((animal.getChip()).equals(chipBuscado)) {  
                            animal.mostrar();  
                            break;
                        } else {
                        	System.out.println("No se encontró al animal con chip: " + chipBuscado);
                        }
                    }


            } else if (opcion == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
