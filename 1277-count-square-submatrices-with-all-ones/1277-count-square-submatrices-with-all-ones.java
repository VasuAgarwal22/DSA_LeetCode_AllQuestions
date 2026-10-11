class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0;
        for(int r = 0;r<matrix.length;r++){
            for(int c = 0;c<matrix[0].length;c++){
                if(matrix[r][c]==1){
                    if(r>0 && c>0){
                        matrix[r][c] += Math.min(matrix[r-1][c],Math.min(matrix[r][c-1],matrix[r-1][c-1]));
                    }
                }
                count+=matrix[r][c];
            }
        }
        return count;
    }
}