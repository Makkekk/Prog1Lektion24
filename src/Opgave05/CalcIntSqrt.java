package Opgave05;

import com.sun.tools.javac.Main;

public class CalcIntSqrt {


    public static int integerSquareRoot(int n) {
        int r = 0;
        while (r * r <= n) { //opfylder r^2 <= n
            r++;
        }
        return r-1; //opfylder (r+1)^2 ved at minuse r
    }

    public static int integerSquareRootBineary(int n) {

        int left = 0; //Venstre grænseværdi
        int right = n; //Højre grænseværdi
        int result = -1; //variabel til at gemme værdi

        while (left <= right) {
            int middle = (left + right) / 2; //Miderste værdi

            if (middle > 0 && middle > n / middle) {
                right = middle - 1; // Middel^2 > n, så der søges lavere værdier
            } else {
                result = middle; // mid er en mulig kandidat
                left = middle + 1; // Søg større værdier for at finde højest passende "r"
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println("Heltalskvadraroden af " + n + "er: " + integerSquareRoot(n));



    }
}
