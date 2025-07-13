// You are given a 2D grid image[][] of size n*m, where each image[i][j] represents the color of a pixel in the image. Also provided a coordinate(sr, sc) representing the starting pixel (row and column) and a new color value newColor.

// Your task is to perform a flood fill starting from the pixel (sr, sc), changing its color to newColor and the color of all the connected pixels that have the same original color. Two pixels are considered connected if they are adjacent horizontally or vertically (not diagonally) and have the same original color.

package P04_Recursion;

public class FloodFillAlgorithm {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length, m = image[0].length;
        int oldColor = image[sr][sc];

        // nothing to do if the starting pixel already has the target color
        if (oldColor == newColor)
            return image;

        dfs(sr, sc, image, n, m, oldColor, newColor);
        return image;
    }

    private void dfs(int r, int c, int[][] img, int n, int m, int oldColor, int newColor) {
        // boundary or color mismatch → stop
        if (r < 0 || r >= n || c < 0 || c >= m || img[r][c] != oldColor)
            return;

        img[r][c] = newColor; // paint current pixel

        // recurse in the four cardinal directions
        dfs(r + 1, c, img, n, m, oldColor, newColor); // down
        dfs(r - 1, c, img, n, m, oldColor, newColor); // up
        dfs(r, c + 1, img, n, m, oldColor, newColor); // right
        dfs(r, c - 1, img, n, m, oldColor, newColor); // left
    }
}
