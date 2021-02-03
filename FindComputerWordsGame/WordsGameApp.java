// Created by Jose Carlos Kuzolitz Garcia - x20164840

/* This Code runs a Game called Find Computer Words Game. This Game has 2 players, which are presented 12 letters randomly selected.
Each player has to create words with the letter shown. And if this letter is mapped in the array, the playger score points*/

//JOptionPane and Utilities librarie importation
import javax.swing.JOptionPane;
import java.util.*;


// Class declaration
public class WordsGameApp{

	//Main method
	public static void main(String[] args){

		//Variables Declaration
		String playerGuess;
		int playAgain;
		int pointP1;
		int pointP2;
		int player;

		//Variable Initialisation
		pointP1 = 0;
		pointP2 = 0;

		//Objects Declaration (it connects this class to the WordsGame class
		WordsGame game;
		game = new WordsGame();

		//Input

		//Array with all the Letters of the Alphabet
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		//Declares Scanner - It kind of add a listener in order to get the input by the user through the keyboard
		Scanner sc = new Scanner(System.in);

		//Print the initial Display
		System.out.println("======================================================================================\n=                         Welcome to Find Computer Words Game                        =\n======================================================================================");
		System.out.println("\nRules: \n 12 Letters will be presented and each player has to guess words using them \n\nPoints: \n For each word correctly guessed starting by a vowel, the player gets 1 point \n For each word correctly guessed starting by a consonant, the player gets 3 points \n\n");
		System.out.println("======================================================================================\n\n");

		//Loop that runs the turns
		do{

			//Loop with runs for player 1 or 2 based on the variable i
			for(int i=1; i<=2 ; i++){

				player = i;

				//Chooses 12 letters from the "letters array" and display them
				//Print Player 1 or Player 2 (Depending whose turn it is
				System.out.println("\n\nPlayer "+i);
				System.out.println("Create a word with some of the letters listed below:\n");

					//Loop displays random letters
					for(int j=0; j<12; j++){
						char letter = letters[(int) (Math.random() * letters.length)];
						System.out.print(" "+letter+ " ");
					}


				//asks for a guess
				System.out.print("\n\n\nPlayer "+i+", try to guess a word: ");
				//reads the information that the user inserted and alocates it to the userGuess variable
				playerGuess = sc.next();

				//SET
				//Execute function on WordsGame giving PlayerGuess and Player as parametres
				game.setUserGuess(playerGuess);
				game.setPlayer(player);

				//Compiles Word set by player
				game.compileGame();

				//Outputs the points got by players
				//This clause executes getPointP1 or getPointP2 depending on the current player
				if(player == 1){

					pointP1 = game.getPointP1();

				}
				else{

					pointP2 = game.getPointP2();


				}


			}

		// Verifies of the player wants to start another turn
		System.out.println("\nWould you like to start a new turn? (1 - Yes or 2 - No)");
		playAgain = sc.nextInt();

		System.out.println("\n");

		//While user types 1, the game keeps running
		}while(playAgain == 1);

		//Outputs the Final Result
		System.out.println("FINAL RESULT:");
		System.out.println("-----------------------------------------------");
		System.out.println("\nPlayer 1: " +pointP1+ " points           Player 2: " +pointP2+ " points");
		System.out.println("\nThank you for playing with us!");

		//Close Scanner
		sc.close();

	}
}