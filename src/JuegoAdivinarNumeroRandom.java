import java.util.Scanner;

public class JuegoAdivinarNumeroRandom {
    public static void main(String[] args) {

        int numAleatorio = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);

        int num = 0;

        int intentos = 0;

       do {
            intentos++;
            System.out.println("Introduzca un número");

            num = input.nextInt();

            if (numAleatorio < num) {
                System.out.println("El número a adivinar es más bajo, intentelo otra vez");
            } else if (numAleatorio > num) {
                System.out.println("El número a adivinar es más alto, intentelo otra vez");
            }
        } while (num != numAleatorio);
        System.out.println("Felicitaciones! Ha adivinado el número! es: " + numAleatorio + " y lo ha adivinado en: " + intentos + " intentos");
    }
}
