class Solution {
    public List<Integer> checkIntersect(int[] n1 ,int[] n2){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n1.length; i++){
            for(int j = 0; j < n2.length; j++){
                if(n1[i] == n2[j]){
                    list.add(n1[i]);
                    n2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return list;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list;
        if(nums1.length < nums2.length){
            list = checkIntersect(nums1,nums2);
        }
        else list = checkIntersect(nums2,nums1);
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}