import javax.swing.*;

public class CalculadoraFactorialConBucleFor {
    public static void main(String[] args) {
        double resultado = 1;

        double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el número"));

        for (double i = numero; i > 0; i--) {

            resultado = resultado * i;
        }

        System.out.println("El resultado del factorial de " + numero + " es: " + resultado);

    }
}
