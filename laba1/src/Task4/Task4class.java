package Task4;
import java.util.Scanner;
import java.math.BigInteger;

public class Task4class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) 
        {
            System.out.printf("NumbersArray[%d] = ", i);
            array[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < array.length; i++) 
        {
            if (BigInteger.valueOf(array[i]).isProbablePrime(array[i])) 
            {
                System.out.println(i);
            }
        }   
    }    
}
