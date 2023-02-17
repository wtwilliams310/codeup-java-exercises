package shapes;

public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    private int side;
    @Override
    public void setLength(int length) {
        this.side = length;
    }

    @Override
    public void setWidth(int width) {
        this.side = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
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
