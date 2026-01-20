class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mpp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length-1; i >= 0; i--){
            int n1 = nums2[i];
            while(!st.isEmpty() && st.peek() < n1){
                st.pop();
            }
            if(st.isEmpty()){
                mpp.put(n1, -1);
            }
            else{
                mpp.put(n1,st.peek());
            }
            st.push(n1);
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = mpp.get(nums1[i]); 
        }
        return nums1;
    }
}