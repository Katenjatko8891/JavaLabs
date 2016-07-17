package javatasks.javalab09;

import java.util.Date;

public class PictureFile extends  File {
    public PictureFile() {
    }

    public PictureFile(Directory directory, String name, long size, Date date) {
        super(directory, name, size, date);
    }
}
