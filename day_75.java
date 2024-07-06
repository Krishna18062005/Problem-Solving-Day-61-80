class Solution {
    public int passThePillow(int n, int time) {
        int max=1;
        int c=0;
        boolean right,left;
        right=left=false;
        while(c<time){
            c++;
            if(max==n){
                right=false;
                left=true;
            }
            if(max==1){
                right=true;
                left=false;
            }
            if(left){
                max--;
            }
            if(right){
                max++;
            }

        }
        return max;
    }
}
