package application;

import javax.swing.*;

public class Menu {
    public int opciones(){
        int opc=Integer.parseInt(JOptionPane.showInputDialog("MENU\n"+
                "ESTUDIANTES\n"+
                "1.Añadir Estudiante\n"+
                "2.Actualizar Estudiante\n"+
                "3.Eliminar Estudiante\n"+
                "4.Buscar Estudiante\n"+
                "----------------------\n"+
                "MONITORES:\n"+
                "5.Añadir Monitores\n"+
                "6.Actualizar Monitor\n"+
                "7.Eliminar Monitor\n"+
                "8.Buscar Monitor\n"+
                "PRESTAMO\n"+
                "9.Crear Prestamo\n"+
                "10.Observar cantidad prestamos incluidos en estudiante\n"+
                "11.Observar cantidad prestamos incluidos en monitores\n"+
                "12.Buscar Prestamo por codigo\n"));
        return opc;
    }
}
