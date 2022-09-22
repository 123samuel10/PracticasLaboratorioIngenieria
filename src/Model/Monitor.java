package Model;

public class Monitor extends Person{

    private int añosEnLaCompañia;
    public Monitor(String nombre, int codigo,String producto ,int cantidadProducto,int precio, String carrera,int añosEnLaCompañia) {
        super(nombre, codigo,producto,cantidadProducto,precio ,carrera);
        this.añosEnLaCompañia=añosEnLaCompañia;
    }

    public int getAñosEnLaCompañia() {
        return añosEnLaCompañia;
    }

    public void setAñosEnLaCompañia(int añosEnLaCompañia) {
        this.añosEnLaCompañia = añosEnLaCompañia;
    }
}
