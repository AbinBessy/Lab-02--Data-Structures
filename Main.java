// Main.java
public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(0.5, "Blue");
        Rectangle rectangle1 = new Rectangle(2, 3, "Red");
        Rectangle rectangle2 = new Rectangle(5, 8, "Green");
        Circle circle2 = new Circle(3, "Grey");


        System.out.println("Shape\tRadius or (L x W)\tColor");
        displayShapeDetails(circle1);
        displayShapeDetails(rectangle1);
        displayShapeDetails(rectangle2);
        displayShapeDetails(circle2);
    }

    private static void displayShapeDetails(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.printf("Circle\t%.1f\t%s%n", circle.getRadius(), circle.getColor());
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.printf("Rectangle\t%.0f x %.0f\t%s%n", rectangle.getLength(), rectangle.getWidth(), rectangle.getColor());
        }
    }
}
