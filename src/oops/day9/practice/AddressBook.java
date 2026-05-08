package oops.day9.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	ArrayList<Contact> contacts = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // Add Contact
    public void addContact() {

        System.out.println("\nEnter Contact Details");

        System.out.print("First Name : ");
        String firstName = sc.nextLine();

        System.out.print("Last Name : ");
        String lastName = sc.nextLine();

        System.out.print("Address : ");
        String address = sc.nextLine();

        System.out.print("City : ");
        String city = sc.nextLine();

        System.out.print("State : ");
        String state = sc.nextLine();

        System.out.print("Zip : ");
        String zip = sc.nextLine();

        System.out.print("Phone Number : ");
        String phone = sc.nextLine();

        System.out.print("Email : ");
        String email = sc.nextLine();

        // Create Object
        Contact contact = new Contact(
                firstName, lastName,
                address, city, state,
                zip, phone, email);

        // Add to Collection
        contacts.add(contact);

        System.out.println("Contact Added Successfully");
    }

    // Display Contacts
    public void displayContacts() {

        if (contacts.isEmpty()) {

            System.out.println("No Contacts Available");
            return;
        }

        for (Contact contact : contacts) {

            contact.displayContact();
        }
    }

    // Edit Contact
    public void editContact(String name) {

        for (Contact contact : contacts) {

            if (contact.fname.equalsIgnoreCase(name)) {

                System.out.println("Editing Contact");

                System.out.print("New Address : ");
                contact.address = sc.nextLine();

                System.out.print("New City : ");
                contact.city = sc.nextLine();

                System.out.print("New State : ");
                contact.state = sc.nextLine();

                System.out.print("New Zip : ");
                contact.zip = sc.nextLine();

                System.out.print("New Phone Number : ");
                contact.phone_number = sc.nextLine();

                System.out.print("New Email : ");
                contact.email = sc.nextLine();

                System.out.println("Contact Updated Successfully");

                return;
            }
        }

        System.out.println("Contact Not Found");
    }

    // Delete Contact
    public void deleteContact(String name) {

        Contact deleteContact = null;

        for (Contact contact : contacts) {

            if (contact.fname.equalsIgnoreCase(name)) {

                deleteContact = contact;
                break;
            }
        }

        if (deleteContact != null) {

            contacts.remove(deleteContact);

            System.out.println("Contact Deleted Successfully");

        } else {

            System.out.println("Contact Not Found");
        }
    }

}
