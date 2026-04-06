class Solution {
    public int robotSim(int[] cmds, int[][] obs) {
        int n = cmds.length;
        char[] dir = {'N','E','S','W'};
        int dx = 0;
        int dy = 0;
        int d = 0;
        char curdir = dir[d];

        Set<String> set = new HashSet<>();
        for(int i = 0; i < obs.length; i++){
            set.add(obs[i][0]+" "+obs[i][1]);
        }
        
        int max = 0;
        boolean isObs = false;

        for(int i = 0; i < cmds.length; i++){
            if(cmds[i] < 0){
                if(cmds[i] == -1){
                    d = (d+1) % 4;
                    curdir = dir[d];
                    isObs = false;
                }
                else{
                    d = (d-1) % 4;
                    if(d < 0){
                        d = d+4;
                    }
                    curdir = dir[d];
                    isObs = false;
                }
            }
            else{
                if(isObs){
                    continue;
                }
                for(int j = 1; j <= cmds[i]; j++){
                    if(curdir == 'N'){
                        dy++;
                        if(set.contains(dx+" "+dy)){
                            dy--;
                            isObs = true;
                            break;
                        }
                    }
                    else if(curdir == 'E'){
                        dx++;
                        if(set.contains(dx+" "+dy)){
                            dx--;
                            isObs = true;
                            break;
                        }
                    }
                    else if(curdir == 'S'){
                        dy--;
                        if(set.contains(dx+" "+dy)){
                            dy++;
                            isObs = true;
                            break;
                        }
                    }
                    else if(curdir == 'W'){
                        dx--;
                        if(set.contains(dx+" "+dy)){
                            dx++;
                            isObs = true;
                            break;
                        }
                    }
                }
                int sqr = (dx*dx)+(dy*dy);
                max = Math.max(sqr, max);
            }
        }
        return max;
    }
}