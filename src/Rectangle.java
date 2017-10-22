/**
 * Created by KangKang on 17-10-22-上午10:47
 */

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }
    public int getPerimeter(){
        return 2 *(width + length);
    }
    public int getArea(){
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
}

