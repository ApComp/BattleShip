/* This class makes an easy, one-line method of getting command line input */
package pack;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInput {

	public static String getStringInput(String message) {

		System.out.print(message);
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		//scn.close();
		return input;

	}

	public static double getDoubleInput(String message) {

		Scanner scn = new Scanner(System.in);
		boolean validEntry = false;
		double input = 0;
		do {
			System.out.print(message);
			try {
				input = scn.nextDouble();
				validEntry = true;	
			}
			catch (InputMismatchException e) {
				System.out.println("\nNot a valid number, please try again.");
				continue;
			}
		} while (validEntry == false);

		return input;

	}

	public static boolean getBooleanInput(String message) {

		Scanner scn = new Scanner(System.in);
		boolean input = false;
		System.out.print(message);
		String s_in = scn.nextLine();
		if (s_in.equals("Y") || s_in.equals("y") || s_in.equals("yes") || s_in.equals("YES") || s_in.equals("Yes")) {

			input = true;
		}
		return input;

	}
}
