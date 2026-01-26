class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            int diff = Math.abs(arr[i] - arr[i+1]);
            min = Math.min(min,diff);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++){
            int diff = Math.abs(arr[i] - arr[i+1]);
            if(diff == min){
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}