import java.util.Scanner;

/**
 * Created by KangKang on 17-11-1-下午2:44
 */
public class Address {
    private String name;
    private String emailAddress;
    private String phoneNumber;
    public Address(String name, String emailAddress, String phoneNumber){
        this.emailAddress = emailAddress;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public void show(){
        System.out.println("name=" + name + ",telephone=" + phoneNumber + ",eMail=" + emailAddress);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.next();
        String phoneNumber = scanner.next();
        String email = scanner.next();
        Address address  =  new Address(name, email, phoneNumber);
        address.show();

    }
}
