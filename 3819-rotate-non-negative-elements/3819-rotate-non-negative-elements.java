class Solution {
    public void reverse(List<Integer> list,int start,int end){
        while(start < end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                list.add(nums[i]);
            }
        }
        if(list.size() == 0) return nums;
        k = k % list.size();
        
        reverse(list,0,k-1);
        reverse(list,k,list.size()-1);
        Collections.reverse(list);
        int ind = 0;
        for(int  i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                nums[i] = list.get(ind++);
            }
        }
        return nums;
    }
}