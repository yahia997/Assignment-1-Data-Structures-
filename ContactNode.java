public class ContactNode {
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
