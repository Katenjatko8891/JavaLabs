package javatasks.javalab09;

import java.util.Comparator;

public class FilesSizeComparator implements Comparator<File> {
    @Override
    public int compare(File file1, File file2) {
        if(file1.getSize() > file2.getSize())
            return 1;
        else if(file1.getSize()< file2.getSize())
            return -1;
        else
            return 0;
    }
}
