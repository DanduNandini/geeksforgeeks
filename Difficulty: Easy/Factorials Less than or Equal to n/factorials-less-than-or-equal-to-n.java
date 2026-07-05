class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> ans = new ArrayList<>();
        long fact = 1;

        for (int i = 1; fact <= n; i++) {
            fact *= i;
            if (fact <= n)
                ans.add(fact);
        }

        return ans;
    }
}