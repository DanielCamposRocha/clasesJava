package companhiaAerea;

public class Aeropuertos {

    private Localizaciones localizacion;
    private String identificador,nombre;

    public Aeropuertos(String identificador, String nombre,Localizaciones localizacion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.localizacion=localizacion;
    }

    public Localizaciones getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizaciones localizacion) {
        this.localizacion = localizacion;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
