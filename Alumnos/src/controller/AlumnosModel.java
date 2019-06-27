/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objects.Alumno;

/**
 *
 * @author karimnot
 */
public class AlumnosModel extends AbstractTableModel {
    
    private ArrayList<Alumno> oAlumnos;
    
    public AlumnosModel(ArrayList alumnos){
        oAlumnos = alumnos;
    }
    

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No.Control";
            case 1:
                return "Nombre";
            case 2:
                return "Carrera";
            case 3:
                return "Promedio";
            default:
                throw new AssertionError();
        }
    }

    @Override
    public int getRowCount() {
        return oAlumnos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno alumno = oAlumnos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return alumno.getNoControl();
            case 1:
                return alumno.getNombre();
            case 2:
                return alumno.getCarrera();
            case 3:
                return alumno.getPromedio();
            default:
                throw new AssertionError();
        }
    }
    
}
