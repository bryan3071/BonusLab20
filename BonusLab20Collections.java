package BonusLab20Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class BonusLab20Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Guenther's Market!");
		System.out.println ();
		
		System.out.println("Enter an item name");
		Scanner scnr=new Scanner(System.in);
		
		// scnr.close();
		
		
			
			String[] food2 = new String[8];
			
			food2[0] = "Apple";
			food2[1] = "Banana";
			food2[2] = "Cauliflower";
			food2[3] = "Dragonfruit";
			food2[4] = "Elderberry";
			food2[5] = "figs";
			food2[6] = "grapefruit";
			food2[7] = "honeydew";
			
			double[] price = new double[8];
			
			price[0] = 0.99;
			price[1] = 0.59;
			price[2] = 1.59;
			price[3] = 2.19;
			price[4] = 1.79;
			price[5] = 2.09;
			price[6] = 1.99;
			price[7] = 3.49;
			
			System.out.println(food2[1] + " - #" + price[1]);
			
			for (int i = 0; i < food2.length; i++) {
				System.out.println(food2[i] + " - " + price[i]);
				
				int userEntry = getInt("Please enter a food item that you would like to order", scnr);
				System.out.println("You chose " + food2[userEntry - 1]);
		}
		
			
	}
	
	public static int getInt(String prompt, Scanner scnr) {
	       boolean isValid = true;
	       int num = 0;

	       while (!isValid) {
	           System.out.println(prompt);
	           if (scnr.hasNextInt()) {
	               num = scnr.nextInt();
	               isValid = true;
	           } else {
	               System.out.println("The item does not exist, select another item.");
	               isValid = false;
	           }
	           scnr.nextLine(); 
	       }
	       return num;

}
}

