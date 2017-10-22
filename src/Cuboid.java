/**
 * Created by KangKang on 17-10-18-下午3:00
 */
public class Cuboid {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Cuboid() {}
    public double getVolume(){
        return length * width * height;
    }

}
