// Created by Jose Carlos Kuzolitz Garcia - x20164840

// JOptionPane libray import
import javax.swing.JOptionPane;

// Class declaration
public class LoyaltyRewards{

	//Private Variables declaration (Just this class has access to them)
	private String cardStatus;
	private int numFlights;
	private Double milesEarned;
	private Double ticketPrice;
	private String unknownCard;
	private LoyaltyRewards reward;


	//Set (Setting the conection between all variables between the App Class and the Instatiable one
	public void setCardStatus(String cardStatus){
		this.cardStatus = cardStatus;
	}

	public void setNumFlights(int numFlights){
		this.numFlights = numFlights;
	}

	public void setTicketPrice(Double ticketPrice){
		this.ticketPrice = ticketPrice;
	}

	//Compute
	public void compEarnedMiles(){

		/*Conditions based on the user input
		  They check the Strings without being Case Sensitive */
		if(cardStatus.equalsIgnoreCase("bronze")){
			if(numFlights >= 1 && numFlights <= 4){
				milesEarned = 3 * ticketPrice;
			}
			else if (numFlights >= 5){
				milesEarned = 4 * ticketPrice;
			}
		}
		else if(cardStatus.equalsIgnoreCase("silver")){
			if(numFlights >= 1 && numFlights <= 4){
				milesEarned = 5 * ticketPrice;
			}
			else if (numFlights >= 5){
				milesEarned = 6 * ticketPrice;
			}
		}
		else if(cardStatus.equalsIgnoreCase("gold")){
			if(numFlights >= 1 && numFlights <= 4){
				milesEarned = 7 * ticketPrice;
			}
			else if (numFlights >= 5){
				milesEarned = 8 * ticketPrice;
			}
		}
	}
	//get (Returns the result from the compute and return it to the App Class
	public Double getMilesEarned(){
		return milesEarned;
	}
}