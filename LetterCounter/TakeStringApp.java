//import JOptionPane library
import javax.swing.JOptionPane;

//Class Declaration
public class TakeStringApp{

	//Main Class
	public static void main(String[] args){

		//Variables Declaration
		String word;
		int totLetter;
		int totVowel;
		String output;

		//Object Declaration
		CountsLetters countLetter;
		countLetter = new CountsLetters();

		CountsVowels vowel;
		vowel = new CountsVowels();

		//Input via JOptionPane
		word = JOptionPane.showInputDialog(null, "Enter a word, please");

		//Set
		countLetter.setWord(word);
		vowel.setWord(word);


		//Compute
		countLetter.calcTotLetters();
		vowel.calcVowels();

		//Get
		totLetter = countLetter.getTotLetters();
		totVowel = vowel.getTotVowels();
		output = vowel.getVowels();

		//Output
		JOptionPane.showMessageDialog(null, "The word entered has " +totLetter+ " letters. And it also has " +totVowel+ " vowels" +output);

	}

}