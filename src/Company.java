import java.util.Scanner;

/**
 * Created by KangKang on 17-11-17-下午2:04
 */
public class Company implements ClassName{
    private String name;
    public Company(String name){
        this.name = name;
    }
    @Override
    public void getName() {
        System.out.println("name="+this.name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Company company = new Company(name);
        company.getName();
    }
}
