package Controllers;

import ServicesImpl.StudentImpl;

import javax.swing.*;

public class StudentController {
    StudentImpl usuarioImpl=new StudentImpl();

    public void agregarEstudiante(){
        String nombre= JOptionPane.showInputDialog("ingrese el nombre del estudiante");
        int codigo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo del estudiante"));
        String productoNombre=JOptionPane.showInputDialog("ingrese el nombre del producto");
        int cantidadProducto=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad del producto"));
        int precio=Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio del producto"));
        String carrera=JOptionPane.showInputDialog("ingrese la carrera del estudiante");
        usuarioImpl.agregarEstudiante(nombre,codigo,productoNombre,cantidadProducto,precio,carrera);
    }
    public void actualizar(){
        usuarioImpl.listar();
    }
    public void eliminar(){
        String nombre=JOptionPane.showInputDialog("ingrese el nombre, para eliminar sus datos");
        usuarioImpl.eliminar(nombre);
    }
    public void buscar(){
        int codigoBuscar=Integer.parseInt(JOptionPane.showInputDialog("ingrese el cogido de un estudiante, para buscar sus datos"));
        usuarioImpl.buscar(codigoBuscar);
    }

    public StudentImpl getUsuarioImpl() {
        return usuarioImpl;
    }

    public void setUsuarioImpl(StudentImpl usuarioImpl) {
        this.usuarioImpl = usuarioImpl;
    }

}
