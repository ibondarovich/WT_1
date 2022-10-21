package Task2;
import java.util.Scanner;

public class Task2class 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = scanner.nextDouble();
        System.out.print("Input y: ");
        double y = scanner.nextDouble();
        scanner.close();
        System.out.println(check(x,y));
    }
    public static boolean check(double x, double y){
        return checkBottomOfFigure(x, y) || checkTopOfFigure(x, y);
    }

    public static boolean checkBottomOfFigure(double x, double y){
        return (x>=-6 && x<=6) && (y>=-3 && y<=0);
    }

    public static boolean checkTopOfFigure(double x, double y){
        return (x>=-4 && x<=4) && (y>=0 && y<=5);
    }
}
