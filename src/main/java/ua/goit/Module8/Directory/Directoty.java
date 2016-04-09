package ua.goit.Module8.Directory;


import java.util.ArrayList;

/**
 * class Directoty
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
 * Created by coura on 03.03.2016.
 */

class Directoty {

    ArrayList<File> someFiles = new ArrayList<>();

    public void addFiles (File file) {
        someFiles.add(file);
    }

    public ArrayList<File> getSomeFiles() {
        return someFiles;
    }

    public void setSomeFiles(ArrayList<File> someFiles) {
        this.someFiles = someFiles;
    }
}
