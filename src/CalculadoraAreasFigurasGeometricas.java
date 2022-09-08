import javax.swing.*;
import java.util.Scanner;

public class CalculadoraAreasFigurasGeometricas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int figura = 0;
        //CON SWITCH
        do {
            System.out.println("Elije una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo \n5: Salir del programa");
            figura = input.nextInt();
            if (figura < 5) {
                switch (figura) {
                    case 1:
                        System.out.println("Quieres averiguar el área del cuadrado, introduce los datos requeridos en el panel. Para terminar la operación, presiona cancelar.");
                        double lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                        System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
                        break;

                    case 2:
                        System.out.println("Quieres averiguar el área del rectangulo, introduce los datos requeridos en el panel. Para terminar la operación, presiona cancelar.");
                        double base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                        double altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                        System.out.println("El área del rectángulo es: " + (base * altura));
                        break;

                    case 3:
                        System.out.println("Quieres averiguar el área del triangulo, introduce los datos requeridos en el panel. Para terminar la operación, presiona cancelar.");
                        base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                        System.out.println("El área del triángulo es: " + (base * altura) / 2);
                        break;

                    case 4:
                        System.out.println("Quieres averiguar el área del circulo, introduce los datos requeridos en el panel. Para terminar la operación, presiona cancelar.");
                        double radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce radio"));
                        System.out.println("El área del círculo es: " + Math.PI * Math.pow(radio, 2));
                        break;
                }
            } else {
                if (figura > 5) {
                    do {
                        System.out.println("Número incorrecto. Ingrese un número del 1 al 5");
                        figura = input.nextInt();
                    } while (figura > 5);

                }
                if (figura == 5) {
                    System.out.println("usted ha salido del programa");
                }
            }
        } while (figura < 5);

    }
}
