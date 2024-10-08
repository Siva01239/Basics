public class program56 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product of the matrices:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
