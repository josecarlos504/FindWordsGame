public class TextEncryption{

	//Variables Declaration (Private because just this class will have access to them)
	private String inpText;
	private String outText;
	private StringBuffer strBuff;
	private int textLength;

	//Constructor Declaration
	public TextEncryption(){
		strBuff = new StringBuffer();
	}

	//Set Methods
	public void setInpText(String inpText){
		this.inpText=inpText;
	}

	//Compute
	public void encriptText(){

		//Populate the Variable "textLength" with the Length of the sentence entered
		textLength = inpText.length();

		//This Loop goes throughout all characteres
		for (int i=0; i<textLength;i++){

			//This condition sends to the StringBuffer a "." if it finds one
			if(inpText.charAt(i) == '.'){
				strBuff.append(".");
			}
			//Should the char is a vowel. This condition sends to the StringBuffer the char entered itself followed with a plus sign "+"
			else if(inpText.charAt(i) == 'a' || inpText.charAt(i) == 'e' || inpText.charAt(i) == 'i' || inpText.charAt(i) == 'o' || inpText.charAt(i) == 'u' || inpText.charAt(i) == 'A' || inpText.charAt(i) == 'E' || inpText.charAt(i) == 'I' || inpText.charAt(i) == 'O' || inpText.charAt(i) == 'U'){
				strBuff.append(inpText.charAt(i) +"+");
			}
			//Should the char is a space ' '. This condition sends to the StringBuffer the signs "##"
			else if(inpText.charAt(i) == ' ' ){
				strBuff.append("##");
			}
			//Should the char is NOT a vowel. This condition sends to the StringBuffer the '$' sign followed by the char itself
			else if(inpText.charAt(i) != 'a' && inpText.charAt(i) != 'e' && inpText.charAt(i) != 'i' && inpText.charAt(i) != 'o' && inpText.charAt(i) != 'u' && inpText.charAt(i) != 'A' && inpText.charAt(i) != 'E' && inpText.charAt(i) != 'I' && inpText.charAt(i) != 'O' && inpText.charAt(i) != 'U'){
				strBuff.append("$"+ inpText.charAt(i));
			}

		}
	//Becomes the content of the StringBuffer a String
	outText = strBuff.toString();

	}

	//Get Method
	public String getOutText(){
		return outText;
	}


}