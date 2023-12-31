import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // top
            for (int j = startColumn; j <= endColumn; j++) {
                result.add(matrix[startRow][j]);
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endColumn]);
            }

            // bottom
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                result.add(matrix[endRow][j]);
            }

            // left
            for (int i = endRow - 1; i > startRow; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                result.add(matrix[i][startColumn]);
            }

            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }

        return result;
    }
}
