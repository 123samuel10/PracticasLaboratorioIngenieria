package Controllers;

import ServicesImpl.MonitorImpl;
import ServicesImpl.StudentImpl;

import javax.swing.*;

public class MonitorController {
    MonitorImpl monitorImpl=new MonitorImpl();

    public void agregarMonitor(){
        String nombre=JOptionPane.showInputDialog("ingrese el nombre del monitor");
        int codigo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo del monitor"));
        String nombreProducto=JOptionPane.showInputDialog("ingrese el nombre del producto");
        int cantidadProducto=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de producto"));
        int precio=Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio del producto"));
        String carrera=JOptionPane.showInputDialog("ingrese la carrera del monitor");
        int años=Integer.parseInt(JOptionPane.showInputDialog("ingrese lo años de antiguedad del monitor"));
        monitorImpl.agregarMonitor(nombre,codigo,nombreProducto,cantidadProducto,precio,carrera,años);
    }
    public void listarMonitores(){
        monitorImpl.listarMonitor();
    }
    public void eliminarMonitorPorNombre(){
        String nombreEliminar=JOptionPane.showInputDialog("ingrese el nombre para eliminar los datos del monitor");
        monitorImpl.eliminarMonitor(nombreEliminar);
    }
    public void buscarMonitorPorNombre(){
        int codigo= Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo del monitor, para buscar su datos"));
        monitorImpl.buscarMonitor(codigo);
    }

    public MonitorImpl getMonitorImpl() {
        return monitorImpl;
    }

    public void setMonitorImpl(MonitorImpl monitorImpl) {
        this.monitorImpl = monitorImpl;
    }
}
