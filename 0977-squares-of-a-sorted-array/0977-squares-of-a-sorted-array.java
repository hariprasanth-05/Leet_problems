class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int ptr = nums.length-1;
        while(start <= end){
            int first = nums[start]*nums[start];
            int last = nums[end]*nums[end];
            if(first > last){
                res[ptr] = first;
                start++;
            }
            else{
                res[ptr] = last;
                end--;
            }
            ptr--;
        }
        return res;
    }
}