// Last updated: 9/7/2026, 1:48:10 PM
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
