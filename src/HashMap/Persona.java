package HashMap;

/**
 * Created by DAM on 21/9/16.
 */
public class Persona {
    private String dni;
    private String NumSeguridadSocial;
    private String nombre;
    private String apellidos;
    private int edad;
    private double salario;

    public Persona(String dni, String numSeguridadSocial, String nombre, String apellidos, int edad, double salario) {
        this.dni = dni;
        NumSeguridadSocial = numSeguridadSocial;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumSeguridadSocial() {
        return NumSeguridadSocial;
    }

    public void setNumSeguridadSocial(String numSeguridadSocial) {
        NumSeguridadSocial = numSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", NumSeguridadSocial='" + NumSeguridadSocial + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}'+System.lineSeparator();
    }
}
