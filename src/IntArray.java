import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by KangKang on 17-12-8-下午5:09
 */
public class IntArray {
    public IntArray(int length){
        array = new Vector<Integer>();
        if(length > 5)
            this.length = 10;
        else
            this.length = 5;
    }
    public int getLength(){
        return array.size();
    }
    public void addElement(int element){
        array.add(element);
    }
    public int getElement(int index){
        return array.get(index);
    }
    private int length;
    private Vector<Integer> array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int array[][]  = new int[length][length];
        int a[] = new int[length];
        for (int i = 0; i < length; i++)
            a[i] = scanner.nextInt();

        for (int i = 0; i < length; i++){
            for (int j = 0; j < a[i]; j++)
                array[i][j] = scanner.nextInt();
        }
        scanner.next();
        for (int i = 0; i < length; i++){
            for (int j = 0; j < a[i]; j++)
//                if (array[i][j] == 0)
//                    ;
//                else
                    System.out.print(array[i][j] + "  ");
            System.out.println(" ");
        }
//        IntArray array = new IntArray(length);
//        for (int i = 0 ; i < length; ++i)
//            array.addElement(scanner.nextInt());
//        for (int i = 0 ; i < length; ++i)
//            System.out.print(array.getElement(i) + " ");
//        System.out.println("length=" + array.getLength());
    }
}
