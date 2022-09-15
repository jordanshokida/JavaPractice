import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorDeMailConRegEx {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String email;
        System.out.println("introduce un mail: ");
        email= in.nextLine();
        Pattern patron= Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        Matcher match = patron.matcher(email);
        if (match.matches()) {
            System.out.println("Ha ingresado un mail correcto");
        } else {
            System.out.println("Ingresó un formato no válido de mail. por favor vuelva a interntarlo");
        }
    }
}
