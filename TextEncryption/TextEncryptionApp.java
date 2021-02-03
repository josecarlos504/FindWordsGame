//Import the JOptionPane library
import javax.swing.JOptionPane;

public class TextEncryptionApp{

	public static void main(String[] args){

	//Variables Declaration
	String inpText;
	String outText;

	//Object Declaration (It technically connects this code to the instantiable class TextEncryption.java)
	TextEncryption text;
	text = new TextEncryption();

	//Input (Display a frame asking the user to enter with a sentence) and populates the variable "inpText" with the input data
	inpText = JOptionPane.showInputDialog(null, "Enter a phrase to be encrypted");

	//Set Method (Sends data to the instantiable class
	text.setInpText(inpText);

	//Compute Method (execute the Compute Method of the Instantiable Class)
	text.encriptText();

	//Get Method (Takes the return information from the Instantiable class) and gets the result to the Variable "outText";
	outText = text.getOutText();


	//Output (Shows the encrypted phrase to the user
	JOptionPane.showMessageDialog(null, outText);

	}
}