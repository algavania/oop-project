package perbankan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class NasabahListTableModel extends AbstractTableModel {

    private List<Nasabah> nasabahList;
    private final String[] columnNames = {"No", "Nama Awal", "Nama Akhir"};

    public NasabahListTableModel(List<Nasabah> nasabahList) {
        this.nasabahList = nasabahList;
    }

    @Override
    public int getRowCount() {
        return nasabahList == null ? 0 : nasabahList.size();
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
        Nasabah data = nasabahList.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                rowIndex + 1;
            case 1 ->
                data.getNamaAwal();
            case 2 ->
                data.getNamaAkhir();
            default ->
                null;
        };
    }

    public Nasabah getNasabahAt(int rowIndex) {
        return nasabahList.get(rowIndex);
    }

    public void addNasabah(Nasabah data) {
        if (nasabahList == null) {
            nasabahList = new ArrayList();
        }
        nasabahList.add(data);
        fireTableRowsInserted(nasabahList.size() - 1, nasabahList.size() - 1);
    }

    public void editNasabah(int index, Nasabah data) {
        nasabahList.set(index, data);
        fireTableRowsUpdated(index, index);
    }

    public void deleteNasabah(int index) {
        nasabahList.remove(index);
        fireTableRowsDeleted(nasabahList.size() - 1, nasabahList.size() - 1);
    }

    public void removeNasabah(int rowIndex) {
        nasabahList.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

}
