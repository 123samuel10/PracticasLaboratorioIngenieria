package ServicesImpl;

import Model.Student;
import Services.StudentService;

import javax.swing.*;
import java.util.ArrayList;

public class StudentImpl implements StudentService {
    ArrayList<Student>students=new ArrayList<>();

    int cantidadEstudiante=1;


    @Override
    public void agregarEstudiante(String nombre, int codigo,String producto,int cantidadProducto,int precio, String carrera) {
        for (int i=0;i<cantidadEstudiante;i++){
            this.students.add(new Student(nombre,codigo,producto,cantidadProducto,precio,carrera));
            JOptionPane.showMessageDialog(null,"El estudiante se ha creado y su nombre es: "+nombre);
            break;
        }
    }

    @Override
    public void listar() {
        for (int i=0;i<this.students.size();i++){
            if (this.students!=null){
                JOptionPane.showMessageDialog(null,"NOMBRE ESTUDIANTE: "+ students.get(i).getNombre()+" "+"CODIGO ESTUDIANTE:"+ students.get(i).getCodigo()+" "+"NOMBRE PRODUCTO:"+students.get(i).getProducto() +" "+"CANTIDAD DE PRODUCTO: "+ students.get(i).getCantidadProducto()+" "+"PRECIO: "+students.get(i).getPrecio()+" "+"CARRERA: "+ students.get(i).getCarrera());
            }
        }
    }

    @Override
    public void eliminar(String nombre) {
        for (int i=0;i<this.students.size();i++){
            if (this.students!=null && this.students.get(i).getNombre().equals(nombre)){
                JOptionPane.showMessageDialog(null,"se ha eliminado los datos de ese estudiante");
                this.students.remove(students.get(i));
            }
        }
    }

    @Override
    public void buscar(int codigo) {
        for (int i = 0; i<this.students.size(); i++){
            if (this.students !=null && this.students.get(i).getCodigo()==codigo){
                JOptionPane.showMessageDialog(null,"se ha encontrado ese student, sus datos son:"+" "+"Nombre Student: "+ students.get(i).getNombre()+" "+" Nombre Producto:"+students.get(i).getProducto()+" " +"Cantidad Producto:"+ students.get(i).getCantidadProducto()+" "+students.get(i).getPrecio()+" "+"Carrera: "+ students.get(i).getCarrera());

            }
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
