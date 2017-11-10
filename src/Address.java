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
    public void getAddress(){
        System.out.println("name:" + name + " phoneNumber:" + phoneNumber + " emailAddress:" + emailAddress);
    }
}
