import java.util.Scanner;

public class SeparadorNumeroDecimalDeEntero {
    public static void main(String[] args) {
        //Creo un objeto perteneciente a la clase Scanner para introducir datos por consola
        Scanner entrada= new Scanner(System.in);

        System.out.println("Introduce un número decimal");
        //Guardo dato de tipo float en la variable numero
        float numero= entrada.nextFloat();

        //Guardo en la variable, el resto de dividir el número ingresado, por 1.
        float parteDecimal= numero % 1;

        //Guardo en la variable, solo la parte entera,
        // y casteo la variable numero a entero
        int parteEntera= (int)numero;

        //Imprimo en consola un mensaje concatenado, con las variables solicitadas
        System.out.println("Parte entera: " + parteEntera + ", Parte Decimal: " + parteDecimal);
    }

}
