import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BuscadorDeNombresQueEmpiezanConR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        String nombre;

        do {
            System.out.println("Ingrese nombre o esc para finalizar");
            nombre = entrada.nextLine();
            nombres.add(nombre);
        }
        while (!"ESC".equalsIgnoreCase(nombre));
        nombres.remove(nombres.get(nombres.size() - 1));
        System.out.println("La lista está formada por: ");
        System.out.println(nombres);



        for (String elemento : nombres) {
            if (elemento.startsWith("R")) {
                System.out.println("tenemos el nombre con R: " + elemento);

                }
            }

        }

    }
