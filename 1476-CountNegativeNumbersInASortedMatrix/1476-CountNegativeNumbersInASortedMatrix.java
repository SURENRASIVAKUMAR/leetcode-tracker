// Last updated: 9/3/2026, 2:10:36 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                 if(grid[i][j]<0){
                c++;
                }
            }
           
        }
        return c;
    }
}