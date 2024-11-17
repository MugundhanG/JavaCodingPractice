package OOPConceptsProblems.AbstractionAndEncapsulation;

abstract class Shape {

//    final double PI = 3.14;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void checkArea() {
        System.out.println("Area is calculated: " + calculateArea());
    }

    public void checkPerimeter() {
        System.out.println("perimeter is calculated: " + calculatePerimeter());
    }

}
