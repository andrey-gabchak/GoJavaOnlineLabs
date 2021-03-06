package ua.goit.Core.Directory;

import java.util.Set;
import java.util.TreeSet;

/**
 * class Main
 *
 * Setting for Module 2.
 * Create a UML diagram with the classes text File, audio File, image File, using the File class.
 * Create a class directory containing files of different formats.
 *
 * Setting for Module 3.
 * Write to the corresponding Java classes
 * UML diagram https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/directory.jpg
 * From job to Module 2.
 * Create a project with a source code and upload it to GitHub.
 *
 * Module 8
 *
 * Create multiple collections of objects from the hierarchy.
 * At least one collection must contain objects of different classes.
 *
 * 1. Create a class that prints by collection displayed in a table.
 * The columns correspond to the fields of the table objects.
 * Each row in the table corresponds to an object in the collection.
 *
 * Created by coura on 08.03.2016.
 */

public class Main {

    public static void main(String[] args) {

        Directoty directory = new Directoty();

        directory.addFiles(new AudioFile("Ramstein", ".mp3", 3));
        directory.addFiles(new AudioFile("БумБокс", ".mp3", 5));
        directory.addFiles(new PicturesFile("PhotoSummer", ".png", 1));
        directory.addFiles(new PicturesFile("PhotoWinter", ".png", 2));
        directory.addFiles(new TextFile("Coursework", ".doc", 1));
        directory.addFiles(new TextFile("JavaCodeConvention", ".pdf", 1));

        PrintCollectionAsATable.Print(directory.getSomeFiles());

        Set<File> sortedNameList = new TreeSet<File>((o1, o2) -> o1.getFileName().compareTo(o2.getFileName()));
        sortedNameList.addAll(directory.getSomeFiles());
        System.out.println("\nSorted by Name:");
        PrintCollectionAsATable.Print(sortedNameList);

        Set<File> sortedSizeList = new TreeSet<File>((o1, o2) -> o1.getFileSize() - o2.getFileSize());
        sortedSizeList.addAll(directory.getSomeFiles());
        System.out.println("\nSorted by Size:");
        PrintCollectionAsATable.Print(sortedSizeList);

    }
}
