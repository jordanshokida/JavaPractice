import java.util.Scanner;

public class OrdenadorDePacientesDeAcuerdoASuEdad {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese la edad de X");
    int edad1 = entrada.nextInt();
    System.out.println("Ingrese la edad de Y");
    int edad2 = entrada.nextInt();
    System.out.println("Ingrese la edad de Z");
    int edad3 = entrada.nextInt();

    if (edad1 > edad2 && edad1 > edad3 && edad2 > edad3) {
        System.out.println("El paciente de edad " + edad1 + " será atendido primero");
        System.out.println("El paciente de edad " + edad2 + " será atendido segundo");
        System.out.println("El paciente de edad "  + edad3 +" será atendido tercero");
    }else if(edad1 > edad3 && edad3 > edad2){
        System.out.println("El paciente de edad " + edad1 + " será atendido primero");
        System.out.println("El paciente de edad "  + edad3 +" será atendido segundo");
        System.out.println("El paciente de edad "  + edad2 +" será atendido tercero");
    }
    if (edad2 > edad1 && edad2 > edad3 && edad1 > edad3) {
        System.out.println("El paciente de edad " + edad2 + " será atendido primero");
        System.out.println("El paciente de edad " + edad1 + " será atendido segundo");
        System.out.println("El paciente de edad "  + edad3 +" será atendido tercero");
    }else if(edad2 > edad3 && edad3 > edad1){
        System.out.println("El paciente de edad " + edad2 + " será atendido primero");
        System.out.println("El paciente de edad "  + edad3 +" será atendido segundo");
        System.out.println("El paciente de edad "  + edad1 +" será atendido tercero");
    }
    if (edad3 > edad2 && edad3 > edad1 && edad2 > edad1) {
        System.out.println("El paciente de edad " + edad3 + " será atendido primero");
        System.out.println("El paciente de edad " + edad2 + " será atendido segundo");
        System.out.println("El paciente de edad "  + edad1 +" será atendido tercero");
    }else if( edad3 > edad1 && edad1 > edad2){
        System.out.println("El paciente de edad " + edad3 + " será atendido primero");
        System.out.println("El paciente de edad "  + edad1 +" será atendido segundo");
        System.out.println("El paciente de edad "  + edad2 +" será atendido tercero");
    }
}
}
