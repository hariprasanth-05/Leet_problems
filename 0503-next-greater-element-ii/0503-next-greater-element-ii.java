class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int[] ans = new int[arr.length];
        int n = arr.length;
        for(int i =0 ; i < n; i++){
            for(int j = i+1; j <= i+n-1; j++){
                int ind = j % n;
                if(arr[ind] > arr[i]){
                    ans[i] = arr[ind];
                    break;
                }
                else ans[i] = -1;
            }
        }
        return ans;
    }
}