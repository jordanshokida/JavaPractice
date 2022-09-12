import java.util.Scanner;

public class ContadorDeCaracteresRepetidos {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = lector.nextLine().toLowerCase();
        System.out.println("Introduce la letra que quieres averiguar cuántas veces está repetida");

        String letraABuscar = lector.nextLine().toLowerCase();
        contarCaracteres(frase, letraABuscar);

        lector.close();
    }

    public static void contarCaracteres(String frases, String letraABuscar) {
        int contadorLetraRepetida = 0;
        for (int i = 0; i < frases.length(); i++) {
            if (frases.charAt(i) == letraABuscar.charAt(0)) {
                contadorLetraRepetida++;
            }
        }
        System.out.println("la letra " + letraABuscar + " se repite " + contadorLetraRepetida + " veces");

    }
}
