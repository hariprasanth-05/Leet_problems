class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[0] - arr[1];
        for(int i=arr.length-2; i>0;i--){
            if(arr[i]-arr[i+1]!=diff){
                return false;
            }
        }
        return true;
    }
}