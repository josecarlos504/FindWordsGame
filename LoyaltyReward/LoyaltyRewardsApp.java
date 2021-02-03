// Created by Jose Carlos Kuzolitz Garcia - x20164840

//JOptionPane and Utilities librarie importation
import javax.swing.JOptionPane;
import java.util.*;


// Class declaration
public class WordsGameApp{

	//Main method
	public static void main(String[] args){

		//Public Variables declaration
		String cardStatus;
		int numFlights;
		Double milesEarned;
		Double ticketPrice;
		int dialConfirm;


		//Objects Declaration (it connects this class to the LoyaltyRewards class
		LoyaltyRewards reward;
		reward = new LoyaltyRewards();

		//Input


		/* While loop to ask repeatedly whether the input isn't found */
		do{

		/* Display the Input Dialog
		   Gets the Loyalty Card Status from user
		   Populates the variable "cardStatus" with the input information */
		cardStatus = JOptionPane.showInputDialog(null, "Enter your Loyalty Card Status, please");

			//Check if the input was set correctly
			if(cardStatus.equalsIgnoreCase("bronze") || cardStatus.equalsIgnoreCase("silver") || cardStatus.equalsIgnoreCase("gold")){
				break;
			}
			else{

				//Should the Card Loyalty hasn't been found. It ssks user whether he/she wants to keep trying or not
				dialConfirm = JOptionPane.showConfirmDialog(null, "Sorry, Card Loyalty Status not found! Would you like to try again?");

				//Condition that closes system in case user chooses to not proceed
				if(dialConfirm != 0){
					System.exit(0);
				}

			}

		}while(dialConfirm == 0);

		/* Gets the quantity of flights user has flown related to the current year
		   Parses the information into Integer
		   Populates the variable "numFlights" with the input information */
		numFlights = Integer.parseInt(JOptionPane.showInputDialog(null, "How many flights have you flown this year?"));

		/* Gets the price paid
		   Parses the information into Integer
		   Populates the variable "ticketPrice" with the input information */

		ticketPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the ticket price, please?"));

		//Set (Send input over to the LoyaltyRewards.java Class
		reward.setCardStatus(cardStatus);
		reward.setNumFlights(numFlights);
		reward.setTicketPrice(ticketPrice);

		//Requests the LoyaltyRewards Class to process the input data by the user
		reward.compEarnedMiles();

		//Gets the data processed by the LoyaltyRewards Class
		milesEarned = reward.getMilesEarned();

		//Outputs information to user
		JOptionPane.showMessageDialog(null, "Congratulations. You've earned " +milesEarned+ " Miles to use!");

	}
}