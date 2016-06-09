package javalabs.javatask05.arrays;

import java.util.Arrays;

public class ArrayUtils {
    /*
        Methods, that return a minimum and a maximum elements of an array.
    */
    public static int returnMinElement(int[] array) {
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    public static int returnMaxElement(int[] array) {
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
    /*
        Binary search
    */
    public static int binarySearch(int[] array, int key) {

        return privateBinarySearch(array, 0, array.length - 1, key);
    }

    public static int binarySearch(int[] array, int leftBorder, int rightBorder, int key) {
        boundsTest(array.length, leftBorder, rightBorder);
        return privateBinarySearch(array, leftBorder, rightBorder, key);
    }

    private static int privateBinarySearch(int[] array, int leftBorder, int rightBorder, int key) {
        while (leftBorder <= rightBorder) {
            int currentPosition = (leftBorder + rightBorder) / 2;
            if (key < array[currentPosition]) {
                rightBorder = currentPosition - 1;
            } else if (key > array[currentPosition]) {
                leftBorder = currentPosition + 1;
            } else {
                return currentPosition;
            }
        }
        return -1;
    }
    /*
        QuickSort
    */
    public static void sort(int[] array) {
        privateSort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int leftBorder, int rightBorder) {
        boundsTest(array.length, leftBorder, rightBorder);
        privateSort(array, leftBorder, rightBorder);
    }

    private static void privateSort(int[] array, int leftBorder, int rightBorder) {
        if (leftBorder >= rightBorder) {
            return;
        }
        int start = leftBorder;
        int end = rightBorder;
        int currentPosition = start + (end - start) / 2;
        while (start < end) {
            while ((start < currentPosition) && (array[start] <= array[currentPosition])) {
                start++;
            }
            while ((end > currentPosition) && (array[currentPosition] <= array[end])) {
                end--;
            }
            if (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                if (start == currentPosition) {
                    currentPosition = end;
                } else if (end == currentPosition) {
                    currentPosition = start;
                }
            }
        }
        privateSort(array, leftBorder, currentPosition);
        privateSort(array, currentPosition + 1, rightBorder);
    }
    /*
       Checking bounds method
    */
    private static void boundsTest(int arrayLength, int leftBorder, int rightBorder) {
        if (leftBorder < 0) {
            throw new ArrayIndexOutOfBoundsException("leftBorder index < 0: " + leftBorder);
        }
        if (rightBorder >= arrayLength) {
            throw new ArrayIndexOutOfBoundsException("rightBorder index > number of arrays elements : " + rightBorder);
        }
        if (leftBorder > rightBorder) {
            throw new IllegalArgumentException("leftBorder > rightBorder which is illegal!");
        }
    }
}
