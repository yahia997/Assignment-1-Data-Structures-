public class Main {
    public static void main(String[] args) {
      // Test our implementation
      PhoneList list = new PhoneList();
      // try print and list is empty ------------------------------
      // list.displayList();

      // adding -----------------------------------------------------
      list.addContact("Belal", "01097741207");
      list.addContact("Yousef", "0123456489");
      list.addContact("Marwan", "01097741207");
      list.addContact("Yahya", "01097741207");
      // list.displayList();
      
      // test delete from front -----------------------
      // list.deleteContact("Belal");
      // list.displayList();

      // test delete from end ---------------------------
      // list.deleteContact("Yahya");
      // list.displayList();

      // delete from middle -------------------------------
      // list.deleteContact("Marwan");
      // list.displayList();

      // try deleting something is not in the list -----------------------------------
      // list.deleteContact("Adel Shakal");

      // searching for found contact -----------------------------------------
      // list.searchContact("yousef");

      // searching for not found contact --------------------------------
      // list.searchContact("Adel Shakal");
    }
}