class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while(i < j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                break;
            }
            else if(sum < target){
                sum -= numbers[i];
                i++;
            }
            else{
                sum -= numbers[j];
                j--;
            }
        }
        return new int[]{i+1,j+1};
    }
}