package companhiaAerea;

public  abstract class Aeronaves {
    private String identificador,modelo;
    private int numpsajeros,autonomiamax;

    public Aeronaves(String identificador, String modelo, int numpsajeros, int autonomiamax) {
        this.identificador = identificador;
        this.modelo = modelo;
        this.numpsajeros = numpsajeros;
        this.autonomiamax = autonomiamax;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumpsajeros() {
        return numpsajeros;
    }

    public void setNumpsajeros(int numpsajeros) {
        this.numpsajeros = numpsajeros;
    }

    public int getAutonomiamax() {
        return autonomiamax;
    }

    public void setAutonomiamax(int autonomiamax) {
        this.autonomiamax = autonomiamax;
    }
}
