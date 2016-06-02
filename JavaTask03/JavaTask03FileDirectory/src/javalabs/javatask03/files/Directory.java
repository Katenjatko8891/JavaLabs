package javalabs.javatask03.files;

import java.util.List;

public class Directory extends File {
    private List<File> files;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
