package ua.goit.Core.Directory;

import java.util.Collection;

/**
 * Created by coura on 28.03.2016.
 */
public class PrintCollectionAsATable {

    static void Print(Collection<File> roster) {

        System.out.println("------------------------------------------");
        System.out.println("File Size \t | \t File Type \t | \t File Name");
        System.out.println("------------------------------------------");

        for (File i : roster){
            System.out.println(i.getFileSize() + "\t\t\t | \t" + i.getFileFormat() + "\t\t | \t" + i.getFileName());
        }
        System.out.println("------------------------------------------");
    }
}
