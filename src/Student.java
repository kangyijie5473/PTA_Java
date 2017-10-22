import java.util.Scanner;

/**
 * Created by KangKang on 17-10-22-上午10:08
 */
public class Student {
    private String name;
    private String sex;
    private int age;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();
        String sex = scanner.next();
        Student fx = new Student(name, sex, age);
        System.out.println(fx.toString());
    }

    public Student(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    @Override
    public String toString() {
        return  "Student [name='" + name + "',sex='" + sex + "',age=" + age + ']';
        //return ret;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
