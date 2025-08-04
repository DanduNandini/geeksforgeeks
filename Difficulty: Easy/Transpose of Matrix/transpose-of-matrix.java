class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int row=mat.length;
        int col=mat[0].length;
       ArrayList<ArrayList<Integer>> result=new ArrayList<>();
      for(int j=0;j<col;j++){
          ArrayList<Integer> newRow =new ArrayList<>();
            for (int i=0;i<row;i++){
                newRow.add(mat[i][j]);
            }
            result.add(newRow);
        }
        return result;
    }
}