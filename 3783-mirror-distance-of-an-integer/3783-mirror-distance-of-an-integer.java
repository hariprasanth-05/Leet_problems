class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int reverse = 0;
        while(num != 0){
            reverse = (reverse*10)+(num % 10);
            num /= 10;
        }
        return Math.abs(n - reverse);
    }
}