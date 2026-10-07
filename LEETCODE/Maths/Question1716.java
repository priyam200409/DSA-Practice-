//https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/

class Solution {
    public int totalMoney(int n) {

        int div = n / 7;
        int mod = n % 7;

        int sum = div * 28 + 7 * div * (div - 1) / 2;

        int su = 0;

        for (int i = 1; i <= mod; i++) {
            su += div + i;
        }

        return sum + su;
    }
}