class Solution {

    static String isPowerof3(int N) {

        if (N <= 0) {
            return "No";
        }

        while (N % 3 == 0) {
            N = N / 3;
        }

        return (N == 1) ? "Yes" : "No";
    }
} 