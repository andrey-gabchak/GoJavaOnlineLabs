package Module8.Directory;

/**
 * class PicturesFile
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

public class PicturesFile extends File {

    private String fileName;
    private String fileFormat;
    private double fileSize;

    public PicturesFile(String fileName, String fileFormat, double fileSize) {
        super(fileName, fileFormat, fileSize);
        this.fileName = fileName;
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return fileName + fileFormat + fileSize;
    }

}
