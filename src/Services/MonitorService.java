package Services;

public interface MonitorService {
    void agregarMonitor(String nombre,int codigo,String producto,int cantidadProducto,int precio,String carrera,int añosEnLaCompañia);//crea

    void listarMonitor();//actualiza
    void eliminarMonitor(String nombre);//elimina
    void buscarMonitor(int codigo);//busca
}
