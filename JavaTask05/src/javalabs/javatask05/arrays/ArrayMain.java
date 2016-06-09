package javalabs.javatask05.arrays;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] testArray = new int[arraySize];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int)(Math.random() * 20);
        }
        try {
            System.out.println(Arrays.toString(testArray));
            int maxElement = ArrayUtils.returnMaxElement(testArray);
            int minElement = ArrayUtils.returnMinElement(testArray);
            System.out.println("Maximum element of array: " + maxElement);
            System.out.println("Minimum element of array: " + minElement);
            ArrayUtils.sort(testArray);
            System.out.println(Arrays.toString(testArray));
            int position = ArrayUtils.binarySearch(testArray, 9);
            System.out.println("Position: " + position);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
