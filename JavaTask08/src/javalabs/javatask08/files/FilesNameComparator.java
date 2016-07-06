package javalabs.javatask08.files;

import java.util.Comparator;

public class FilesNameComparator implements Comparator<File> {
    @Override
    public int compare(File file1, File file2) {
        return file1.getName().compareTo(file2.getName());
    }
}
