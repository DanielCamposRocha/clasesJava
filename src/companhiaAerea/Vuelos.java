package companhiaAerea;

public class Vuelos {
    private Aeropuertos origen;
    private Aeropuertos destino;
    private Aeronaves aeronave;

    public Vuelos(Aeropuertos origen, Aeropuertos destino, Aeronaves aeronave) {
        this.origen = origen;
        this.destino = destino;
        this.aeronave = aeronave;
    }

    public Aeropuertos getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuertos origen) {
        this.origen = origen;
    }

    public Aeropuertos getDestino() {
        return destino;
    }

    public void setDestino(Aeropuertos destino) {
        this.destino = destino;
    }

    public Aeronaves getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronaves aeronave) {
        this.aeronave = aeronave;
    }
}
