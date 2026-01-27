class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int num = st.pop();
                int nse = i;
                int pse = (st.isEmpty()) ? -1 : st.peek();
                int area = heights[num] * ( nse - pse - 1);
                maxArea = Math.max(area, maxArea);
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int num = st.pop();
            int nse = heights.length;
            int pse = (st.isEmpty()) ? -1 : st.peek();
            int area = heights[num] * (nse - pse - 1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}