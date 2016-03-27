package Module8.NewDirectory.File;

/**
 * Created by coura on 27.03.2016.
 */

public abstract class File implements Comparable<File> {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public File() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(File file) {
        return getName().compareTo(file.getName());
    }
}
