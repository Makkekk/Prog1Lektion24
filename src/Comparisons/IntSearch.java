package Comparisons;

import javax.imageio.metadata.IIOMetadataFormatImpl;



public class IntSearch {
    public static boolean linearSearchArray(int[] candidates, int target) {
        int index = 0;
        while (index < candidates.length) {
            if (candidates[index] == target) {
                return true;
            } else {
                index++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] myInts = {2,5,13,303,30002,1000000};
        System.out.println(binarySearchArray(myInts,30002));
        System.out.println("Solen".compareTo("Månen"));
        System.out.println("Månen".compareTo("Solen"));
        System.out.println("Månen".compareTo("Jorden"));
        System.out.println((int)'M');

    }

    public static int binarySearchArray(int[] kandidater, int target) {
        int indeks = -1;
        int left = 0;
        int right = kandidater.length-1;
        while (indeks == -1 && left <= right) { //-1 indikere at målet ikke er fundet
            int middle = (left + right) / 2;
            int kandidat = kandidater[middle];
            if (kandidat == target)
                indeks = middle;
            else {
                if (kandidat > target)
                    right = middle - 1;
                else
                    left = middle + 1;
            }
        }
        return indeks;
    }

}
