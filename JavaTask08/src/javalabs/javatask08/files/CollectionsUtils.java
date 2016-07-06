package javalabs.javatask08.files;

import java.lang.reflect.Field;
import java.util.*;

public class CollectionsUtils {

    public static void sort(List<File> list, Comparator comp) {
        privateSort(list, comp, 0, list.size() - 1);
    }

    private static void privateSort(List<File> list, Comparator comp, int left, int right) {
        if (left >= right) {
            return;
        }
        if ((list == null) || list.isEmpty()) {
            System.out.println("The collection is empty!");
        }
        if (list.size() < 2) {
            return;
        }

        int start = left;
        int end = right;
        int currentPosition = start + (end - start) / 2;
        while (start < end) {
            while ((start < currentPosition) &&  (comp.compare(list.get(start), list.get(currentPosition)) <= 0)){
                start++;
            }
            while ((end > currentPosition) && (comp.compare(list.get(currentPosition), list.get(end)) <= 0)) {
                end--;
            }
            if (start < end) {
                File temp1 = list.get(start);
                File temp2 = list.get(end);
                list.set(start, temp2);
                list.set(end, temp1);
                if (start == currentPosition) {
                    currentPosition = end;
                } else if (end == currentPosition) {
                    currentPosition = start;
                }
            }
        }
        privateSort(list, comp, left, currentPosition);
        privateSort(list, comp,  currentPosition + 1, right);
    }

    public static void print(Collection E) {
        if ((E == null) || E.isEmpty()) {
            System.out.println("The collection is empty!");
        }
        Set<Field> collectionFields = new LinkedHashSet<>();
        for (Object o: E) {
            Class c = o.getClass();
            createSetOfFields(collectionFields, c);
            while (c.getSuperclass() != null) {
                c = c.getSuperclass();
                createSetOfFields(collectionFields, c);
            }
        }
        System.out.format("%20s", "Class");
        for (Field f: collectionFields) {
            System.out.format("%20s", f.getName());
        }
        System.out.print("\n");

        for (Object o: E) {
            System.out.format("%20s", o.getClass().getSimpleName());
            for (Field field: collectionFields) {
                try {
                    field.setAccessible(true);
                    if (field.get(o) instanceof Date) {
                        System.out.format("%20tD", field.get(o));
                    } else {
                        String temp = String.valueOf(field.get(o));
                        System.out.format("%20s", temp);
                    }
                } catch (Exception e) {
                    System.out.format("%20s", "-");
                }
            }
            System.out.print("\n");
        }
    }

    private static void createSetOfFields(Set<Field> collectionFields, Class c) {
        Field[] fields = c.getDeclaredFields();
        for (Field f: fields) {
            collectionFields.add(f);
        }
    }
}
