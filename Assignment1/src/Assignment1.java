import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to Natelie's Boat Shop");
		System.out.print("Please enter your name: ");
		String name = in.next();
		
		System.out.print("Please enter your IC number: ");
		String ic = in.next();
		
		System.out.print("Please enter your address: ");
		String address = in.next();
		
		System.out.println();
		
			System.out.println("We have total 2 types of boat, Types of boat: Canoe, Sailboat");
		    System.out.print("Please tell us what types of boat you would like to purchase: ");
		    String type1 = in.next();
		    
		    System.out.println("Brand : MasterCraft, Bayliner");
		    System.out.print("Plese tell us the brand too: ");
		    String brand1 = in.next();
		
		System.out.println();
		
		System.out.println("Here is the pricelist for your purchase, Both brand price of items is the same.");
		System.out.println("1.Canoe = RM900" +"\n "+"2.Sailboat = RM60000");
	
		int canoe = 900;
		int sailboat = 60000;
		
		int totalprice =0;
		
		
		int discount = (totalprice*20)/100;
		int pricetobepaid = totalprice - discount;
	
		System.out.println();
		
		System.out.println("Here's a good news for you! Due to our YEAR-END PROMOTION, You will be entitiled for 20% off for your purchase!");
		System.out.println("Total price: " +type1);
		System.out.println("Discount received: ");
		System.out.println("Price to be paid: ");
		System.out.println("Thank you so much for your purchase, hope to see you soon again! Have a nice day :)");
		
		
		in.close();
		

	}

}
