// Created by Jose Carlos Kuzolitz Garcia - x20164840


/* This Code runs a Game called Find Computer Words Game. This Game has 2 players, which are presented 12 letters randomly selected.
Each player has to create words with the letter shown. And if this letter is mapped in the array, the playger score points*/

//JOptionPane and Utilities librarie importation
import javax.swing.JOptionPane;
import java.util.*;

// Class declaration
public class WordsGame{

	//Variables Declaration
	private String playerGuess;
	private int playAgain;
	private int pointP1;
	private int pointP2;
	private int player;
	private char checkWord;

	//Array which has all the valid words
	String[] validWords = {"algorithm","application","backup","bit","buffer","bandwidth","broadband","bug","binary","browser","bus","cache","command","computer","cookie","compiler","cyberspace","compress","configure","database","digital","data","debug","desktop","disk","domain","decompress","development","download","dynamic","email","encryption","firewall","flowchart","file","folder","graphics","hyperlink","host","hardware","icon","inbox","internet","kernel","keyword","keyboard","laptop","login","logic","malware","motherboard","mouse","mainframe","memory","monitor","multimedia","network","node","offline","online","path","process","protocol","password","phishing","platform","program","portal","privacy","programmer","queue","resolution","root","restore","router","reboot","runtime","screen","security","shell","snapshot","spam","screenshot","server","script","software","spreadsheet","storage","syntax","table","template","thread","terminal","username","virtual","virus","web","website","window","wireless"};


	//Set (Setting the conection between all variables between the App Class and the Instatiable one
	public void setUserGuess(String playerGuess){
		this.playerGuess = playerGuess;
	}

	public void setPlayer (int player){
		this.player = player;
	}

	public void setPlayAgain(int playAgain){
		this.playAgain = playAgain;
	}



	//Compute
	public void compileGame(){

		//Verifies if it is the Player 1 or 2
		if(player == 1){

			//Loop runs for Player 1
			//Verifies whether the word exists in the "validWords" array or not
			for(int i=0; i < validWords.length; i++){

				if( playerGuess.equals(validWords[i])){

					//Checks whether the first letter is a vowel or consonant to give points
					checkWord = playerGuess.charAt(0);

						// If the 1st letter is a vowel, player gets 1 point
						if(checkWord == 'a' || checkWord == 'e' || checkWord == 'i' || checkWord == 'o' || checkWord == 'u' ||
						   checkWord == 'A' || checkWord == 'E' || checkWord == 'I' || checkWord == 'O' || checkWord == 'U' ){

								//Displays the output
								System.out.println("You have got 3 points");
								//Adds 3 points to the variable "pointP1"
								pointP1 = pointP1 + 3;

						}
						//If the 1st letter is a consonant, player get 3 points
						else{
								//Displays the output
								System.out.println("You have got 1 point");
								//Adds 1 point to the variable "pointP1"
								pointP1 = pointP1 + 1;
						}
				}
			}
		}
		else{
				//Loop runs for Player 2
				//Verifies whether the word exists in the "validWords" array or not
				for(int i=0; i < validWords.length; i++){

					if( playerGuess.equals(validWords[i])){

						//Checks whether the first letter is a vowel or consonant to give points
						checkWord = playerGuess.charAt(0);

							// If the 1st letter is a vowel, player gets 1 point
							if(checkWord == 'a' || checkWord == 'e' || checkWord == 'i' || checkWord == 'o' || checkWord == 'u' ||
							   checkWord == 'A' || checkWord == 'E' || checkWord == 'I' || checkWord == 'O' || checkWord == 'U' ){

									//Displays output
									System.out.println("You have got 3 points");
									//Add 3 points to the variable "pointP2"
									pointP2 = pointP2 + 3;

							}
							//If the 1st letter is a consonant, player get 3 points
							else{
									//Displays output
									System.out.println("You have got 1 point");
									//Add 1 point to the variable "pointP2"
									pointP2 = pointP2 + 1;
							}
					}
				}

		}
	}



	//GET Returns the Points from the compute and return it to the App Class
	public int getPointP1(){
		return pointP1;
	}

	public int getPointP2(){
		return pointP2;
	}

}