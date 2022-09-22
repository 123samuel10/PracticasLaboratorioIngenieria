package ServicesImpl;

import Model.Monitor;
import Model.Prestamo;
import Model.Student;
import Services.PrestamoService;

import javax.swing.*;

public class PrestamoImpl implements PrestamoService {
    Prestamo prestamos[]=new Prestamo[5];
    int cantidad=1;




    @Override
    public void crearPrestamo(String fecha, int fechaFinal, int codigo, Student student, Monitor monitor) {

        for (int i=0;i<cantidad;i++){
            if (this.prestamos[i]==null){
                this.prestamos[i]=new Prestamo(fecha,fechaFinal,codigo,student,monitor);
                JOptionPane.showMessageDialog(null,"SE HA CREADO EL PRESTAMO");
            }
            if (i==this.prestamos.length){
                break;
            }
        }
    }



    @Override
    public void buscarCodigo(int codigo) {
;
        for (int i=0;i<prestamos.length;i++){
          if (prestamos!=null && prestamos[i].getCodigo()==codigo){
              JOptionPane.showMessageDialog(null,"el prestamo inicio : "+prestamos[i].getFechInicionPrestamo()+" "+"tiene una duracion de:"+prestamos[i].getFechaFinalPrestamo()+" "+"dias"+"estudiante del prestamo es: "+prestamos[i].getStudent().getNombre());
          }

        }
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }
}
