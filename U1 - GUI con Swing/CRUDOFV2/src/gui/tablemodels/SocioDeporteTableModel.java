/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.tablemodels;

import datos.Deporte;
import datos.SocioDeporte;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jh0ny2k2
 */
public class SocioDeporteTableModel extends AbstractTableModel{
    private ArrayList<SocioDeporte> listaSocioDeporte;
    private final String[] columnas = {"ID Socio", "Nombre Socio", "Código Deporte", "Descripción Deporte"};

    // Constructor
    public SocioDeporteTableModel(ArrayList<SocioDeporte> listaSocioDeporte) {
        this.listaSocioDeporte = listaSocioDeporte;
    }

    @Override
    public int getRowCount() {
        return listaSocioDeporte.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SocioDeporte socioDeporte = listaSocioDeporte.get(rowIndex);
        switch (columnIndex) {
            case 0: return socioDeporte.getIdSocio();
            case 1: return socioDeporte.getNombreSocio();
            case 2: return socioDeporte.getCodigoDeporte();
            case 3: return socioDeporte.getDescripcionDeporte();
            default: throw new IllegalArgumentException("Índice de columna inválido");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // Las celdas no serán editables directamente en este ejemplo
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        SocioDeporte socioDeporte = listaSocioDeporte.get(rowIndex);
        switch (columnIndex) {
            case 0:
                socioDeporte.setIdSocio((String) aValue);
                break;
            case 1:
                socioDeporte.setNombreSocio((String) aValue);
                break;
            case 2:
                socioDeporte.setCodigoDeporte((String) aValue);
                break;
            case 3:
                socioDeporte.setDescripcionDeporte((String) aValue);
                break;
            default:
                throw new IllegalArgumentException("Índice de columna inválido");
        }
        fireTableCellUpdated(rowIndex, columnIndex); // Notifica a JTable que el valor ha cambiado
    }

    // Métodos personalizados
    public void agregarSocioDeporte(SocioDeporte socioDeporte) {
        listaSocioDeporte.add(socioDeporte);
        fireTableRowsInserted(listaSocioDeporte.size() - 1, listaSocioDeporte.size() - 1);
    }

    public void eliminarSocioDeporte(int rowIndex) {
        listaSocioDeporte.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public void actualizarTabla(ArrayList<SocioDeporte> nuevaLista) {
        this.listaSocioDeporte = nuevaLista;
        fireTableDataChanged();
    }

    public SocioDeporte obtenerSocioDeporte(int rowIndex) {
        return listaSocioDeporte.get(rowIndex);
    }
    
}
