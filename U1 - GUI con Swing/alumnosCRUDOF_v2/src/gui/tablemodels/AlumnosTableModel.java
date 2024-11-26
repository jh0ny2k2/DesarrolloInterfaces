/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.tablemodels;

import datos.Alumno;
import debug.Debug;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aguilera
 */
public class AlumnosTableModel extends AbstractTableModel {

    //public final static boolean DEBUG=true;
    
    private List<Alumno> listaAlumnos;
    private final String[] tituloColumnas={"Cód","Alumno","Edad","Beca"};
    private final Class[] tipoColumnas={String.class,String.class,Integer.class,Double.class};

/*    public AlumnosTableModel() {
        listaAlumnos=new ArrayList();
        this.tituloColumnas=new String[]{"Cód","Alumno","Edad","Beca"};
        this.tipoColumnas=new Class[]{String.class,String.class,Integer.class,Double.class};        
    }*/
    
    public AlumnosTableModel(List<Alumno> listaA) {
        this.listaAlumnos=listaA;
    }
    
    public void setAlumnos(List<Alumno> lista) {
        this.listaAlumnos=lista;
    }
    
    public List<Alumno> getAlumnos(){
        return listaAlumnos;
    }
    
    @Override
    public int getRowCount() {
        Debug.log("getRowCount");
        return listaAlumnos.size();
    }

    @Override
    public int getColumnCount() {
        Debug.log("getColumnCount");
        return tituloColumnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Debug.log("getValueAt "+String.valueOf(fila)+" "+String.valueOf(columna));
        switch (columna) {
            case 0:
                return listaAlumnos.get(fila).getCodigo();
            case 1:
                return listaAlumnos.get(fila).getNombre();
            case 2:
                return listaAlumnos.get(fila).getEdad();
            case 3:
                return listaAlumnos.get(fila).getCuantiaBeca();
        }
        return null;
    } 

    @Override
    public String getColumnName(int column) {
        Debug.log("getValueAt "+String.valueOf(column));
        return tituloColumnas[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        Debug.log("isCellEditable "+String.valueOf(rowIndex)+" "+String.valueOf(columnIndex));
        if (columnIndex!=0)
            return true;
        else
            return false;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Debug.log("getColumnClass "+String.valueOf(columnIndex));
        return tipoColumnas[columnIndex];
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Debug.log("setValueAt "+String.valueOf(rowIndex)+" "+String.valueOf(columnIndex));
        switch (columnIndex) {
            case 1:
                listaAlumnos.get(rowIndex).setNombre(aValue.toString());
                break;
            case 2:
                listaAlumnos.get(rowIndex).setEdad((int) aValue);
                break;
            case 3:
                listaAlumnos.get(rowIndex).setCuantiaBeca((double) aValue);
            default: ;
        }
        //this.fireTableCellUpdated(rowIndex, columnIndex);
    }
    
}
