import java.util.Scanner;

public class Contacts {

	private String FirstName;
	private String LastName;
	private String Email;
	private String Phone;
//	I added the below two integers on a whim to simulate an ID field in a database, 
//	as well as illustrate the difference between static and instance methods
	private int id;
	private static int ID = 1;
	
	Contacts(String firstName, String lastName, String email, String phone){
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Email = email;
		this.Phone = phone;
		this.id = ID;
		ID++;
	}
	
	Contacts(){
		this.id = ID;
		ID++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public static void main(String[] args) {
		
        System.out.println("Welcome to the Contact List App\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
        	Contacts newContact = new Contacts();
        	System.out.print("Enter first name: ");
        	newContact.setFirstName(sc.next());
        	System.out.print("Enter last name: ");
        	newContact.setLastName(sc.next());
        	System.out.print("Enter email: ");
        	newContact.setEmail(sc.next());
        	System.out.print("Enter phone number (XXX-XXX-XXXX): ");
        	newContact.setPhone(sc.next());
        	System.out.println("---------------------------------------------------");
        	System.out.println("--------- Current Contact -------------------------");
        	System.out.println("---------------------------------------------------");
        	System.out.println("Name: \t \t"+newContact.getFirstName()+" "+newContact.getLastName());
        	System.out.println("Email Address: \t"+newContact.getEmail());
        	System.out.println("Phone Number: \t"+newContact.getPhone());
        	System.out.println("User ID: \t \t"+newContact.getId());
        	System.out.println("---------------------------------------------------");
        	System.out.println();
        	
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            sc.nextLine();
            System.out.println();
        }
        sc.close();
	}

}