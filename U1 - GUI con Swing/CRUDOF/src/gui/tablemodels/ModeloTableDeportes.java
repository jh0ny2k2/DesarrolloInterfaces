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
 * @author Jh0ny2k2
 */
public class ModeloTableDeportes extends AbstractTableModel {
    private ArrayList<Deporte> deportes;
    private String[] columnas = {"Código", "Descripción", "Niveles"};

    public ModeloTableDeportes(ArrayList<Deporte> deportes) {
        this.deportes = deportes;
    }

    @Override
    public int getRowCount() {
        return deportes.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Deporte deporte = deportes.get(rowIndex);
        switch (columnIndex) {
            case 0: return deporte.getCodigo();
            case 1: return deporte.getDescripcion();
            case 2: return deporte.getNiveles();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
