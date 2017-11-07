import java.util.Scanner;

public class GuessingApp {

	public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Number Game");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println();
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	System.out.println("I'm thinking of a number between 1 and 100.");
        	System.out.println("Try to guess it.");
        	System.out.println();
        	
        	Game newGame = new Game((int) (Math.random() * 100) + 1);
//        	we just keep prompting them for a new guess, and checking if it is correct, until they eventually guess correctly
        	while (!newGame.checkIfGuessIsCorrect(Console.getInt("Enter number: ", 1, 100))) {
			}
        	newGame.displayGameStats();
        	
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Bye - Come back soon!");
	}

}
