import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class CalculadoraDeEdadAPartirDeFechaDeNacimiento {
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println("Feha y hora actuales: " + hoy);
        LocalDate fechaAComparar = LocalDate.parse("1992-12-20");
        System.out.println("La fecha a comparar es: " + fechaAComparar + "\n");
        System.out.println("La diferencia en dias es: " + diferenciaDias() + "\n" + "La diferencia en meses es: " + diferenciaMeses() + "\n" + "La diferencia en años es:" + diferenciaSAnios() + "\n");

    }


    public static int diferenciaDias() {
        LocalDate fechaInicial = LocalDate.parse("1992-12-20");
        LocalDate fechaHoy = LocalDate.now();
        return Period.between(fechaInicial, fechaHoy).getDays();
    }


    public static int diferenciaMeses() {
        LocalDate fechaInicial = LocalDate.parse("1992-12-20");
        LocalDate fechaHOy = LocalDate.now();
        return Period.between(fechaInicial, fechaHOy).getMonths();

    }

    public static int diferenciaSAnios() {
        LocalDate fechaInicial = LocalDate.parse("1992-12-20");
        LocalDate fechaHOy = LocalDate.now();
        return Period.between(fechaInicial, fechaHOy).getYears();

    }
}
