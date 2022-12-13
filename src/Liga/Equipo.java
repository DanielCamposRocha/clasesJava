package Liga;

public class Equipo {
    private String nombre;
    private int presupuesto;

    public Equipo(String nombre, int presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public Equipo() {
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
