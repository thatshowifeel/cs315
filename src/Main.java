import java.io.Console;



public class Main {
	private static Console _co;

	public static void main(String[] args) {
		Database d = new Database();
		Provider p = new Provider("Octavius",123456,"345 anus avenue","Tuscaloosa","AL","35404");
		d.addProvider(p);
		Member m = new Member("Dillon",356661,"417 Prince Acres","Tuscaloosa","AL","35404");
		Member o = new Member("Matt",236544,"417 Prince Acres","Tuscaloosa","AL","35404");
		d.addMember(m);
		d.addMember(o);
		Member mem = d.getMember(o.getNumber());
//		System.out.println(mem.getName());
//		System.out.println(d.getProviders());
		_co = System.console();
		displayMainMenu();
		// open console to bin folder and run "java Main"
		// read the user's choice from command line
		String choice = _co.readLine();
		handleMainMenuChoice(choice);
	}
	
	public static void displayMainMenu() {
		System.out.println("Welcome to ChocAn!\nMenu:\n\t1) sign-in\n\tn) exit");
	}
	
	public static void handleMainMenuChoice(String choice) {
		switch(choice) {
		case "sign-in" :
			System.out.println("\tSigning in:\n\tMenu:\n\t\t1) member\n\t\t2) provider\n\t\t3) back");
			// read in sign-in sub option
			String signInChoice = _co.readLine();
			handleSigninChoice(signInChoice);
			break;
		case "exit" :
			// Print exit message
			System.out.println("Bye!");
			// end the program
			return;
		default :
			// The user did not input any of the options we listed
			System.out.println("Your choice was invalid. Please try again.");
			// Wait for the user to try again
			String choiceAttempt = _co.readLine();
			// Call this method recursively until a listed choice is input
			handleMainMenuChoice(choiceAttempt);
		}
	}
	
	public static void handleSigninChoice(String signInChoice) {
		switch(signInChoice) {
		case "member" :
			// handle member sign in
			System.out.println("\tSigning in member:\n\t\t Enter member number.");
			break;
		case "provider" :
			// handle provider sign in
			System.out.println("\tSigning in provider:\n\t\t Enter in provider number. ");
			break;
		case "back" :
			// return back to main menu
			displayMainMenu();
			break;
		}
		
		
		
	}

}
