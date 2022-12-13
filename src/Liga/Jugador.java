package Liga;

import Liga.Equipo;

public class Jugador {
    private String dni;
    private String nombre;
    private String apellidos;
    private int anhodenacimiento;
    private Equipo equipo;

    public Jugador(String dni, String nombre, String apellidos, int anhodenacimiento,Equipo equipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anhodenacimiento = anhodenacimiento;
        this.equipo=equipo;
    }

    public Jugador() {
    }

    public int getAnhodenacimiento() {
        return anhodenacimiento;
    }

    public void setAnhodenacimiento(int anhodenacimiento) {
        this.anhodenacimiento = anhodenacimiento;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
