package javalabs.javatask08.files;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory extends File {
    private List<File> files;

    @Override
    public String toString() {
        return this.getName();
    }

    public Directory() {
        files = new ArrayList<>();
    }

    public Directory(Directory directory, String name, long size, Date date) {
        super(directory, name, size, date);
        files = new ArrayList<>();
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
