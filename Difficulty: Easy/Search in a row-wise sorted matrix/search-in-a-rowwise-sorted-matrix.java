

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
 
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == x) {
                    return true;
                }
                // Since the row is sorted, stop early
                if (mat[i][j] > x) {
                    break;
                }
            }
        }

        return false;
    }
}

 

    
