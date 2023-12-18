public class TDSpiMatrix {
    public static void Spiral_matrix(int matrix[][]) {
        int startrow = 0;
        int startcloumn = 0;
        int endrow = matrix.length - 1;
        int endcolumn = matrix[0].length - 1;

        while (startrow <= endrow && startcloumn <= endcolumn) {
            // top
            for (int j = startcloumn; j <= endcolumn; j++) {
                System.out.println(matrix[startrow][j] + " ");
            }

            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.println(matrix[i][endcolumn] + " ");
            }

            // bottom
            for (int j = endcolumn - 1; j >= startcloumn; j--) {
                System.out.println(matrix[endrow][j] + " ");
            }

            // left
            for (int i = endrow - 1; i > startrow; i--) {
                System.out.println(matrix[i][startcloumn] + " ");
            }

            startcloumn++;
            startrow++;
            endcolumn--;
            endrow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        Spiral_matrix(matrix);
    }
}
