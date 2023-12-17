/*
 * Bryan Pirrone
 * Professor Jacks
 * CS-320
 * 11/10/2023
 */


package Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    int i = 0;

    //array to hold objects
    public static List<Contact> contactList = new ArrayList<Contact>();

    //add contact

    public void addContact(String firstName, String lastName, String phoneNumber, String address) {

        String stringID = Integer.toString(i);
        Contact newContact = new Contact(stringID, firstName, lastName, phoneNumber, address);
        contactList.add(newContact);
        ++i;
    }

    //delete contact

    public void deleteContact(String contactID){
        for (Contact contact : contactList) {
            if (contact.getContactID().equals(contactID)) {
                contactList.remove(contact);
            }
        }
    }

    //edit first name

    public void editFirstName(String contactID, String firstName) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactID().equals(contactID)) {
                contactList.get(i).setfirstName(firstName);
                break;
            }
            if (i == contactList.size() - 1){
                System.out.println("Contact not found");
            }
        }
    }

    //edist last name

    public void editLastName(String contactID, String lastName) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactID().equals(contactID)) {
                contactList.get(i).setlastName(lastName);
                break;
            }
            if (i == contactList.size() - 1){
                System.out.println("Contact not found");
            }
        }
    }

    //edit phone number

    public void editPhoneNumber(String contactID, String phoneNumber) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactID().equals(contactID)) {
                contactList.get(i).setphoneNumber(phoneNumber);
                break;
            }
            if (i == contactList.size() - 1){
                System.out.println("Contact not found");
            }
        }
    }

    //edit address

    public void editAddress(String contactID, String address) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactID().equals(contactID)) {
                contactList.get(i).setaddress(address);
                break;
            }
            if (i == contactList.size() - 1){
                System.out.println("Contact not found");
            }
        }
    }


    
}




