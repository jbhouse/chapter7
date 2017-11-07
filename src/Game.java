
public class Game {

	int totalGuesses;
	private int correctGuess;
	
	Game(int correctGuess){
		this.correctGuess = correctGuess;
		this.totalGuesses = 0;
	}

	public int getTotalGuesses() {
		return totalGuesses;
	}

	public void setTotalGuesses(int totalGuesses) {
		this.totalGuesses = totalGuesses;
	}

	public int getCorrectGuess() {
		return correctGuess;
	}

	public void setCorrectGuess(int correctGuess) {
		this.correctGuess = correctGuess;
	}
	
	public void displayGameStats() {
		if (this.totalGuesses<=5) {
			System.out.println("You got it in just "+this.totalGuesses+" tries. Amazing!");
			System.out.println("You're incredible at this!.");
		} else if (this.totalGuesses<=10) {
			System.out.println("You got it in "+this.totalGuesses+" tries.");
			System.out.println("Not too bad! You've got some potential.");
		} else {
			System.out.println("It took you "+this.totalGuesses+" tries.");
			System.out.println("You could use some practice!");
		}
	}
	
	public boolean checkIfGuessIsCorrect(int userGuess) {
		this.totalGuesses++;
		if (this.correctGuess>userGuess) {
			if (this.correctGuess-10>userGuess) {
				System.out.println("Way too low! Guess again.");
			} else {
				System.out.println("Too low! Guess again.");
			}
		} else if (this.correctGuess<userGuess) {
			if (this.correctGuess<userGuess-10) {
				System.out.println("Way too high! Guess again.");
			} else {
				System.out.println("Too high! Guess again.");
			}
		} else {
			return true;
		}
		return false;
	}
	
}
