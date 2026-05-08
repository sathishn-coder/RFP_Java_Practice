package oops.day10.practice;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println(
                "Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

        // Dictionary of Address Books
        HashMap<String, AddressBook> addressBookMap =
                new HashMap<>();

        int choice;

        do {

            System.out.println("\n===== MENU =====");

            System.out.println("1. Add Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Add Address Book
                case 1:

                    System.out.print(
                            "Enter Address Book Name : ");

                    String bookName = sc.nextLine();

                    if (addressBookMap.containsKey(bookName)) {

                        System.out.println(
                                "Address Book Already Exists");

                    } else {

                        addressBookMap.put(
                                bookName,
                                new AddressBook());

                        System.out.println(
                                "Address Book Created Successfully");
                    }

                    break;

                // Add Contact
                case 2:

                    System.out.print(
                            "Enter Address Book Name : ");

                    bookName = sc.nextLine();

                    AddressBook addBook =
                            addressBookMap.get(bookName);

                    if (addBook != null) {

                        addBook.addContact();

                    } else {

                        System.out.println(
                                "Address Book Not Found");
                    }

                    break;

                // Display Contacts
                case 3:

                    System.out.print(
                            "Enter Address Book Name : ");

                    bookName = sc.nextLine();

                    AddressBook displayBook =
                            addressBookMap.get(bookName);

                    if (displayBook != null) {

                        displayBook.displayContacts();

                    } else {

                        System.out.println(
                                "Address Book Not Found");
                    }

                    break;

                // Edit Contact
                case 4:

                    System.out.print(
                            "Enter Address Book Name : ");

                    bookName = sc.nextLine();

                    AddressBook editBook =
                            addressBookMap.get(bookName);

                    if (editBook != null) {

                        System.out.print(
                                "Enter First Name to Edit : ");

                        String editName =
                                sc.nextLine();

                        editBook.editContact(editName);

                    } else {

                        System.out.println(
                                "Address Book Not Found");
                    }

                    break;

                // Delete Contact
                case 5:

                    System.out.print(
                            "Enter Address Book Name : ");

                    bookName = sc.nextLine();

                    AddressBook deleteBook =
                            addressBookMap.get(bookName);

                    if (deleteBook != null) {

                        System.out.print(
                                "Enter First Name to Delete : ");

                        String deleteName =
                                sc.nextLine();

                        deleteBook.deleteContact(deleteName);

                    } else {

                        System.out.println(
                                "Address Book Not Found");
                    }

                    break;

                case 6:

                    System.out.println(
                            "Exiting Program");
                    break;

                default:

                    System.out.println(
                            "Invalid Choice");
            }

        } while (choice != 6);

	}

}
