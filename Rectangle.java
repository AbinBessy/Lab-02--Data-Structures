
class Rectangle implements Shape, Colorable {
    private double length;
    private double width;
    private String color;


    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }


    @Override
    public double getArea() {

        return length * width;
    }


    @Override
    public String getColor() {

        return color;
    }


    public double getLength() {

        return length;
    }

    public double getWidth() {

        return width;
    }
}
