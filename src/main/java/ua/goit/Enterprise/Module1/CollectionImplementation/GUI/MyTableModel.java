package ua.goit.Enterprise.Module1.CollectionImplementation.GUI;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by coura on 05.06.2016.
 */

class MyTableModel extends AbstractTableModel {
    private List<List<String>> data;
    public MyTableModel(List<List<String>> data) {
        this.data = data;
    }
    @Override
    public int getRowCount() {
        return data.size();
    }
    @Override
    public int getColumnCount() {
        return data.get(0).size();
    }
    @Override
    public Object getValueAt(int row, int column) {
        return data.get(row).get(column);
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "";
            case 1:
                return "add";
            case 2:
                return "get";
            case 3:
                return "remove";
            case 4:
                return "contains";
            case 5:
                return "populate";
            case 6:
                return "iterator.add";
            case 7:
                return "iterator.remove";
        }
        return "";
    }
}
