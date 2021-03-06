package javatasks.javalab09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<File> testList = new ArrayList<File>();
        Directory dir = new Directory();
        dir.setName("testDirectory");
        Directory dir1 = new Directory();
        dir1.setName("MyFiles");
        testList.add(new AudioFile(dir, "f1.mp3", 100, new Date()));
        testList.add(new TextFile(dir1, "g.mp3", 10, new Date()));
        testList.add(new PictureFile(dir, "a.mp3", -100, new Date()));
        testList.add(new Directory(dir1, "g.mp3", 0, new Date()));

        CollectionsUtils.print(CollectionsUtils.returnTable(testList));
        Comparator<File> comp1 = new FilesSizeComparator();
        CollectionsUtils.sort(testList, comp1);
        System.out.println("----------------------------------------");
        CollectionsUtils.print(CollectionsUtils.returnTable(testList));

        System.out.println("-------------ENCRYPTION------------");
        CaesarCipher chiperTest = new CaesarCipher();
        String[][] t = chiperTest.encrypt(CollectionsUtils.returnTable(testList));
        CollectionsUtils.print(t);
        System.out.println("-------------DECRYPTION------------");
        CollectionsUtils.print(chiperTest.decrypt(t));

        Comparator<File> comp2 = new FilesNameComparator();
        CollectionsUtils.sort(testList, comp2);
        System.out.println("----------------------------------------");
        CollectionsUtils.print(CollectionsUtils.returnTable(testList));

        Comparator<File> pcomp = new FilesNameComparator().thenComparing(new FilesSizeComparator());
        CollectionsUtils.sort(testList, pcomp);
        System.out.println("----------------------------------------");
        CollectionsUtils.print(CollectionsUtils.returnTable(testList));


        testList.sort(null);
        System.out.println("----------------------------------------");
        CollectionsUtils.print(CollectionsUtils.returnTable(testList));


    }
}
