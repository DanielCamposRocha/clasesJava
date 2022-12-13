package companhiaAerea;

public class AeronavesTurbinas extends Aeronaves{
    private int numturbinas;
    private String modeloturbinas;

    public AeronavesTurbinas(String identificador, String modelo, int numpsajeros, int autonomiamax, int numturbinas, String modeloturbinas) {
        super(identificador, modelo, numpsajeros, autonomiamax);
        this.numturbinas = numturbinas;
        this.modeloturbinas = modeloturbinas;
    }

    public int getNumturbinas() {
        return numturbinas;
    }

    public void setNumturbinas(int numturbinas) {
        this.numturbinas = numturbinas;
    }

    public String getModeloturbinas() {
        return modeloturbinas;
    }

    public void setModeloturbinas(String modeloturbinas) {
        this.modeloturbinas = modeloturbinas;
    }
}
