class Solution {
    public int[] findNSE(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = arr.length;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }
        return nse;
    }

    public int[] findPSE(int[] arr){
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }
        return pse;

    }
    public int largestRectangleArea(int[] heights) {
        int[] nse = findNSE(heights);
        int[] pse = findPSE(heights);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; i++){
            int rect = heights[i] * (nse[i]-pse[i]-1);
            max = Math.max(max, rect);
        }
        return max;
    }
}