package Services;

import Model.Monitor;
import Model.Prestamo;
import Model.Student;
import ServicesImpl.StudentImpl;

public interface PrestamoService {
    void crearPrestamo(String fecha, int fechaFinal, int codigo, Student student, Monitor monitor);




    void buscarCodigo(int codigo);
}
