import java.util.Scanner;

public class BinaryMatrix {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        n = input.nextInt();
        int[][] matrix;
        matrix = new int[n][n];

        printMatrix(matrix, n);

    }

    public static void printMatrix(int[][] matrix, int n) {
        matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 0 + 1);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

}