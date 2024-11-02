public class PhoneList {

    private ContactNode head; // reference to the head
    private void deleteFrontContact(){
        head = head.next;
    }
    private void deleteBackContact(){
        ContactNode n = head;
        while(n.next != null){
            n = n.next;
        }
        n.next = null;
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
        ContactNode n = head;

        if(n.name == name){
            deleteFrontContact(); // delete it if it's in front
            return;
        }
        while(n.next.name != name){ // looping
            n = n.next;
        }

        if(n.name == null){
            deleteBackContact(); // delete it if it's in the end
            return;
        }
        n.next = n.next.next;

    }
}
