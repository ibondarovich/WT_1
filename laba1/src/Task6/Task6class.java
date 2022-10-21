package Task6;
import java.util.Scanner;

public class Task6class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input size of matrix: ");
        int n = scanner.nextInt();

        int[][]matrix = new int[n][n];
        int pos;
        for (int i = 0, len = matrix.length - 1; i <= len; i++) 
        {
            System.out.printf("a[%d] = ", i);
            matrix[0][i] = scanner.nextInt();     
            for (int j = 1; j <= len; j++) 
            {
                pos = i - j;
                if(pos < 0) { pos = matrix.length + pos; }
                matrix[j][pos] = matrix[0][i];
            }
        }

        scanner.close();

        for (int i = 0; i < matrix.length; i++) 
        {
            System.out.print("\n");
            for (int j = 0; j < matrix.length; j++) 
            {
                System.out.print(" " + matrix[i][j] + " ");
            }
        }
    }
}
