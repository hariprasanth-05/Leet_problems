class Solution {

    public int quickSelect(int[] arr, int low, int high, int target) {

        if (low <= high) {
            int pivotInd = partition(arr, low, high);

            if (pivotInd == target) {
                return arr[pivotInd];
            }
            else if (pivotInd > target) {
                return quickSelect(arr, low, pivotInd - 1, target);
            }
            else {
                return quickSelect(arr, pivotInd + 1, high, target);
            }
        }
        return -1; // safety return
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && arr[i] <= pivot) i++;
            while (j >= low + 1 && arr[j] > pivot) j--;

            if (i < j) {
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
        int target = nums.length - k; // kth largest → index
        return quickSelect(nums, 0, nums.length - 1, target);
    }
}
