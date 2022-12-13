package satelite;
/*
* Metodo void variaAltura(double desplazamiento)->parametro + o - segun se acerca a la tierra
*  o se aleja
* Metodo boolean enOrbita(): false si esta e tierra true en caso contrario
* Metodo void variaPosicion(double variaap, double variam): modifica posicion(merdiano y paralelo)
*  mediante variap y variam. estos seran + o - que modificaran la posicion del sat
*
* */
public class Satelite {
    private double altura,meridiano,paralelo;

    public Satelite(double altura, double meridiano, double paralelo) {
        this.altura = altura;
        this.meridiano = meridiano;
        this.paralelo = paralelo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(double meridiano) {
        this.meridiano = meridiano;
    }

    public double getParalelo() {
        return paralelo;
    }

    public void setParalelo(double paralelo) {
        this.paralelo = paralelo;
    }

    public void variaAltura(double desplazamiento){
        setAltura(getAltura()+desplazamiento);
    }
    public boolean enOrbita (){
        return altura > 0;
    }

    public void variaPosicion(double variap,double variam){
        setParalelo(getParalelo()+variap);
        setMeridiano(getMeridiano()+variam);
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "altura=" + altura +
                ", meridiano=" + meridiano +
                ", paralelo=" + paralelo +
                '}';
    }

    public static void main(String[] args) {
       Satelite galileo=new Satelite(1000,8,10);
       System.out.println(galileo);
       galileo.variaPosicion(-15,50);
       System.out.println(galileo);
       System.out.println(galileo.enOrbita());
       galileo.variaAltura(-5000);
       System.out.println(galileo.enOrbita());
       System.out.println(galileo);
    }
}
