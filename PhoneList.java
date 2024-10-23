public class PhoneList {
  ContactNode head; // reference to the head

  // Inner class
  class ContactNode {
    // attributes
    String name, phonNumber;
    ContactNode next; // reference to the next node

    // First constructor without next node
    ContactNode(String name, String phonNumber) {
      this.name = name;
      this.phonNumber = phonNumber;
    }

    // Second constructor with next node
    ContactNode(String name, String phonNumber, ContactNode next) {
      this(name, phonNumber); // calls First constuctor
      this.next = next;
    }
  }
  public static void main(String args[]) {

  }
  // Methods
  public static void addContact(String name, String phoneNumber) {

  }


  public static void displayList() {

  }

  public static void searchContact(String name) {

  }

  public static void deleteContact(String name) {

  }
}
