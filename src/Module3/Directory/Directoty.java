package Module3.Directory;

import java.util.List;

/**
 * class Directoty
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
 * Created by coura on 03.03.2016.
 */

class Directoty {

    static void someFiles() {

        AudioFile audioFile = new AudioFile();
        PicturesFile picturesFile = new PicturesFile();
        TextFile textFile = new TextFile();

        System.out.println(audioFile.getFileType());
        System.out.println(picturesFile.getFileType());
        System.out.println(textFile.getFileType());
    }
}
