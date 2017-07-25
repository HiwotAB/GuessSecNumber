import java.util.Scanner;
import java.util.Random;
public class GuessNumSec {

	public static void main(String[] args) {
		Random r = new Random();		
		int guess;
		
		int numberHold=1 + r.nextInt(100);
		System.out.print("Guess a secret number: ");
		System.out.print(numberHold);
		while(numberHold<=100){
			Scanner scan =new Scanner(System.in);
			guess=scan.nextInt();
		if(guess==numberHold){
			System.out.print("Your Guess Correct");	
		}
		else if(guess>numberHold){			
			System.out.print("Your Guess is too high , try again? (Y/N)");
		}
		else if(guess<numberHold){
			System.out.print("Your Guess is too low , try again? (Y/N)");
			
			
		}
		
		}
	}

}


