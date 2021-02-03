public class CountsVowels{

	//Variable Declaration
	private String word;
	private int totVowel;
	private String output;
	private StringBuffer strBuff;

	//Constructor
	public CountsVowels(){
		strBuff = new StringBuffer();
	}

	//Set
	public void setWord(String word){
		this.word=word;
	}

	//Compute
	public void calcVowels(){
		//Compute all the Vowels
		//Populates the variable totVowel with the total length
		totVowel = word.length();

		//Loop to count the length of the word
		for(int i=0; i>=word.length();i++){

			//Condition adds the vowel to the strBuffer
			if(word.charAt(i) != 'a' && word.charAt(i) != 'e'){
				strBuff.append(word.charAt(i));
			}

		}
		output = strBuff.toString();

	}

	//Get
	public int getTotVowels(){
		return totVowel;
	}

	public String getVowels(){
		return output;
	}
}