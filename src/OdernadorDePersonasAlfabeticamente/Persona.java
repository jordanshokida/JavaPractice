package OdernadorDePersonasAlfabeticamente;

public class Persona {
    //Variables de clase(son private para poder llamarlas solo desde la clase)
    private String nombre;
    private String apellido;

    //Constructor
    public Persona(String nom, String ap) {
        nombre = nom;
        apellido = ap;
    }

    //Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    //Sobreescribo el método toString para que devuelva un String al imprimir una instancia de la clase Persona
    @Override
    public String toString() {
        return "Persona nombre=" + nombre + ", apellido=" + apellido;
    }


}
