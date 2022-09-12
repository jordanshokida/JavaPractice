import java.util.ArrayList;

public class CadenaInvertida {
    public static void main(String[] args) {
        /*String frase = "Cadena a invertir";
        System.out.println(frase);
        StringBuilder strb = new StringBuilder(frase);
        frase = strb.reverse().toString();
        System.out.println(frase);*/

        String frase = "Cadena a invertir";
        System.out.println(frase);
        String fraseInvertida= "";
        for (int i = frase.length() - 1; i >= 0; i--) {

            fraseInvertida += frase.charAt(i);
        }
        System.out.println(fraseInvertida);
    }


}
