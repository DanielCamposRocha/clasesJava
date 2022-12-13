package minumero;
/*clase mi numero que proporcione el doble, triple y cuadruple de un numero proporcionado en su constructor
.la clase debe tenr un metodo main y comprueba los metodos*/
public class Minumero {
    private int num=0;
    public static void main(String[] args) {
        Minumero asd=new Minumero(5);

System.out.println("doble: "+asd.getdoble());
System.out.println("triple: "+asd.gettriple());
System.out.println("cuadruple: "+asd.getcuadruple());

    }

    public Minumero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getdoble(){

         return num*2;
    }

    public int gettriple(){

        return num*3;
    }

    public int getcuadruple(){

        return num*4;
    }
}
