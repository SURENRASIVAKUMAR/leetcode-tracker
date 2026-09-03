// Last updated: 9/3/2026, 2:08:14 PM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int c=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[i].length;j++){
6                 if(grid[i][j]<0){
7                c++;
8                }
9            }
10           
11        }
12        return c;
13    }
14}