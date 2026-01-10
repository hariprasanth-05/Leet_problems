class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> st = new HashSet<>();
        for(int i=arr.length-2; i>=0;i--){
            int sum = arr[i] - arr[i+1];
            System.out.print(sum+" ");
            st.add(sum);
        }
        return (st.size() == 1);
    }
}