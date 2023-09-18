package perbankan.ui.user;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import perbankan.models.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class UserListTableModel extends AbstractTableModel {

    private List<User> list;
    private final String[] columnNames = {"No", "Username", "Role"};

    public UserListTableModel(List<User> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list == null ? 0 : list.size();
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
        User data = list.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                rowIndex + 1;
            case 1 ->
                data.getUsername();
            case 2 ->
                data.getRole();
            default ->
                null;
        };
    }

    public User getUserAt(int rowIndex) {
        return list.get(rowIndex);
    }
}
