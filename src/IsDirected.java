public class IsDirected {
    public static boolean isDirected(int[][] matrix) {
        // check that is a valid graph
        if(matrix == null || matrix.length <= 1 || matrix.length != matrix[0].length)
            return false;

        for(int row = 0; row < matrix.length; row++) {

            for(int col = 0; col < matrix[row].length; col++) {
                // check for symmetry across diagonal
                if(matrix[row][col] != matrix[col][row]) {
                    return true;
                }
            }
        }
        return false;
    }
}
