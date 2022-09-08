package CuentaBancaria;

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

    public void SumarFondos(){

    }

    public void restarFondos(){
    }
}
