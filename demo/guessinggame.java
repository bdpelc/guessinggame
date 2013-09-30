	package lab1;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variable to store number of guesses
		int guesses = 0;
		// Random Number Generator
		int random = 0;
		Random rg = new Random();
		random = rg.nextInt(10);
		// Scanner for user input
		Scanner input = new Scanner(System.in);
		// Read user input
		System.out.println("what is the random number?");
		int user = input.nextInt();
		guesses ++;
		// Compare user input to the random number
		while(user!=random){
			if (user > random){
				System.out.println("Too Hight! Try Again");
				int user = input.nextInt();
				guesses ++;
			}
			else if (user < random){
				System.out.println("Too Low! Try Again");
				int user = input.nextInt();
				guesses ++;
			}
		}
		System.out.println("You Got It!  Number of guesses: "+guesses);
		
	} // End Main

} // End Guessing Game
