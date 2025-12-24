class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int totApples = 0;
        for(int i=0; i<apple.length; i++){
            totApples += apple[i];
        }
        int i = 0;
        for(i=capacity.length-1; i>=0; i--){
            if(totApples <= 0){
                break;
            }
            totApples -= capacity[i];
            // cnt++;
        }
        return capacity.length-i-1;
    }
}