package Module8.Directory;

import java.util.ArrayList;

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

    void someFiles() {

        ArrayList<File> files = new ArrayList<>();

        AudioFile audio = new AudioFile();
        audio.setFileName("BumBox");
        files.add(audio);

        PicturesFile pictures = new PicturesFile();
        pictures.setFileName("Goverla");
        files.add(pictures);

        TextFile text = new TextFile();
        text.setFileName("Coursework");
        files.add(text);

        for (String n : files) {
            System.out.println(files.get(n));
        }
    }

}
