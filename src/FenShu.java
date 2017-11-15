import java.util.Scanner;

/**
 * Created by KangKang on 17-11-15-下午5:56
 */
public class FenShu {
    private int zi;
    private int mu;
    public FenShu(int zi, int mu){
        this.zi = zi;
        this.mu = mu;
    }

    public int getMu() {
        return mu;
    }

    public int getZi() {
        return zi;
    }
    public void cheng( FenShu b){
        int zi = this.getZi() * b.getZi();
        int mu = this.getMu() * b.getMu();
        if(mu % zi == 0)
            System.out.println("1/" + mu/zi);
        else if (zi % mu == 0)
            System.out.println(zi/mu + "/1");
        else
            System.out.println(zi + "/" + mu);
    }

    public static void main(String[] args) {
        int a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        FenShu e = new FenShu(a,b);
        FenShu f = new FenShu(c,d);
        e.cheng(f);
    }
}
