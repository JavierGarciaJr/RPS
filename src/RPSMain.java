import java.util.Random;
import java.util.Scanner;
/**
 * This program is a rock paper scissors game that tallies the wins, losses and ties.
 * @author Javier Garcia
 *
 */
public class RPSMain {
	Random r = new Random();
	/**
	 * main method of the program that calls play
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		play(s);
	}
	/**
	 * plays rock paper scissors with the program and tallies wins losses and ties
	 * @param s
	 */
	public static void play(Scanner s) {
		Random r = new Random();
		int win = 0;//initialized value
		int lose = 0;//initialized value
		int tie = 0;//initialized value
		int games = 0;//initialized value
		String stop = "";//initialized value
		RPSHelper.Description();
		do {
		String rand = RPSHelper.RandNum(r);
		String answer2 = "Computer selected: " + rand;//gets computer input
		String either = RPSHelper.Choice(s);
		String answer = "You selected: " + either;//gets your input
		if(!either.contentEquals("STOP")) {//plays only if either is not stop
		System.out.println(answer);//outputs your input
		System.out.println(answer2);//outputs computers answer
		
		if(either.contentEquals("ROCK") && rand.contentEquals("rock")) {//determines winner, loser, or tie
			System.out.println();
			System.out.println("This is a tie");
			tie++;
		}
		if(either.contentEquals("ROCK") && rand.contentEquals("paper")) {//determines winner, loser, or tie
			lose++;
			System.out.println();
			System.out.println("Oh No, you lost");
		}
		if(either.contentEquals("ROCK") && rand.contentEquals("scissors")) {//determines winner, loser, or tie
			win++;
			System.out.println();
			System.out.println("Hurray!! you won.");
		}
		if(either.contentEquals("PAPER") && rand.contentEquals("rock")) {//determines winner, loser, or tie
			win++;
			System.out.println();
			System.out.println("Hurray!! you won.");
		}
		if(either.contentEquals("PAPER") && rand.contentEquals("paper")) {//determines winner, loser, or tie
			tie++;
			System.out.println();
			System.out.println("This is a tie");
		}
		if(either.contentEquals("PAPER")&& rand.contentEquals("scissors")) {//determines winner, loser, or tie
			lose++;
			System.out.println();
			System.out.println("Oh No, you lost");
		}
		if(either.contentEquals("SCISSORS") && rand.contentEquals("rock")) {//determines winner, loser, or tie
			lose++;
			System.out.println();
			System.out.println("Oh No, you lost");
		}
		if(either.contentEquals("SCISSORS") && rand.contentEquals("paper")) {//determines winner, loser, or tie
			win++;
			System.out.println();
			System.out.println("Hurray!! you won.");
		}
		if(either.contentEquals("SCISSORS") && rand.contentEquals("scissors")) {//determines winner, loser, or tie
			tie++;
			System.out.println();
			System.out.println("This is a tie");
			
		}
		games++;
		}
		if(either.contentEquals("STOP")) {//plays stop menu
			System.out.println("-------------------------------------");
			System.out.println("Times played: " + games);
			System.out.println("Wins:         " + win);
			System.out.println("Losses:       " + lose);
			System.out.println("Ties:         " + tie);
			if(win > lose) {//says if user won, lost, or tied against the computer over all
				System.out.println("Congratulations! You won.");
			}
			if(lose > win) {//says if user won, lost, or tied against the computer over all
				System.out.println("Sorry computer won this time. Try again");
			}
			if(win == lose) {//says if user won, lost, or tied against the computer over all
				System.out.println("This game is a tie");
			}
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.print("Do you want to play again? ");//asks the user if the still want to continue
			stop = s.nextLine();
		}
		
	
	}while(!stop.equalsIgnoreCase("no"));
	}
}
