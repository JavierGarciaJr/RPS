import java.util.Random;
import java.util.Scanner;

public class RPSHelper {
	/**
	 * description of game
	 */
	public static void Description() {
		System.out.println("Using this app you can play Rock-Paper-Scissors game against the");
		System.out.println("computer. When played between two people, each person picks one of ");
		System.out.println("the three options at the same time, and the winner is determined. The ");
		System.out.println("program should randomly choose one of the three options, then prompt");
		System.out.println("for the user’s selection. At that point, the program reveals both");
		System.out.println("choices and print a statement indicating if the user won, the ");
		System.out.println("computer won, or if it was a tie. Continue playing until the user ");
		System.out.println("choose to stop. Then print the total number of the games played,");
		System.out.println("total w"
				+ "ins, total losses, and total ties.");
	}
	/**
	 * randomly gets number and assigns it to rock paper or scissors
	 * @param r
	 * @return
	 */
	public static String RandNum(Random r){
		int rando = r.nextInt(3);
		switch (rando) {//assign random numbers 0-2 to rock, paper or scissors
		case 0:
			return "rock";
		case 1:
			return "paper";
		case 2:
			return "scissors";
			default:
				return null;
		}
	}
	/**
	 * gets the users choice of rock paper or scissors
	 * @param s
	 * @return
	 */
	public static String Choice(Scanner s) {//gets input for rock, paper or scissors
		
		
		System.out.println();
		System.out.println("Ready, Set, Go");
		System.out.println();
		
		
		System.out.println("your choices");
		System.out.println("Rock");
		System.out.println("Paper");
		System.out.println("Scissors");
		System.out.println("stop");
		System.out.print("Enter your choice: ");
		String either = s.nextLine();
		while ( !either.equalsIgnoreCase("Rock") && !either.equalsIgnoreCase("Paper") && !either.equalsIgnoreCase("Scissors")&& !either.equalsIgnoreCase("stop")) {
			System.out.println("your choices");
			System.out.println("Rock");
			System.out.println("Paper");
			System.out.println("Scissors");
			System.out.println("stop");
			System.out.print("Enter your choice: ");
			either = s.nextLine();
			
		}
	either = either.toUpperCase();
		
		return either;
	}
	
}
