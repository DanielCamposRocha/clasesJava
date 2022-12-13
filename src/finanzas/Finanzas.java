package finanzas;
/*clase finanzas que convierta dolares a euros
* Codifica los metodos dolares toEuros eurosToDolares
* pruebas la clase
* constructor finanzas por defectos*/
public class Finanzas {

    private  double cambio;

    public Finanzas() {
        cambio = 1.36;
    }

    public Finanzas(double cambio){
        this.cambio=cambio;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public double dolaresToEuro(double dolares){
     double euros=dolares/cambio;
     return euros;
    }

    public double euroToDolares(double euros){
        double dolares=euros*cambio;
        return dolares;
    }

}
