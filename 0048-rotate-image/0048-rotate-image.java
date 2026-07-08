class Solution {
    public void rotate(int[][] matrix) {
        //step1: tranpose of a matrix 
        //swap matrix[i][j], matrix[j][i]
        int N = matrix.length;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
        //steep2: reverse all row of matrix 
        //har row par jauga and use reverse kr duga 
       for(int row=0; row<N; row++){
           int startCol = 0;
            int endCol = N-1;
        while(startCol<= endCol){
            //swap matrix[row][startCol], matrix[row][endCol]
            int temp = matrix[row][startCol];
            matrix[row][startCol] =  matrix[row][endCol];
            matrix[row][endCol] = temp;

            startCol++;
            endCol--;
        }
       }
         
        
    }
}