class Solution {
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int cnt = 0;
            int sum = 0;
            for(int j=1; j*j <= num; j++){
                if(num % j == 0){
                    cnt++;
                    sum += j;
                    if(j != num / j){
                        cnt++;
                        sum += num/j;
                    }
                }
                if(cnt > 4){
                break;
            }
            }
            if(cnt == 4){
                res += sum;
            }
        }
        return res;
    }
}