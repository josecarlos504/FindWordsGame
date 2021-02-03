public class CountsLetters{

	// Variables Declaration
	private String word;
	private int totLetter;
	private StringBuffer strBuff;

	//Constructor
	public CountsLetters(){
		strBuff = new StringBuffer();
	}

	//Set
	public void setWord(String word){
		this.word=word;
	}

	//Compute
	public void calcTotLetters(){
		//Counts how many letters the input word has and populates the variable "totLetter" with the value
		totLetter = word.length();
	}

	//get
	public int getTotLetters(){
		return totLetter;
	}
}