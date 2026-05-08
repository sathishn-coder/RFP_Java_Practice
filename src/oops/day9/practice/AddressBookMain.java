package oops.day9.practice;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		 System.out.println(
	                "Welcome to Address Book Program");

	        Scanner sc = new Scanner(System.in);

	        AddressBook addressBook = new AddressBook();

	        int choice;

	        do {

	            System.out.println("\n===== Address Book Menu =====");

	            System.out.println("1. Add Contact");
	            System.out.println("2. Display Contacts");
	            System.out.println("3. Edit Contact");
	            System.out.println("4. Delete Contact");
	            System.out.println("5. Exit");

	            System.out.print("Enter Your Choice : ");

	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:

	                    addressBook.addContact();
	                    break;

	                case 2:

	                    addressBook.displayContacts();
	                    break;

	                case 3:

	                    System.out.print(
	                            "Enter First Name to Edit : ");

	                    String editName = sc.nextLine();

	                    addressBook.editContact(editName);

	                    break;

	                case 4:

	                    System.out.print(
	                            "Enter First Name to Delete : ");

	                    String deleteName = sc.nextLine();

	                    addressBook.deleteContact(deleteName);

	                    break;

	                case 5:

	                    System.out.println("Exiting Program");
	                    break;

	                default:

	                    System.out.println("Invalid Choice");
	            }

	        } while (choice != 5);
	    }

	

}
