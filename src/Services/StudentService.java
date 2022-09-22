package Services;

public interface StudentService {
    void agregarEstudiante(String nombre,int codigo,String producto,int cantidadProducto,int precio,String carrera);//crear;
    void listar();//actualiza
    void eliminar(String nombre);//
    void buscar(int codigo);
}
