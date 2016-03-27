package Module8.NewDirectory;

import Module8.NewDirectory.File.*;
import java.util.Collection;

/**
 * Created by coura on 27.03.2016.
 */

class PrintCollectionAsATable {

    static void print(Collection<File> roster) {

        StringBuilder filesTable = new StringBuilder();
        filesTable.append("File Type");
        filesTable.append("\t\t");
        filesTable.append("Name");
        filesTable.append('\n');
        filesTable.append("------------------------------------\n");

        for (File file : roster) {
            filesTable.append(file.getClass().getSimpleName());
            filesTable.append("\t|\t");
            filesTable.append(file.getName());
            filesTable.append('\n');
        }

        System.out.println(filesTable.toString());
    }
}
