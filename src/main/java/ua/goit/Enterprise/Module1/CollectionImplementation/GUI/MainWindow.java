package ua.goit.Enterprise.Module1.CollectionImplementation.GUI;

/**
 * Created by coura on 05.06.2016.
 */

import ua.goit.Enterprise.Module1.CollectionImplementation.TimeOfOperations;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {

    public static void createGUI() {
        JFrame frame = new JFrame("Results of program work");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TimeOfOperations timeOfOperations = new TimeOfOperations();
        List<List<String>> resultFor10K = timeOfOperations.getResultFor10K();
        List<List<String>> resultFor100K = timeOfOperations.getResultFor100K();
        List<List<String>> resultFor1000K = timeOfOperations.getResultFor1000K();

        MyTableModel tableModel10K = new MyTableModel(resultFor10K);
        JTable table10K = new JTable(tableModel10K);
        table10K.setMinimumSize(new Dimension(900, 190));

        MyTableModel tableModel100K = new MyTableModel(resultFor100K);
        JTable table100K = new JTable(tableModel100K);
        table10K.setMinimumSize(new Dimension(900, 190));

        MyTableModel tableModel1000K = new MyTableModel(resultFor1000K);
        JTable table1000K = new JTable(tableModel1000K);
        table10K.setMinimumSize(new Dimension(900, 190));

        JTabbedPane tabbedPane = new JTabbedPane();

        JScrollPane scrollPane10K = new JScrollPane(table10K);
        JScrollPane scrollPane100K = new JScrollPane(table100K);
        JScrollPane scrollPane1000K = new JScrollPane(table1000K);

        tabbedPane.add("Results for 10K", scrollPane10K);
        tabbedPane.add("Results for 100K", scrollPane100K);
        tabbedPane.add("Results for 1000K", scrollPane1000K);

        frame.add(tabbedPane);

        frame.setPreferredSize(new Dimension(910, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
