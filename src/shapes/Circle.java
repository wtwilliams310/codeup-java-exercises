package shapes;
import util.Input;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * (Math.pow(this.radius, 2));
        return area;
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }
}
