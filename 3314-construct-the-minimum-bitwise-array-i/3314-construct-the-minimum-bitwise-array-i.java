class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n =  nums.size();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int num = -1;
            int a = 1;
            while(a < nums.get(i)){
                if((a|a+1) == nums.get(i)){
                    num = a ;
                    break;
                }
                a++;
            }
            ans[i] = num;
        }
        return ans;
    }
}