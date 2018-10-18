package BonusLab20Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;

public class BonusLab20Collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Guenther's Market!");
		System.out.println ();
		
		
		Scanner scnr=new Scanner(System.in);
		
		
		
		
			
			ArrayList<String> food2 = new ArrayList<>();
			
			food2.add  ("Apple");
			food2.add ("Banana");
			food2.add ("Cauliflower");
			food2.add ("Dragonfruit");
			food2.add ("Elderberry");
			food2.add  ("figs");
			food2.add  ("grapefruit");
			food2.add  ("honeydew");
		
			ArrayList<Double> price = new ArrayList<>();
			
			price.add (0.99);
			price.add (0.59);
			price.add (1.59);
			price.add (2.19);
			price.add (1.79);
			price.add (2.09);
			price.add (1.99);
			price.add (3.49);
			
			
			
			for (int i = 0; i < food2.size (); i++) {
				System.out.println(food2.get(i) + " - " + price.get(i));
				//System.out.println(food2[i] + " - " + price[i]);
			
			}
			System.out.println();
			System.out.println("What item would you like to order?");
//			scnr.nextLine();
			String userPick = scnr.nextLine();
			System.out.println("Adding " + userPick + " to cart at $");
			scnr.close();
			
		}
		
			
	
	}


