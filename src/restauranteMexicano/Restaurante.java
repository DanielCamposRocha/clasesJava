package restauranteMexicano;
/*
* metodo en que pueda saber cuantos clientes pedo atender con la materia prima del almacen.
* el metodo recibe la cantidad de papas y chocos en kilos y devuelve el numero de cleintas que puede atender
* el restaurante teniendo en cuenta que por cada 3 personas, se usa kilo de papas y medio de chocos
* */
public class Restaurante {
    private int papas,chocos;

    public Restaurante(int papas, int chocos) {
        this.papas = papas;
        this.chocos = chocos;
    }

    public int getPapas() {
        return papas;
    }

    public void setPapas(int papas) {
        this.papas = papas;
    }

    public int getChocos() {
        return chocos;
    }

    public void setChocos(int chocos) {
        this.chocos = chocos;
    }

    public void addChocos(int variaChocos){
        setChocos(getChocos()+variaChocos);
    }

    public void addPapas(int variaPapas){
        setPapas(getPapas()+variaPapas);
    }
    public static int cantidadClientes(Restaurante restaurante){
        if(restaurante.getChocos()*2<restaurante.getPapas()) return restaurante.getChocos()*2*3;
        else return restaurante.getPapas()*3;
    }

    public void showChocos(){
        System.out.println(getChocos());
    }

    public void showPapas(){
        System.out.println(getPapas());
    }

    public int getComensales(Restaurante restaurante){
        return cantidadClientes(restaurante);
    }

    public static void main(String[] args) {
        Restaurante israel= new Restaurante(25,20);
        System.out.println("Israel puede atender a: "+cantidadClientes(israel)+" clientes");
        israel.setPapas(50);
        System.out.println("Israel puede atender a: "+cantidadClientes(israel)+" clientes");
        israel.setChocos(10);
        israel.addPapas(-10);
        israel.addChocos(5);
        System.out.println("Israel puede atender a: "+cantidadClientes(israel)+" clientes");
        israel.showChocos();
        israel.showPapas();
    }

}
