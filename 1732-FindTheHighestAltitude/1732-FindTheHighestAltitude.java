// Last updated: 9/7/2026, 1:45:56 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            alt=alt+gain[i];
            if(alt>max){
                max=alt;
            }
        }
return max;
    }
}