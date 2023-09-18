package perbankan.ui.nasabah;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import perbankan.models.Nasabah;

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
    private final String[] columnNames = {"No Rekening", "Username", "Nama Awal", "Nama Akhir", "Saldo"};

    public NasabahListTableModel(List<Nasabah> nasabahList) {
        this.nasabahList = nasabahList;
    }

    public void setNasabahList(List<Nasabah> nasabahList) {
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
        NumberFormat format = NumberFormat.getInstance();
        format.setCurrency(Currency.getInstance("IDR"));
        format.setMaximumFractionDigits(0);

        return switch (columnIndex) {
            case 0 ->
                data.getNoRekening();
            case 1 ->
                data.getUser().getUsername();
            case 2 ->
                data.getNamaAwal();
            case 3 ->
                data.getNamaAkhir();
            case 4 ->
                "Rp" + format.format(data.getTabungan().getSaldo());
            default ->
                null;
        };
    }

    public Nasabah getNasabahAt(int rowIndex) {
        return nasabahList.get(rowIndex);
    }
}
