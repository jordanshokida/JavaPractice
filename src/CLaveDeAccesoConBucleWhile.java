import javax.swing.*;

public class CLaveDeAccesoConBucleWhile {
    public static void main(String[] args) {
        String password = "Jordán";

        String pass = "";

        /*while (!password.equals(pass)){
            pass = JOptionPane.showInputDialog("Introduzca la contraseña");

            if (!password.equals(pass)) {
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta");*/




        do {
            pass = JOptionPane.showInputDialog("Introduzca la contraseña");
            if (!password.equals(pass)) {
                System.out.println("Contraseña incorrecta");
            }
        }while (!password.equals(pass));

        System.out.println("Contraseña correcta");

    }
}
