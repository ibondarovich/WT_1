package Task9;

import java.util.ArrayList;

public class Basket {
    public static void main(String[] args)
    {
        Basket basket = new Basket();
        basket.addBall("blue", 15);
        basket.addBall("blue", 27);
        basket.addBall("green", 100);   
        basket.addBall("red", 5);
        basket.addBall("red", 30);
        basket.addBall("yellow", 33);
        basket.addBall("blue", 9);
        System.out.println(basket.CountTotalWeight());
        System.out.println(basket.CountBlueBalls());     
    }

    public ArrayList<Ball> Balls = new ArrayList<Ball>();

    public Basket()
    {
        Balls = new ArrayList<Ball>();
    }

    public int CountTotalWeight()
    {
        int weight = 0;
        for (Ball ball : Balls) {
            weight += ball.weight;
        }

        return weight;
    }   

    public void addBall(String colour, int weight)
    {
        Ball ball = new Ball(colour, weight);
        Balls.add(ball);
    }

    public int CountBlueBalls()
    {
        int blueBallsAmmount = 0;
        for (Ball ball : Balls) {
            if(ball.color == "blue")
                blueBallsAmmount++;
        }

        return blueBallsAmmount;
    }
}
