class Solution {
    public int quickSort(int[] arr, int low, int high,int target) {

        if(low <= high){
             int pivotInd = partition(arr,low,high);
             if(pivotInd == target) return arr[pivotInd];
             else if (pivotInd > target) {
                return quickSort(arr, low, pivotInd - 1, target);
            }
            else {
                return quickSort(arr, pivotInd + 1, high, target);
            }
        }
        return-1;
        
    }
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= pivot && i <= high - 1) i++;
            while(arr[j] > pivot && j >= low + 1) j--;
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp; 
        return j;
    }
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length-k;
        return quickSort(nums,0,nums.length-1,target);
    }
}