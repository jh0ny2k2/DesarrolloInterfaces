/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.tablemodels;

import datos.Deporte;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jhony
 */
public class DeporteTableModel extends AbstractTableModel{
    private String[] columnNames = {"Código", "Descripción", "N° Niveles"};
    private ArrayList<Deporte> deportes;

    public DeporteTableModel(ArrayList<Deporte> deportes) {
        this.deportes = deportes;
    }

    @Override
    public int getRowCount() {
        return deportes.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Deporte deporte = deportes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return deporte.getCodigo();
            case 1:
                return deporte.getDescripcion();
            case 2:
                return deporte.getNiveles();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex > 0; // Solo "Descripción" y "N° Niveles" son editables
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Deporte deporte = deportes.get(rowIndex);
        switch (columnIndex) {
            case 1:
                deporte.setDescripcion((String) value);
                break;
            case 2:
                deporte.setNiveles(Integer.parseInt(value.toString()));
                break;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void addDeporte(Deporte deporte) {
        deportes.add(deporte);
        fireTableRowsInserted(deportes.size() - 1, deportes.size() - 1);
    }

    public void removeDeporte(int rowIndex) {
        deportes.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
