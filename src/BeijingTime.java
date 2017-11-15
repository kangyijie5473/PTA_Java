import java.util.Scanner;

/**
 * Created by KangKang on 17-11-1-下午3:33
 */
public class BeijingTime {
    private int hour;
    private int minute;
    private int second;

    public BeijingTime(int hour, int minute, int second){
        if (hour > 23 || hour < 0 )
            this.hour = 0;
        else
            this.hour = hour;
        if (minute > 59 || minute < 0)
            this.minute = 0;
        else
            this.minute = minute;
        if (second > 59 || second < 0)
            this.second = 0;
        else
            this.second = second;

    }
    public void showTime(){
        System.out.println("now BeijingTime is " + hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        BeijingTime time = new BeijingTime(hour, minute, second);
        time.showTime();
    }
}
