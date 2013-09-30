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

		// Random Number Generator
		int random = 0;
		Random rg = new Random();
		random = rg.nextInt(10);
		// Scanner for user input
		Scanner input = new Scanner(System.in);
		// Read user input
		System.out.println("what is the random number?");
		int user = input.nextInt();
		// Compare user input to the random number
		if (user > random)
			System.out.println("Too Hight!");
		else if (user < random)
			System.out.println("Too Low!");
		else
			System.out.println("You Got It!");
		
	} // End Main

} // End Guessing Game
