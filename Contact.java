/*
 * Bryan Pirrone
 * Professor Jacks
 * CS-320
 * 11/10/2023
 */


package Contact;

public class Contact {

    private String contactID;   //cannot be gt 10 chars
    private String firstName;   //cannot be gt 10 chars
    private String lastName;    //cannot be gt 10 chars
    private String phoneNumber; //must be 10 chars
    private String address;     //cannot be gt 30 chars
    
    //no null or empty strings

    //Constructor

    public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {

        if(contactID == null || contactID.isEmpty() || contactID.length() > 10 || firstName == null || firstName.isEmpty() || firstName.length() > 10 || lastName == null || lastName.isEmpty() || lastName.length() > 10 || phoneNumber == null || phoneNumber.length() != 10 || address == null || address.isEmpty() || address.length() > 30) {
            throw new IllegalArgumentException("Invalid input");
        }
        
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    //Setters

    public String getContactID() {
        return contactID;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public String getaddress() {
        return address;
    }

    //Getters

    public void setfirstName(String firstName){
        if(firstName == null || firstName.isEmpty() || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.firstName = firstName;
    }

    public void setlastName(String lastName){
        if(lastName == null || lastName.isEmpty() || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.lastName = lastName;
    }

    public void setphoneNumber(String phoneNumber){
        if(phoneNumber == null || phoneNumber.length() != 10) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.phoneNumber = phoneNumber;
    }

    public void setaddress(String address){
        if(address == null || address.isEmpty() || address.length() > 30) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.address = address;
    }
}
