package homework_Lesson_8_Exercise_1;

public class Rectangle extends Shape{

    double width;
    double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled ) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) { super(color, filled);}

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width + length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
