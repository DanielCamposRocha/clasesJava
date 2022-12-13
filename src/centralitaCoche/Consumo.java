package centralitaCoche;
/*
* clase consumo que forma parte de la centralita de un coche
* kms,litros,vmed.pgas de atributos
* metdos getTiempo(tiempo empleado en el viaje)consumoMedio(en litros cada 100kms)
* conumoEuros(euros cada 100 kms)
* constructor que de valor a los atributos. escoge el tipo de datos mas apropido para cada atributo
* */
public class Consumo {
    private int kms,vmed;
    private double litros,pgas;

    public Consumo(int kms, int vmed, double litros, double pgas) {
        this.kms = kms;
        this.vmed = vmed;
        this.litros = litros;
        this.pgas = pgas;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public int getVmed() {
        return vmed;
    }

    public void setVmed(int vmed) {
        this.vmed = vmed;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPgas() {
        return pgas;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }

    public static double getTiempo (Consumo consumo){
        double tiempo= consumo.getKms()/ consumo.getVmed();
        return tiempo;
    }

    public static double consumoMedio (Consumo consumo){
        double consumoMedio=(100*consumo.getLitros())/consumo.getKms();
        return consumoMedio;
    }

    public static double consumoEuros (Consumo consumo){
        double consumoEuros=consumoMedio(consumo)*consumo.getPgas();
        return consumoEuros;
    }

    public static void main(String[] args) {
            Consumo mercedes= new Consumo(198000,75,10250,1.90);
        System.out.println("tiempo de viaje en horas: "+getTiempo(mercedes));
        System.out.printf("consumo medio cada 100KMS:%.2f \n",consumoMedio(mercedes));
        System.out.printf("gasto medio en combustible cada 100KMS:%.2f \n",consumoEuros(mercedes));
    }
}
