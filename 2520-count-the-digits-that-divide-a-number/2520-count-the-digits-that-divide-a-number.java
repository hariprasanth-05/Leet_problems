class Solution {
    public int countDigits(int num) {
        if(num < 9) return 1;
        int cntDigit = 0;
        int copy = num;
        while(copy > 0){
            int last = copy % 10;
            if(num % last == 0){
                cntDigit++;
            }
            copy /= 10;
        }
        return cntDigit;
    }
}