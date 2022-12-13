package minumero;
/*
* alamcena un numero entero y tiene las sig caracteristicas
* construcotr por defecto que inicializa a 0 el numero interno
* constructor que inicializa el numero
* metodo aniade que le suma un numero al valor
* metodo resta
* metodo getValor, getDoble,getTriple,setNumero
* */
public class Numero {
    private int valor;

    public Numero() {
        this.valor = 0;
    }

    public Numero( int valor){
        this.valor=valor;
    }

    public int getValor() {
        return valor;
    }

    public int getDoble() {
        return valor*2;
    }

    public int getTriple() {
        return valor*3;
    }

    public void setNumero(int valor) {
        this.valor = valor;
    }

    public void aniade(int suma){
        valor= getValor()+suma;
    }

    public void resta(int resta){
        valor=getValor()-resta;
    }

    public static void main(String[] args) {
        Numero asd=new Numero(20);
        System.out.println(asd);
        asd.setNumero(10);
        System.out.println(asd);
        asd.aniade(5);
        System.out.println("la suma de 10 y 5: "+asd);
        asd.resta(5);
        System.out.println("la resta de 15 y 5: "+asd);
        System.out.println("doble: "+asd.getDoble()+" triple: "+asd.getTriple());
        System.out.println(new Numero());

    }

    @Override
    public String toString() {
        return "Numero{" +
                "valor=" + valor +
                '}';
    }
}
