class Solution {
    public long nonpositive(int[] nums,int k){
        long cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k){
                cnt++;
            }
            else{
                int mod = nums[i] % k;
		int u=nums[i] / k;
                cnt +=u;
                if(mod != 0){
                    cnt++;
                }
                 
            }    
        }
        return cnt;
    }
    
    public int minimumK(int[] nums) {
        int h = 0;
        for(int i = 0; i < nums.length; i++){
            h+=nums[i];
        }
        Arrays.sort(nums);
        h = Math.max(nums.length,h);
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