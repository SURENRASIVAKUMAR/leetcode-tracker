// Last updated: 7/9/2026, 9:49:26 AM
class Solution {
    void dfs(int[][] img, int r, int c, int clr, int oc) {
        if (r < 0 || c < 0 || r >= img.length || c >= img[0].length || img[r][c] != oc) {
            return;
        }
        img[r][c] = clr;
        dfs(img, r - 1, c, clr, oc); // up
        dfs(img, r, c + 1, clr, oc); // right
        dfs(img, r + 1, c, clr, oc); // down
        dfs(img, r, c - 1, clr, oc); // left
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor != color) {
            dfs(image, sr, sc, color, oldColor);
        }
        return image;
    }
}