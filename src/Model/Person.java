package Model;

public class Person {
    private String nombre;
    private int cantidadProducto;
    private int precio;
    private String carrera;
    private int codigo;
    private String producto;


    public Person(String nombre, int codigo,String producto, int cantidadProducto,int precio, String carrera) {
        this.nombre = nombre;
        this.codigo=codigo;
        this.producto=producto;
        this.cantidadProducto = cantidadProducto;
        this.precio=precio;
        this.carrera=carrera;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}
