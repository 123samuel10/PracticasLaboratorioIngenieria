package ServicesImpl;

import Model.Monitor;
import Services.MonitorService;

import javax.swing.*;
import java.util.ArrayList;

public class MonitorImpl implements MonitorService {
    ArrayList<Monitor> monitors=new ArrayList<>();
    int cantidadMonitor=1;
    @Override
    public void agregarMonitor(String nombre, int codigo, String producto,int cantidadProducto,int precio, String carrera, int añosEnLaCompañia) {
        for (int i=0;i<cantidadMonitor;i++){
            this.monitors.add(new Monitor(nombre,codigo,producto,cantidadProducto,precio,carrera,añosEnLaCompañia));
            JOptionPane.showMessageDialog(null,"El monitor se ha creado y su nombre es: "+nombre);
        }
    }

    @Override
    public void listarMonitor() {
        for (int i=0;i<this.monitors.size();i++){
            if (this.monitors!=null){
                JOptionPane.showMessageDialog(null,"NOMBRE MONITOR: "+" "+this.monitors.get(i).getNombre()+" "+"CODIGO MONITOR:"+monitors.get(i).getCodigo()+" " +"NOMBRE PRODUCTO: "+monitors.get(i).getProducto()+ " "+"CANTIDAD PRODUCTO: "+this.monitors.get(i).getCantidadProducto()+" "+"PRECIO:"+" "+this.monitors.get(i).getPrecio()+" CARRERA: "+this.monitors.get(i).getCarrera()+" "+" AÑOS EN LA COMPAÑIA: "+this.monitors.get(i).getAñosEnLaCompañia() );
            }
        }
    }

    @Override
    public void eliminarMonitor(String nombre) {
        for (int i=0;i<this.monitors.size();i++){
            if (this.monitors!=null && this.monitors.get(i).getNombre().equals(nombre)){
                JOptionPane.showMessageDialog(null,"se ha eliminado el monitor");
                monitors.remove(monitors.get(i));
            }
        }
    }

    @Override
    public void buscarMonitor(int codigo) {
        for (int i=0;i<monitors.size();i++){
            if (this.monitors!=null && this.monitors.get(i).getCodigo()==codigo){
                JOptionPane.showMessageDialog(null,"los datos de este monitor son: ");
                JOptionPane.showMessageDialog(null,"Nombre Monitor: "+monitors.get(i).getNombre()+" "+"Nombre Producto: "+monitors.get(i).getProducto()+" "+"Cantidad Producto:"+monitors.get(i).getCantidadProducto()+" "+"Precio: "+monitors.get(i).getPrecio()+" "+"Carrera: "+monitors.get(i).getCarrera()+" "+"Años de antiguedad: "+monitors.get(i).getAñosEnLaCompañia());
            }
        }
    }

    public ArrayList<Monitor> getMonitors() {
        return monitors;
    }

    public void setMonitors(ArrayList<Monitor> monitors) {
        this.monitors = monitors;
    }


}
