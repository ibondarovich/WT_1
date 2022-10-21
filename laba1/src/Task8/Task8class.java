package Task8;
import java.util.Scanner;

public class Task8class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequenceA = new int[n];
        for(int i = 0; i < n; i++)
        {
            sequenceA[i] = scanner.nextInt();
        }
        int[] sequenceB = new int[n];
        for(int i = 0; i < n; i++)
        {
            sequenceB[i] = scanner.nextInt();
        }

        for (int i = 0; i < sequenceA.length; i++) {
            boolean flagIns = true;
            for (int j = 0; j < sequenceB.length; j++) {
                if (sequenceA[i] < sequenceB[j]) {
                    System.out.printf("Insert aSequence[%d] before bSequence[%d]\n", i, j);
                    flagIns = false;
                    break;
                }
            }
            if (flagIns)
                System.out.printf("Insert aSequence[%d] after last bSequence element\n", i);
        }
    }
}
