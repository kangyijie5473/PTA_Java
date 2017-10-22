/**
 * Created by KangKang on 17-10-18-下午3:34
 */
public class Book {
    private static int number = 1;
    private static int amoutOfBooks = 0;
    private int bookId;
    private String name;
    private int amount;
    private double price;

    public Book(String name, int amount, double price){
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.bookId = Book.number++;
        Book.amoutOfBooks += amount;
    }

    public void getInfoOfBook(){
        System.out.println("The book name is" + name + " Id is "+bookId);
    }
    public static int getAmoutOfBooks(){
        return Book.amoutOfBooks;
    }

//    public static void main(String[] args) {
//        fengxin axin = new fengxin();
//        System.out.println(axin.getName());
////        Book cppBook = new Book("C++Primer",20, 95.2);
////        Book javaBook = new Book("think in Java", 30, 98.1);
////        System.out.println(Book.getAmoutOfBooks());
////        cppBook.getInfoOfBook();
////        javaBook.getInfoOfBook();
//    }
}
