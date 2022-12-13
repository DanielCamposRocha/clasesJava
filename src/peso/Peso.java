package peso;
/*
* atributo que almacene el peso en kg
* al construcotr se le pasa el peso y la medida 'Lb' libras, 'Li' lingotes, 'Oz' onzas,'P' peniques
* 'K' kilos, 'G' gramos 'Q' quintales
* 1 libra=16 onzas= 453 gr
* 1Ligote=32.17libras=14.59kg
* 1Onza=0.0625libras=28.35gr
* 1penique=0.05onzas=1.55gr
* 1Quintal=100 libras=43.3kg
* metodo main para testear y verificar los metodos
* getLibras, getLingotes,getPeso(medida)
* */
public class Peso {
    private double kilos;
    private String medida;

    public Peso(double kilos, Medidas peso) {
        this.kilos = kilos;
        this.medida=medida;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }


}
enum Medidas
{
    Lb,Li,Oz,P,K,G,Q;
}