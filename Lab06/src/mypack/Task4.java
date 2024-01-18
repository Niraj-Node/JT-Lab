package mypack;
import java.util.Arrays;

public class Task4 {

    public static <T> boolean areArraysEqual(T[] array1, T[] array2) 
    {
        if(array1 == null || array2 == null) {
            return false;
        }

        if(array1.length != array2.length) {
            return false;
        }

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) 
    {
        Integer[] arrayInt1 = {1, 2, 3, 4, 5};
        Integer[] arrayInt2 = {1, 2, 3, 4, 5};
        Integer[] arrayInt3 = {1, 2, 3, 4, 6};

        String[] arrayStr1 = {"apple", "banana", "orange"};
        String[] arrayStr2 = {"apple", "banana", "orange"};
        String[] arrayStr3 = {"apple", "banana", "grape"};

        // Test the generic method
        System.out.println("Integer Arrays:");
        System.out.println("Arrays are equal: " + areArraysEqual(arrayInt1, arrayInt2)); 
        System.out.println("Arrays are equal: " + areArraysEqual(arrayInt1, arrayInt3));

        System.out.println("\nString Arrays:");
        System.out.println("Arrays are equal: " + areArraysEqual(arrayStr1, arrayStr2));
        System.out.println("Arrays are equal: " + areArraysEqual(arrayStr1, arrayStr3)); 
    }
}