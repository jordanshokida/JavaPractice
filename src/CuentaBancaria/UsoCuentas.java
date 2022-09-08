package CuentaBancaria;

import java.util.Scanner;

public class UsoCuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(true, 20000, "Jordán Shokida");
        cuenta.setTipoDeCuenta(cuenta.getCantidadDeFondos());

        System.out.println("Bienvenido a su cuenta, señor: " + cuenta.getNombreTitular()  + "\nSu saldo actual es de " + cuenta.getCantidadDeFondos() +  "\nPara ingresar dinero ingrese 1 \nPara retirar dinero ingrese 2 \nPara salir ingrese 0");

        Scanner input = new Scanner(System.in);
        int opcion = input.nextInt();

        if (opcion == 1) {
            cuenta.SumarFondos(cuenta.getCantidadDeFondos());
            cuenta.setTipoDeCuenta(cuenta.getCantidadDeFondos());
            System.out.println("Total: " + cuenta.getCantidadDeFondos());
        } else if (opcion == 2) {
            cuenta.restarFondos(cuenta.getCantidadDeFondos());
            cuenta.setTipoDeCuenta(cuenta.getCantidadDeFondos());
            System.out.println("Total: " + cuenta.getCantidadDeFondos());
        } else if (opcion == 0) {

            System.out.println("Operación terminada ");
            System.exit(0);
        } else {
            System.out.println("Error, debe ingresar la opción requerida.");
        }


    }
}
