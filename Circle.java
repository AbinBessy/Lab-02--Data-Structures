
class Circle implements Shape, Colorable {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }


    @Override
    public String getColor() {

        return color;
    }

    public double getRadius() {

        return radius;
    }
}
