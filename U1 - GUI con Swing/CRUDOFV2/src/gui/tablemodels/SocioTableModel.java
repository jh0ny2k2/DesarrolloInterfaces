/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.tablemodels;

import datos.Socio;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jhony
 */
public class SocioTableModel extends AbstractTableModel{
    private String[] columnNames = {"ID", "Nombre", "Edad", "Cuota", "N° Deportes"};
    private ArrayList<Socio> socios;

    public SocioTableModel(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    @Override
    public int getRowCount() {
        return socios.size();
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
        Socio socio = socios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return socio.getId();
            case 1:
                return socio.getNombre();
            case 2:
                return socio.getEdad();
            case 3:
                return socio.getCuota();
            case 4:
                return socio.getNumDeportes();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex > 0 && columnIndex < 4; // Solo "Nombre", "Edad" y "Cuota" son editables
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Socio socio = socios.get(rowIndex);
        switch (columnIndex) {
            case 1:
                socio.setNombre((String) value);
                break;
            case 2:
                socio.setEdad(Integer.parseInt(value.toString()));
                break;
            case 3:
                socio.setCuota(Integer.parseInt(value.toString()));
                break;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void addSocio(Socio socio) {
        socios.add(socio);
        fireTableRowsInserted(socios.size() - 1, socios.size() - 1);
    }

    public void removeSocio(int rowIndex) {
        socios.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
