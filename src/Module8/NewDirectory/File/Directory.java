package Module8.NewDirectory.File;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coura on 27.03.2016.
 */

public class Directory {

    PictureFile pictureFile;
    AudioFile audioFile;
    TextFile textFile;
    List<File> filesList = new ArrayList<>();

    public void addFile(File file) {
        filesList.add(file);
    }

    public List<File> getFilesList() {
        return filesList;
    }
}
