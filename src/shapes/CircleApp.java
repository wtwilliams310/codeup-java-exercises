package shapes;
import org.w3c.dom.ls.LSOutput;
import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter the radius of the circle: ");
        double userRadius = input.getDouble();

        Circle circle = new Circle(userRadius);
        System.out.println(circle.getArea());;
        System.out.println(circle.getCircumference());;

    }




}
