class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> result = new ArrayList<>();


        int startingrow = 0;
        int endingrow = n-1;
        int startingcol = 0;
        int endingcol = m-1;

        while(startingrow <= endingrow && startingcol <= endingcol){
            //row wise left to right -> startingRow pprint krni h from startingcol to ending col
            for(int col=startingcol; col<=endingcol; col++){
                result.add(matrix[startingrow][col]);
            }
            startingrow++;

            //col wise top to bottom ->
            for(int row=startingrow; row<=endingrow; row++){
                result.add(matrix[row][endingcol]);

            }
            endingcol--;

            // row wise right to left
            if(startingrow<=endingrow){
                  for(int col=endingcol; col>=startingcol; col--){
                result.add(matrix[endingrow][col]);

            }
            endingrow--;
            }
          
            
            //colwise bottom to top 

            if(startingcol<= endingcol){
                 for(int row=endingrow; row>=startingrow;  row--){
                result.add(matrix[row][startingcol]);
            }
            startingcol++;
            }

           


        }

        return result;

    }
}