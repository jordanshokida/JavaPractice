package CuentaBancaria;

import java.util.Scanner;

/*Crear una clase Cuenta bancaria! La misma tiene que tener los siguientes atributos/estados: estaActiva, cantidadDeFondos, nombreTitular.
 Y aparte de los getter y setter de estos atributos, un metodo que nos devuelva un String que nos diga que categoria es la cuenta, categoria “A” es que tiene mas de 100.000,
  categoria “B” es que tiene entre 50.000 a 99.999, categoria “C” que tiene entre 1 a 49.999, y categoria “D” sino tiene fondos! Y otros 2 metodos que me permitan sumar o
   restar fondos de la cuenta bancaria.

En el main crear un objeto de la cuentaBancaria, e ir agregando y quitando fondos con los metodos creados, e ir imprimiendo por consola que categoria tiene esa cuenta.*/
public class CuentaBancaria {
    private boolean estaActiva;
    private double cantidadDeFondos;
    private String nombreTitular;

    public CuentaBancaria(boolean estaActiva, double cantidadDeFondos, String nombreTitular) {
        this.estaActiva = estaActiva;
        this.cantidadDeFondos = cantidadDeFondos;
        this.nombreTitular = nombreTitular;
    }

    //getters y setters
    public boolean isEstaActiva() {
        return estaActiva;
    }

    public void setEstaActiva(boolean estaActiva) {
        this.estaActiva = estaActiva;
    }

    public double getCantidadDeFondos() {
        return cantidadDeFondos;
    }

    public void setCantidadDeFondos(double cantidadDeFondos) {
        this.cantidadDeFondos = cantidadDeFondos;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setTipoDeCuenta(double cantidadDeFondos) {
        if (cantidadDeFondos >= 100000) {
            System.out.println("\n Su categoria es la A");
        } else if (cantidadDeFondos < 100000 && cantidadDeFondos >= 50000) {
            System.out.println("\n Su categoria es la B");
        } else if (cantidadDeFondos < 50000 && cantidadDeFondos > 0) {
            System.out.println("\n Su categoria es la C");
        } else if (cantidadDeFondos == 0) {
            System.out.println("\n Su categoria es la D");
        } else {
            System.out.println("Error, su cuenta no puede ser negativa");
            System.exit(-1);
        }


    }

    Scanner sc = new Scanner(System.in);

    public double SumarFondos(double cantidadDeFondos) {
        System.out.println("Indique el monto a ingresar");
        double ingresar = sc.nextDouble();
        if (ingresar >= 0) {
            return this.cantidadDeFondos = cantidadDeFondos + ingresar;
        } else {
            System.out.println("No se puede ingresar un número negativo");
            return cantidadDeFondos;
        }


    }

    public double restarFondos(double cantidadDeFondos) {
        System.out.println("ingrese la cantidad a retirar");
        double ingresar = sc.nextDouble();
        if ((cantidadDeFondos - ingresar) < 0) {
            System.out.println("No puede retirar más de " + cantidadDeFondos + " pesos ");
            return cantidadDeFondos;
        }
        if (ingresar < 0) {
            System.out.println("No se puede ingresar montos negativos");
            return cantidadDeFondos;
        } else {
            return this.cantidadDeFondos = cantidadDeFondos - ingresar;
        }

    }
}
