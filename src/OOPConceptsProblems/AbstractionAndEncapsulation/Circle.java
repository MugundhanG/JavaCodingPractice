package OOPConceptsProblems.AbstractionAndEncapsulation;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = Math.PI * radius * 2;
        return perimeter;
    }

}
