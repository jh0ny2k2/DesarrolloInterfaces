/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.tablemodels;

import datos.Socio;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jh0ny2k2
 */
public class ModeloTableSocios extends AbstractTableModel {
    
    private final String[] columnas = {"Código", "Nombre", "Edad", "Cuota", "Nº Deportes"};
    private List<Socio> socios;

    public ModeloTableSocios(List<Socio> socios) {
        this.socios = socios;
    }
    
    @Override
    public int getRowCount() {
        return socios.size();
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
        Socio socio = socios.get(rowIndex);
        switch (columnIndex) {
            case 0: return socio.getCodigo();
            case 1: return socio.getNombre();
            case 2: return socio.getEdad();
            case 3: return socio.getCuota();
            case 4: return socio.getNumDeportes();
            default: return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void actualizarDatos(List<Socio> socios) {
        this.socios = socios;
        fireTableDataChanged();
    }
    
}
