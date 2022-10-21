package Task7;
import java.util.Scanner;

public class Task7class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++)
        {
            numbers[i] = scanner.nextInt();
        }

        int x;
        for(int i = 0; i < n - 1; i++)
        {
            if(numbers[i] > numbers[i + 1])
            {
                x = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = x;
                i -= 2;
                if(i < 0)
                    i = -1;
            }
        }

        for(int i = 0; i < n; i++)
            System.out.printf("%d ", numbers[i]);
    }
}
