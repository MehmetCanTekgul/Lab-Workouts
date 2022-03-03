import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) throws IOException {	
		Scanner reader = new Scanner(System.in); //Creates an object to read user input
		Random rand = new Random(); //Creates an object from Random class
		int number =rand.nextInt(100); //generates a number between 0 and 99
		
		
		System.out.println("Hi! I'm thinking of a number between 0 and 99.");
		System.out.print("Can you guess it: ");
		
		int guess = reader.nextInt(); //Read the user input
		int attempts=1;
		while(guess!=number && guess!=-1){

			System.out.println("Sorry");
			System.out.println("Type -1 to quit or guess another.");
			if (number<guess){
				System.out.println("Your number is Grater Than Mine.");
			}else{
				System.out.println("Your Number is Less Than Mine.");
			}guess= reader.nextInt();

			attempts++;

		}if (number==guess){
			System.out.println("Congratulations!!!!");
			System.out.println("You Won After "+ attempts+ " Attempts.");
		}

		
		
		reader.close(); //Close the resource before exiting
	}
	
	
}