// User function Template for Java

class Solution {
    public int rowWithMax1s(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        int maxRowIndex = -1;
        int j = cols - 1;

        for (int i = 0; i < rows; i++) {
            while (j >= 0 && mat[i][j] == 1) {
                j--;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }
}


   