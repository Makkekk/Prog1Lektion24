package Opgave03;

import javax.swing.text.StyledEditorKit;

public class Opgave03Test {
    public static void main(String[] args) {
        int[] testArray1 = {23, 54, 23, 975, 2, 13}; //false
        int[] testArray2 = {42, 51, 45, 45, 42, 17}; //true

        System.out.println("Test array1: " + isNextNumberEqual(testArray1));
        System.out.println("Test array2: " + isNextNumberEqual(testArray2));

    }

    public static boolean isNextNumberEqual(int[] numbers) {
        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
