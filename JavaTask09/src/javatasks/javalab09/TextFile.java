package javatasks.javalab09;

import java.util.Date;

public class TextFile extends  File {
    public TextFile() {
    }

    public TextFile(Directory directory, String name, long size, Date date) {
        super(directory, name, size, date);
    }
}
