class Solution {
    public int[][] transpose(int[][] matrix) {

        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }

        //for original array 
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        //for new array 
        int newtotalRows = totalCols;
        int newtotalCols = totalRows;
        int ans[][] = new int[newtotalRows][newtotalCols];
        

        //actual logic 

        for(int i=0; i<totalRows; i++){
            for(int j=0; j<totalCols; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}