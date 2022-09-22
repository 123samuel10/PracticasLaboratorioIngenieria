package Controllers;

import Model.Monitor;
import Model.Prestamo;
import Model.Student;
import ServicesImpl.MonitorImpl;
import ServicesImpl.PrestamoImpl;
import ServicesImpl.StudentImpl;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
public class PrestamoController {
    PrestamoImpl prestamoImpl=new PrestamoImpl();
    StudentImpl studentA=new StudentImpl();

    Student student1;
    Monitor monitor1;

    int totalPrestamoEstudiante=0;
    int totalPrestamoMonitor=0;
    int totalEstudiante=0;
    int totalMonitor=0;
    //funcion crear prestamo
    public void crearPrestamo(StudentImpl student, MonitorImpl monitor){
        System.out.println(student);
        System.out.println(monitor);
        String fechaInicio= JOptionPane.showInputDialog("ingrese la fecha de inicio del prestamo");
        int fechaFinal= Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad final de dias"));
        int codigo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo del prestamo"));
        prestamoImpl.crearPrestamo(fechaInicio,fechaFinal,codigo,student1,monitor1);
        entregarPrestamo(student,monitor,fechaFinal);
    }
    public void entregarPrestamo(StudentImpl student, MonitorImpl monitor,int fechaFinal){
        //prestamo estudiante
        String nombre=JOptionPane.showInputDialog("ingrese el nombre del estudiante, para observar su valor total del prestamo");
        for (int i=0;i<student.getStudents().size();i++){
            if (student!=null && student.getStudents().get(i).getNombre().equals(nombre)){
                totalEstudiante=student.getStudents().get(i).getCantidadProducto()*student.getStudents().get(i).getPrecio();
                totalPrestamoEstudiante=1000*fechaFinal+totalEstudiante;
                JOptionPane.showMessageDialog(null,"el valor de la factura tiene un costo de: "+totalEstudiante+" "+"añadiendio que el prestamo dura"+" "+fechaFinal+" dias:"+" "+"cada dia tiene un sumatoria de 1000 pesos"+" "+"TOTAL FINAL"+totalPrestamoEstudiante);
            }
        }
        //prestamo monitor
        for (int i=0;i<monitor.getMonitors().size();i++){
            if (monitor!=null && monitor.getMonitors().get(i).getNombre().equals(nombre)){
                totalMonitor=monitor.getMonitors().get(i).getPrecio()*monitor.getMonitors().get(i).getCantidadProducto();
                totalPrestamoMonitor=1000*fechaFinal+totalMonitor;
                JOptionPane.showMessageDialog(null,"el valor de la factura tiene un costo de: "+totalMonitor+" "+"añadiendio que el prestamo dura"+" "+fechaFinal+" dias:"+" "+"cada dia tiene un sumatoria de 1000 pesos"+" "+"TOTAL FINAL"+totalPrestamoMonitor);
            }
        }
    }

    //funciones de buscar la cantidades del prestamos incluidos, tanto en monitor como en estudiante

    int contador2=0;
    int contador=0;
    int contador3=0;
    int salir=0;
    public void buscarEnLaCantidadDePrestamosIncluidos(StudentImpl student,PrestamoImpl prestamoImpl) {
        //buscarCantidadIncluidaDeEstudiantes:

        String nombre = JOptionPane.showInputDialog("ingrese el nombre del producto, para observar en la cantidad de prestamos incluidos");
        for (int i = 0; i < student.getStudents().size(); i++) {

            if (student!=null &&student.getStudents().get(i).getProducto().equals(nombre)) {
                contador++;
                JOptionPane.showMessageDialog(null,"este producto esta incluido en "+contador+"prestamos");
                break;
            }else if (student!=null && student.getStudents().get(i).getProducto()!=nombre) {
                contador2++;
                JOptionPane.showMessageDialog(null, "ese producto esta incluido en: " + contador2 + "prestamos");


            }else {
                salir += contador + contador2;
                salir=prestamoImpl.getPrestamos().length;
                break;
            }

        }
    }
    int contadoUnoMonitor=0;
    int contadorDosMonitor=0;
    int salir2=0;
    public void buscarEnLCantidadDePrestamosIncluidoEnMonitores(MonitorImpl monitor, PrestamoImpl prestamo){
        String nombre=JOptionPane.showInputDialog("ingrese el nombre del producto, para observar la cantidad de prestamos incluidos");
        for (int i=0;i<prestamo.getPrestamos().length;i++){
            if (monitor!=null && monitor.getMonitors().get(i).getProducto().equals(nombre)){
                contadoUnoMonitor++;
                JOptionPane.showMessageDialog(null,"ese producto esta incluido en "+contadoUnoMonitor+" "+"prestamos");
                break;
            }else if (monitor.getMonitors().get(i).getProducto()!=nombre) {
                contadorDosMonitor = 0;
                JOptionPane.showMessageDialog(null,"ese producto esta incluido en "+contadorDosMonitor+" "+"prestamos");

            }else {
                salir2=contadoUnoMonitor+contadorDosMonitor;
                salir2=prestamo.getPrestamos().length;

                break;
            }
        }
    }
    int totalGanaciaEmpresa=0;
    public void totalDineroRecaudadoPorLaEmpresa(PrestamoImpl prestamo){
        for (int i=0;i<prestamo.getPrestamos().length;i++){
            if (prestamo.getPrestamos()[i]!=null){
                totalGanaciaEmpresa+=totalPrestamoEstudiante+totalPrestamoMonitor;
                JOptionPane.showMessageDialog(null,"el total de dinero recaudado por la empresa es de: "+totalGanaciaEmpresa);
            }
        }
    }
    //buscar prestamo


    public void buscarPrestamo(){
    int codigoB=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo"));
    prestamoImpl.buscarCodigo(codigoB);
    }




    public PrestamoImpl getPrestamoImpl() {
        return prestamoImpl;
    }

    public void setPrestamoImpl(PrestamoImpl prestamoImpl) {
        this.prestamoImpl = prestamoImpl;
    }



}
