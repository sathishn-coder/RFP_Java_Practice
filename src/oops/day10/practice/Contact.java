package oops.day10.practice;

public class Contact {
	public String fname;
	public String lname;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phone_number;
	public String email;
	public Contact(String fname, String lname, String address, String city, String state, String zip,
			String phone_number, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone_number = phone_number;
		this.email = email;
	}
	
	public void displayContact() {

        System.out.println("--------------------------------");

        System.out.println("First Name : " + fname);
        System.out.println("Last Name  : " + lname);
        System.out.println("Address    : " + address);
        System.out.println("City       : " + city);
        System.out.println("State      : " + state);
        System.out.println("Zip        : " + zip);
        System.out.println("Phone No   : " + phone_number);
        System.out.println("Email      : " + email);
    }

}
