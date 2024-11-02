import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        // Test our implementation
        PhoneList list = new PhoneList();
        list.addContact("Yahya", "01097741207");
        list.addContact("Belal", "01097741207");
        list.addContact("Yousef", "0123456489");
        list.addContact("Marwan", "01097741207");
//        list.displayList();

        list.deleteContact("Yousef");
        list.displayList();
    }
}
