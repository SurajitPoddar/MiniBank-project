import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter the 'Username': ");
			String username = scanner.nextLine();
			
			System.out.print("Enter the 'Password': ");
			String password = scanner.nextLine();
			
			if("Admin".equals(username) && "admin@123".equals(password)) {
				System.out.println("User is successfully logged in.");
				
				InnterestOption obj = new InnterestOption();		
				obj.InnterstOption();						// Calling InnterstOption.java
				}	else {
				System.out.println("Invalid Username and/or Password.");
			}
		}

	}
}