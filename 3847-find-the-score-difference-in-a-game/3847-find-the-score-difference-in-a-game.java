class Solution {
    public int scoreDifference(int[] nums) {
        boolean isFirst = true;
        boolean isSecond = false;
        int i = 0;
        int f = 0;
        int s = 0;
        while(i < nums.length){
            if((nums[i] & 1) == 1){
                if(isFirst){
                    isFirst = false;
                    isSecond = true;
                }
                else{
                    isFirst = true;
                    isSecond = false;
                } 
            }
            if((i+1) % 6 == 0){
                if(isFirst){
                    isFirst = false;
                    isSecond = true;
                }
                else{
                    isFirst = true;
                    isSecond = false;
                }
            }

            if(isFirst) f += nums[i];
            else s += nums[i];
            i++;
        }
        return f - s;
    }
}