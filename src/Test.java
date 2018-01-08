import java.util.Scanner;

/**
 * Created by KangKang on 17-11-10-下午2:58
 */
abstract class TT{
    abstract void dis();
}
public class Test extends TT{
    @Override
    void dis() {
        System.out.println("Test");
    }

    public static void changeStr(String str){
        str = "wel";
    }

    public static void main(String[] args) {
        String a = "123";
        changeStr(a);
        System.out.println(a);
    }
//    public static void main(String[] args) {
//        int[] arr = new int[]{8, 2, 1, 0, 3};
//        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
//        String tel = "";
//        for (int i : index) {
//            tel += arr[i];
//        }
//        System.out.println("telephone number=" + tel);
//    }
    public static int test() {
    int t =0;
    try {
        t = 1;
        Integer.parseInt(null);
        return t;
    } catch (Exception e) {
        t = 2;
        return t;
    }
    finally {
        t = 3;
    }
}
    public static void main(String[] args) {
//        System.out.println((new Test()).dis());
        (new Test()).dis();
        (new era()).dis();
    }
}
class era extends TT{
    @Override
    void dis() {
        System.out.println("era");
    }
}


//interface Arithmetic{
//    double calculate(double a, double b);
//}
//class Addition implements Arithmetic{
//    public double calculate(double a, double b){
//        return a+b;
//    }
//}
//class Division implements Arithmetic{
//    public double calculate(double a, double b){
//        return a/b;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        double a=100, b= 15;
//        Arithmetic refVar;
//        Addition o1 = new Addition();
//        refVar = o1;
//        System.out.println(refVar.calculate(a,b));
//        Division o4 = new Division();
//        refVar = o4;
//        System.out.println(refVar.calculate(10,2));
//    }
//}



//interface Arithmetic{
//    double calculate(double a, double b);
//}
//class Addition implements Arithmetic{
//    public double calculate(double a, double b){
//        return a+b;
//    }
//}
//class Division implements Arithmetic{
//    public double calculate(double a, double b){
//        return a/b;
//    }
//}
//class AriShow{
//    public double showAri(Arithmetic ref, double a, double b){
//        return ref.calculate(a,b);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        double a=100, b= 15;
//        AriShow refVar = new AriShow();
//        Addition o1 = new Addition();
//        System.out.println(refVar.showAri(o1,a,b));
//        Division o4 = new Division();
//        System.out.println(refVar.showAri(o4,10,2));
//    }
//}


//import javax.swing.JFrame;
//import javax.swing.JButton;
//import java.awt.event.*;
//
//
//
//class GUIexam2 extends JFrame {
//    private JButton btn;
//    public GUIexam2(){
//        btn=new JButton("单击我");
//        add(btn);
//        btn.addActionListener(new Mylistener());
//    }
//    public static void main(String[] args) {
//        GUIexam2 frame = new GUIexam2();
//        frame.setTitle("我的窗口");
//        frame.setSize(400,200);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}
//
//class Mylistener implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("thank you");
//    }
//}
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import java.awt.event.*;
//import java.awt.Color;
//import javax.swing.border.*;
//import java.awt.FlowLayout;
//class GUIexam2 extends JFrame implements ActionListener{
//    private JButton btn;
//    public GUIexam2(){
//        btn=new JButton("  单击我  ");
//        setLayout(new FlowLayout());
//        add(btn);
//        btn.addActionListener(this);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==btn){
//            System.out.println("我被单击了,谢谢!");
//            btn.setText("  已单击  ");
//            btn.setForeground(Color.RED);
//            btn.setBackground(Color.yellow);
//            btn.setToolTipText("单击后按钮变色");
//            btn.setBorder(new LineBorder(Color.BLUE,4));
//        }
//    }
//
//    public static void main(String[] args) {
//        GUIexam2 frame = new GUIexam2();
//        frame.setTitle("我的窗口");
//        frame.setSize(400,300);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}
//
//import java.util.Scanner;
//public class GUIexam2 {
//    void ioArray() {
//        int n, p;
//        int[][] a=null;
//        Scanner in = new Scanner(System.in);
//        while(a == null){
//            n = in.nextInt();
//            a = new int[n][];
//            for(int i = 0; i < a.length; i++) {
//                p = in.nextInt();
//                a[i] = new int[p];
//            }
//            for(int i = 0; i < a.length; i++) {
//                for(int j = 0; j < a[i].length; j++)
//                    a[i][j] = in.nextInt();
//            }
//        }
//        for(int i = 0; i < a.length; i++) {
//            for(int j = 0; j < a[i].length; j++)
//                System.out.print(a[i][j] + " ");
//            System.out.println("");
//        }
//    }
//
//    public static void main(String[] args) {
//        GUIexam2 a = new GUIexam2();
//        a.ioArray();
//    }
//}
//import java.util.Scanner;
//class GUIexam2 {
//    void handleException() throws Exception{
//        Scanner in = new Scanner(System.in);
//        int first = in.nextInt();
//        int second = in.nextInt();
//        int result;
//
//        try {
//            result = first / second;
//        }finally {
//            //throw Exception
//            System.out.println("Default handle");
//        }
//        System.out.println("END");
//    }
//
//    public static void main(String[] args) {
//        GUIexam2 g = new GUIexam2();
//        try {
//            g.handleException();
//        }catch (Exception e){
//            System.out.println("asd");
//        }
//    }
//}
//public class GUIexam2 {
//    public static final int test() {
//        int t =0;
//        try {
//            t = 1;
//            Integer.parseInt(null);
//            return t;
//        } catch (Exception e) {
//            t = 2;
//            return t;
//        }
//        finally {
//            t = 3;
//            return t;
//        }
//    }
//    public static void main(String[] args) {
//        //System.out.println(GUIexam2.test());
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        System.out.println("accept:" + a);
//        System.out.println("totally input " + a.length() + " characters.");
//    }
//}