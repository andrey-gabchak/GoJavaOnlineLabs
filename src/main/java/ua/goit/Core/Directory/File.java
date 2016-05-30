package ua.goit.Core.Directory;

/**
 * class File
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
 * Created by coura on 06.03.2016.
 */

abstract class File {

    private String fileName;
    private String fileFormat;
    private int fileSize;

    public File(String fileName, String fileFormat, int fileSize) {
        this.fileName = fileName;
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public int getFileSize() {
        return fileSize;
    }

    public abstract String toString();
}
