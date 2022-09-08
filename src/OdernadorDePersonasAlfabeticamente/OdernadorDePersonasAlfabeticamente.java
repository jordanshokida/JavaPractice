package OdernadorDePersonasAlfabeticamente;

import java.util.ArrayList;
import java.util.List;

public class OdernadorDePersonasAlfabeticamente {

    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        Persona persona1 = new Persona("Jordán", "Shokida");
        Persona persona2 = new Persona("Xavier", "Repetto");
        Persona persona3 = new Persona("Roberto", "Friedman");
        Persona persona4 = new Persona("Horacio", "Mendez");
        Persona persona5 = new Persona("Nestor", "Brizuela");

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);

        //Utilizo expresiones lambda para comparar. No es necesario poner el tipo de dato,
        // ya que está implícito en listaPersonas
        listaPersonas.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        System.out.println("Ordenado por nombre: ");
        listaPersonas.forEach(System.out::println);
        listaPersonas.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
        System.out.println("Ordenado por apellido: ");
        listaPersonas.forEach(System.out::println);
        listaPersonas.sort((p1, p2) -> p2.getApellido().compareTo(p1.getApellido()));
        System.out.println("Ordenado inversamente por apellido: ");
        listaPersonas.forEach(System.out::println);

    }


}
