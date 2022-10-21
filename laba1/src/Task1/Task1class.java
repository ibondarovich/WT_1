package Task1;
import java.util.Scanner;

public class Task1class 
{
    private double x;
    private double y;
    private double Calculate(double x, double y)
    {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2))))) + x;
    }
    public static void main(String[] args)
    {
        Task1class task = new Task1class();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x: ");
        task.x = scanner.nextDouble();
        System.out.print("Input y: ");
        task.y = scanner.nextDouble();
        scanner.close();
        
        System.out.println(task.Calculate(task.x, task.y));
    }
}
