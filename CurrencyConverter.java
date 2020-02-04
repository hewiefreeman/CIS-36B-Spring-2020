import java.util.Scanner;

public class CurrencyConverter {

	private double  rate; // Canversion rate
	private String  type; // Conversion rate type name
	private Scanner scanner;
	
	private static void main(String[] params) {
		scanner = new Scanner(System.in);
		System.out.println(" ---  USD Currency Converter  ---");
		runMenu();
	}

	private static void runMenu() {
		int option = 0;

		while (option != 4) {
			System.out.print(
			"\n\n=====================================\n" +
			"=             Main Menu             =\n" +
			"=  1) To Yen                        =\n" +
			"=  2) To Euro                       =\n" +
			"=  3) To Peso                       =\n" +
			"=  4) Exit Program                  =\n" +
			"=====================================\n" +
			"Type a number value (1 to 4): ");

			// Get input...
			try {
				option = scanner.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}

			// Read choice...
			switch (option) {
				case 1:
					// Yen
					rate = 108.67;
					type = "Yen";
					break;

				case 2:
					// Euro
					rate = 0.90;
					type = "Euro";
					break;

				case 3:
					// Peso
					rate = 18.80;
					type = "Peso";
					break;

				case 4:
					// Exit
					System.out.println("\nExiting...");
					return;

				default:
					System.out.println("\nWrong option! Please select a number between 1 and 4...");
					continue;
			}
			// If convertMenu failed, scanner threw an exception. Exit
			if !convertMenu() {
				return;
			}
		}
	}

	private static boolean convertMenu() {
		String option = "";

		// Loop until user types "Exit" or "exit"
		while (true) {
			System.out.print(
				"\n\n ---  Convert to " + type + "  ---\n" + 
				"Enter USD amount (or 'Exit' to go back): $");

			// Get input...
			try {
				option = scanner.next();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}

			if (option == "Exit" || option == "exit") {
				System.out.println("\nReturning to Main Menu...");
				return true;
			}

			// Get dollar amount
			double dollars = 0;
			try {
				dollars = Double.parseDouble(option);
			} catch (NumberFormatException | NullPointerException e) {
				System.out.println("\nInvalid amount...");
				continue;
			}
			
			System.out.println("\n Amount in " + type + ": " + dollars);
		}
		return true;
	}
}