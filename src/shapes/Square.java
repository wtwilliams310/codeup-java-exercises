package shapes;

public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    //    private int side;
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//
//    }
//
//
//    @Override
//    public int getArea() {
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * side;
//    }
}
