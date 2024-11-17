package OOPConceptsProblems.AbstractionAndEncapsulation;

public class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area = length * width;
        return area;
    };


}
