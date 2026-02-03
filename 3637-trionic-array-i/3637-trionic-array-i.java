class Solution {
    public boolean isTrionic(int[] nums) {
        boolean f = false;
        boolean s = false;
        boolean t = false;
        int ind = 0;
        if(nums.length < 4) return false;
        if(nums[0] > nums[1]) return false;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                f = true;   
            }
            else{
                ind = i;
                break;
            }        
        }
        
        for(int i = ind ; i < nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                s = true;
            }
            else {
                ind = i;
                break;
            }
        }
        
        for(int i = ind; i < nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                t = true;
            }
            else{
                t = false;
                break;
            }
        }
        
        return (f && s && t);
        
    }
}