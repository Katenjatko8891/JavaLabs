package javatasks.javalab09;

import java.util.Date;

public class AudioFile extends  File {
    public AudioFile() {
    }

    public AudioFile(Directory directory, String name, long size, Date date) {
        super(directory, name, size, date);
    }
}
