import java.util.Scanner;

/**
 * Created by KangKang on 17-10-22-下午1:16
 */
//public class Person {
//    private String name;
//    private int age;
//    private boolean gender;
//    private int id = 0;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Person[] persons = new Person[n];
//        for (int i = 0; i < n; i++){
//            String name = sc.next();
//            int age = sc.nextInt();
//            boolean gender = sc.nextBoolean();
//            persons[i] = new Person(name, age, gender, 0);
//
//        }
//        for (int i = n -1; i >= 0; i--){
//            System.out.println(persons[i].toString());
//        }
//
//        Person axin = new Person();
//        System.out.println(axin.toString());
//    }
//    public Person(){
//        System.out.println("This is constructor");
//        System.out.println(name + "," + age + "," + gender+ "," + id);
//    }
//    public Person(String name, int age, boolean gender, int id){
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        //return "Person [name=" + name +",age="+ age + ",gender=" + gender + ",id=" + id + "]";
//        return "Person [name="+name+", age="+age+", gender="+gender+", id="+id+"]";
//    }
//}


public class Person {
    private String name;
    private int age;
    private boolean gender;
    private int id = 0;
    static  int num = 0;

    static {
        System.out.println("This is static initialization block");
    }

    {
        id = Person.num++;
        System.out.println("This is initialization block, id is " + id);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++){
            String name = sc.next();
            int age = sc.nextInt();
            boolean gender = sc.nextBoolean();
            persons[i] = new Person(name, age, gender);

        }
        for (int i = n -1; i >= 0; i--){
            System.out.println(persons[i].toString());
        }

        Person axin = new Person();
        System.out.println(axin.toString());
    }
    public Person(){
        System.out.println("This is constructor");
        System.out.println(name + "," + age + "," + gender+ "," + id);
    }
    public Person(String name, int age, boolean gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        //return "Person [name=" + name +",age="+ age + ",gender=" + gender + ",id=" + id + "]";
        return "Person [name="+name+", age="+age+", gender="+gender+", id="+id+"]";
    }
}