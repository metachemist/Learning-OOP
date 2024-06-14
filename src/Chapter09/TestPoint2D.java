package Chapter09;
import java.util.Scanner;
import javafx.geometry.Point2D;

public class TestPoint2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter point1's x-, y- coordinate:  ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter point2's x-, y- coordinate:  ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        System.out.println(p1.toString());
        

    }
    
}
