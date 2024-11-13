package Opgave05;

public class CalcIntSqrt {



    public int integerSquareRootLinear(int n) {
        int r = 0;
        while (r * r <= n) {
            r++;
        }
        return r-1;
    }

    public static int integerSquareRoot(int n) {
        if (n < 0) {
            System.out.println("Input må ikek være negativ");

        }

        int left = 0;
        int right = n;
        int result = -1;

        while (left <= right) {
            int middle = (left + right) / 2;

            //Tjek om middle er for stor uden at kvadrere
            if (middle > 0 && middle > n / middle) {
                right = middle - 1; //Middle^2 > n, så vi søger lavere værdier
            } else {
                result = middle; // mid er en mulig kandidat
                left = middle + 1; // Søg større værdier for at finde højest passende "r"
            }
        }
        return result;

    }
}
