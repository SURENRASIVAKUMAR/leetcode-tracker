// Last updated: 7/9/2026, 9:49:17 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n = image.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (image[i].length + 1) / 2; j++){
                
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[i].length - 1 - j] ^ 1;
                image[i][image[i].length - 1 - j] = temp;
            }
        }
        
        return image;
    }
}
