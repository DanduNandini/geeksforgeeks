class Solution {
    public void rotateMatrix(int[][] matrix) {
        // code here
    
    
        int n = matrix.length;
     
        for (int i = 0; i < n; i++) {
            for (int j = i ; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
            for (int j = 0; j < n; j++) {
            for (int i = 0; i < n / 2; i++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
    }
}
   

 