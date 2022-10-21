package Task3;
import java.util.Scanner;

public class Task3class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x: ");
        double a = scanner.nextDouble();
        System.out.print("Input y: ");
        double b = scanner.nextDouble();
        System.out.print("Input h: ");
        double h = scanner.nextDouble();
        scanner.close();
        System.out.println("-------------------");
        for (double x = a; x <= b; x+=h )
            System.out.format("| %.4f | %.4f |\n", x, function(x));
        System.out.println("-------------------");
    }
    private static double function(double x){
        return Math.tan(x);
    }
}
