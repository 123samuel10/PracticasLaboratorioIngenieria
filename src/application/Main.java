package application;

import Controllers.MonitorController;
import Controllers.PrestamoController;
import Controllers.StudentController;
import ServicesImpl.PrestamoImpl;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean bandera=true;
        Menu menu=new Menu();
        StudentController estudianteContolador=new StudentController();
        MonitorController monitorController=new MonitorController();
        PrestamoController prestamoController=new PrestamoController();



        while (bandera){
            int opciones=Integer.parseInt(JOptionPane.showInputDialog("MENU\n1.Estudiante\n2Monitores\n3.Prestamos"));
            switch (opciones){
                case 1:
                    int opcEstudiante=Integer.parseInt(JOptionPane.showInputDialog("1.Agregar Estudiante\n2.Actualizar Estudiante\n3.Eliminar Estudiante\n4.Buscar Estudiante"));
                    switch (opcEstudiante){
                        case 1:estudianteContolador.agregarEstudiante();
                        break;
                        case 2:estudianteContolador.actualizar();
                        break;
                        case 3:estudianteContolador.eliminar();
                        break;
                        case 4:estudianteContolador.buscar();
                        break;



                    }
                    break;
                case 2:
                    int opcMonitor=Integer.parseInt(JOptionPane.showInputDialog("1.Agregar Monitor\n2.Actualizar Monitor\n3.Eliminar Monitor\n4.Buscar Monitor"));
                    switch (opcMonitor){
                        case 1:monitorController.agregarMonitor();
                        break;
                        case 2:monitorController.listarMonitores();
                        break;
                        case 3:monitorController.eliminarMonitorPorNombre();
                        break;
                        case 4:monitorController.buscarMonitorPorNombre();
                        break;

                    }
                    break;
                case 3:
                    int opcPrestamos=Integer.parseInt(JOptionPane.showInputDialog("1.Prestamo\n2.Cantidad de prestamos incluidos en estudiantes\n3.Cantidad de prestamos incluidos en monitores\n4.Buscar Prestamo\n5.Ganancia de la empresa"));
                    switch (opcPrestamos){
                        case 1:prestamoController.crearPrestamo(estudianteContolador.getUsuarioImpl(),monitorController.getMonitorImpl());
                        break;
                        case 2:prestamoController.buscarEnLaCantidadDePrestamosIncluidos(estudianteContolador.getUsuarioImpl(),prestamoController.getPrestamoImpl());
                        break;
                        case 3: prestamoController.buscarEnLCantidadDePrestamosIncluidoEnMonitores(monitorController.getMonitorImpl(),prestamoController.getPrestamoImpl());
                        break;
                        case 4:prestamoController.buscarPrestamo();
                        break;
                        case 5:prestamoController.totalDineroRecaudadoPorLaEmpresa(prestamoController.getPrestamoImpl());
                        break;

                    }
            }
        }

    }
}