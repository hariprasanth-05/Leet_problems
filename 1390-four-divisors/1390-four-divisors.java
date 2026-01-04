class Solution {
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int cnt = 1;
            int sum = 0;
            for(int j=1; j<=num/2; j++){
                if(num % j == 0){
                    cnt++;
                    sum += j;
                }
                if(cnt > 4){
                    break;
                }
            }
            if(cnt == 4){
                res += sum + num;
            }
        }
        return res;
    }
}