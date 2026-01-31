class Solution {
    public long nonpositive(int[] nums,int k){
        long cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k){
                cnt++;
            }
            else{
                int mod = nums[i] % k;
                if(mod != 0){
                    cnt++;
                }
                int u=nums[i] / k;
                cnt +=u; 
            }    
        }
        return cnt;
    }
    
    public int minimumK(int[] nums) {
        int h = 0;
        Arrays.sort(nums);
        h = Math.max(nums[nums.length-1],nums.length);
        int l = 1;
        while(l <= h){
            int m = (l + h) / 2;
            long cnt = nonpositive(nums,m);
           if(cnt>(long)m*m)
           {
            l=m+1;
           }
           else
           {
            h=m-1;
           }
        }
        return l;
    }
}