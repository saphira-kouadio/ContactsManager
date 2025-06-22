public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.name = "Alice";
        contact1.phoneNumber = "0611223344";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Bob";
        contact2.phoneNumber = "0622334455";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Charlie";
        contact3.phoneNumber = "0633445566";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "Diana";
        contact4.phoneNumber = "0644556677";
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.name = "Eve";
        contact5.phoneNumber = "0655667788";
        myContactsManager.addContact(contact5);

        Contact result = myContactsManager.searchContact("Charlie");

        if (result != null) {
            System.out.println("Numéro de Charlie : " + result.phoneNumber);
        } else {
            System.out.println("Contact introuvable !");
        }
    }
}