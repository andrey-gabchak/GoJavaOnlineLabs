package ua.goit.Enterprise.Module1.CollectionImplementation;

import ua.goit.Enterprise.Module1.CollectionImplementation.GUI.MainWindow;

/**
 * Created by coura on 30.05.2016.
 *
 * The task in file Task.png
 */


public class Main {

    public static void main(String[] args) {
        WriteToFile writingToFile = new WriteToFile();
        writingToFile.writeTable();
        MainWindow mainWindow = new MainWindow();
        mainWindow.createGUI();
    }
}
