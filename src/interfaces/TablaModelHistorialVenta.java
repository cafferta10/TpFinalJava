package interfaces;
 
import entidades.Venta;
//import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
 

public class TablaModelHistorialVenta extends AbstractTableModel {
 	
    private final String[] columnNames = {"ID", "Fecha", "Total"};
    private List<Venta> ventas = new ArrayList<Venta>(); 
 
    public void agregarVenta(Venta Venta) {
        ventas.add(Venta);
        fireTableDataChanged();
    }
 
    public void eliminarVenta(int rowIndex) {
        ventas.remove(rowIndex);
        fireTableDataChanged();
    }
     
    public void limpiarventas() {
        ventas.clear();
        fireTableDataChanged();
    }
 
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
 
    @Override
    public int getRowCount() {
        return ventas.size();
    }
 
    @Override
    public int getColumnCount() {
        return 3;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:return ventas.get(rowIndex).getIdFactura();
            case 1:return ventas.get(rowIndex).getFecha();
            case 2:return ventas.get(rowIndex).getTotal();
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
