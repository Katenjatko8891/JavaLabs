package javatasks.javalab09;

import java.util.Date;

public abstract class File implements Comparable<File> {
    private Directory directory;
    private String name;
    private long size;
    private Date dateOfCreation;

    protected File() {
    }

    protected File(Directory directory, String name, long size, Date date) {
        this.directory = directory;
        this.name = name;
        this.size = size;
        this.dateOfCreation = date;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int compareTo(File file) {
        return this.getDirectory().toString().compareTo(file.getDirectory().toString());
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getDirectory() {

        return directory;
    }

    public void setDirectory(Directory directory)
    {
        this.directory = directory;
    }
}
