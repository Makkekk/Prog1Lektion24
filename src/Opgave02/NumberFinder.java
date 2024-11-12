package Opgave02;

public class NumberFinder {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 14, 18};
        int index = findIndexInInterval(numbers);
        System.out.println("Index " + index);

        int index1 = generalizedMethodFindIndexInInterval(numbers,10,15);
        System.out.println("Index i [10, 15]: " + index1);

        int index3 = generalizedMethodFindIndexInInterval(numbers, 20,30);
        System.out.println("Index i [20, 30]:" + index3);
    }

    public static int findIndexInInterval(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 10 && numbers[i] <= 15) {
                return i;

            }
        }
        return -1;

    }


    public static int generalizedMethodFindIndexInInterval(int[] numbers, int lower, int upper) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= lower && numbers[i] <= upper) {
                return i;

            }
        }
        return -1;

    }
}
