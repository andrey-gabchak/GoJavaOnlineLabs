package Module3.Directory;

/**
 * class AudioFile
 *
 * Setting for Module 2.
 * Create a UML diagram with the classes text file, audio file, image file, using the File class.
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

public class AudioFile extends File {

    private String fileType = "Audio File";

    @Override
    public String getFileType() {
        return this.fileType;
    }
}
