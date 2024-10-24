public class Code {
  public static void main(String[] args) {

    // Test our implementation
    PhoneList list = new PhoneList();
    list.addContact("Yahya", "01097741207");
    list.addContact("Belal", "01097741207");
    list.addContact("Marwan", "01097741207");
    list.displayList();

  }
}

// Our Implementation
class PhoneList {
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
  // Methods
  public void addContact(String name, String phoneNumber) {

        ContactNode newContact = new ContactNode(name, phoneNumber);
        if (head == null) { head = newContact; } // List is empty
    
        else {
         ContactNode current = head;
      
         while (current.next != null) {
             current = current.next;
        }
        
        current.next = newContact;
      }
      System.out.println("Contact added: " + newContact.name + ", " + newContact.phonNumber);

  }


  public void displayList() {
    ContactNode current = head;
    while(current != null) {
      System.out.println("Name: " + current.name + ", " + "Phone: " + current.phonNumber);
      current = current.next;
    }
  }

  public void searchContact(String name) {

  }

  public void deleteContact(String name){

  }
}
