import java.util.Scanner;

/**
 * Created by KangKang on 17-11-17-下午2:11
 */
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPeri();
}
class Circle extends Shape{
    private double R;
    public Circle(double R){
        this.R = R;
    }
    @Override
    public double getArea() {
        return Math.PI * R * R;
    }

    @Override
    public double getPeri() {
        return 2 * Math.PI * R;
    }
}
class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPeri() {
        return 2 * (width + length);
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        Circle circle = new Circle(a);
        Rectangle rectangle = new Rectangle(b,c);
        System.out.println("Circle area=" + circle.getArea() + ", peri=" + circle.getPeri());
        System.out.println("Rectangle area=" + rectangle.getArea() + ", peri=" + rectangle.getPeri());
    }
}