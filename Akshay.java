package qustions;

import java.util.HashMap;
import java.util.Scanner;

public class Assingment {
	
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Other expenses");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Dinner", 1000);
		hm.put("Breakfast", 2000);
		hm.put("car rental", 3000);
		
		String addedName=s.nextLine();
		int addedAmount=s.nextInt();
		
		hm.put(addedName, addedAmount);
		
		int totalExpense=0;
	}

}
