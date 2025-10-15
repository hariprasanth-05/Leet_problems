class Solution {
    public boolean check(List<Integer> nums,int start, int end){
        if(start+end > nums.size()) return false;
        for(int i=start; i < start + end-1; i++){
            if(nums.get(i) >= nums.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int adj = 0;
        for(int i=0; i < n; i++){
            adj = 0;
            for(int j=i; j < n; j+=k){
                if(check(nums,j,k)){
                    adj++;
                    if(adj == 2) return true;
                } 
                else break;  
            }
        }
        return false;    
    }
}