import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by KangKang on 17-10-22-上午10:57
 */
public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public int getPerimeter(){
        return (int)(Math.PI * 2 * radius);
    }
    public int getArea(){
        return (int)(Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int w1 = sc.nextInt();
        int l2 = sc.nextInt();
        int w2 = sc.nextInt();
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(w1,l1);
        rectangles[1] = new Rectangle(w2,l2);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(r1);
        circles[1] = new Circle(r2);
        int perimeterSum = 0;
        int areaSum = 0;
        for (int i = 0; i < 2; i++){
            perimeterSum += circles[i].getPerimeter();
            perimeterSum += rectangles[i].getPerimeter();
            areaSum += circles[i].getArea();
            areaSum += rectangles[i].getArea();
        }
        System.out.println(perimeterSum);
        System.out.println(areaSum);
        System.out.println(Arrays.deepToString(rectangles));
        System.out.println(Arrays.deepToString(circles));

    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
