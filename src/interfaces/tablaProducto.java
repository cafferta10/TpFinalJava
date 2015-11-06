package interfaces;

import entidades.Linea;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;


public class tablaProducto extends AbstractTableModel {
 	
    private final String[] columnNames = {"--------------------PRODUCTOS---------------------"};
    private List<Linea> lineas = new ArrayList<Linea>(); 
 
    public void agregarLinea(Linea linea) {
        lineas.add(linea);
        fireTableDataChanged();
    }
 
    public void eliminarLinea(int rowIndex) {
        lineas.remove(rowIndex);
        fireTableDataChanged();
    }
     
    public void limpiarlineas() {
        lineas.clear();
        fireTableDataChanged();
    }
 
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
 
    @Override
    public int getRowCount() {
        return lineas.size();
    }
 
    @Override
    public int getColumnCount() {
        return 5;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:return lineas.get(rowIndex).getProducto().getNombre() ; 
            default:
                return null;
        }
    }
 
    @Override
    public Class<String> getColumnClass(int columnIndex) {
        return String.class;
    }
 
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
 
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        switch (columnIndex) {}
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}