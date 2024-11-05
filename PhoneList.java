public class PhoneList {

  private ContactNode head; // reference to the head

  // helper method for deleting contact
  private void deleteFrontContact() {
    head = head.next;
  }

  // Methods
  public void addContact(String name, String phoneNumber) {

    ContactNode newContact = new ContactNode(name, phoneNumber);
    if (head == null) { head = newContact; } // List is empty
    else {
      ContactNode current = head;

      // untill we reach the tail
      while (current.next != null) {
        current = current.next;
      }

      // put newContact at the end
      current.next = newContact;
    }
    System.out.println("Contact added: " + newContact.name + ", " + newContact.phonNumber);
  }


  public void displayList() {

    // handling empty list
    if(head == null) {
      System.out.println("Phone list is empty.");
      return;
    }

    // print the entire list if not empty
    ContactNode current = head;
    while(current != null) {
      System.out.println("Name: " + current.name + ", " + "Phone: " + current.phonNumber);
      current = current.next;
    }
  }

  public void searchContact(String name) {
    ContactNode current = head;
    while(current != null) {
      if(current.name.equalsIgnoreCase(name)) {
        System.out.println("Contact found: Name: "+current.name+" , Phone : "+current.phonNumber);
        return;
      }
      current=current.next;
    }
    
    System.out.println("Contact with name '"+name+"' not found.");
  }


  public void deleteContact(String name){
    
    // if list is empty
    if(head == null) {
      System.out.println("Contact with name '"+name+"' not found.");
      return;
    }

    ContactNode n = head;
    
    if(n.name == name) {
      System.out.println("Deleting contact: "+ n.name+ ", " + n.phonNumber);
      deleteFrontContact(); // delete it if it's in front
      return;
    }

    // keep traversing while we found the node that is 
    // previous our target node
    // or we reach the end means that name is not in our list
    // (if there are duplicate names the first will be removed)
    while(n != null && !n.next.name.equals(name)) { 
      n = n.next;
    }

    if(n.next != null && n.next.name.equals(name)) {

      System.out.println("Deleting contact: "+ n.next.name+ ", " + n.next.phonNumber);
      
      // delete if it's in the middle by changing pointers
      n.next = n.next.next;
    }else {
      System.out.println("Contact with name '"+name+"' not found.");
    }
  }
}