/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Kaine
 */
public class ScannerCus {
	public int getInt(int min, int max, String errorMsg,String enterMsg ) {
		int input;
		System.out.print(enterMsg);
		do {
			Scanner sc = new Scanner(System.in);	

			// Wrong type
			if (!sc.hasNextInt()) {
				sc.next();
				System.out.println(errorMsg);
				System.out.print(enterMsg);
			} else {
				input = sc.nextInt();
			//Wrong min max
				if (!Validator.maxMinInt(input, min, max)) {
					System.out.println(errorMsg);
					System.out.print(enterMsg);
				} else {
					break;
				}
			} 
		} while (true);
		
		return input;
	}	

	public boolean getBoolean() {
		MenuHelper menu = new MenuHelper(2);
		menu.add("Yes");
		menu.add("No");
		boolean value = false;
		int choice;
		System.out.println("Please select your command: ");
		do {
			choice = menu.getChoice(false);
			switch (choice) {
				case 1:
					value = true;
					break;
				case 2:
					value = false;
					break;
			}
		} while (choice != 1 && choice !=2);
		return value;

	}
	

	public  String getString(Validator.StringType type, int min, int max, String errorMsg,String enterMsg) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print(enterMsg);
		do {
			str = sc.nextLine();
			
			//check length

			if (str.length() > max || str.length() < min) {
				System.out.println(errorMsg);
				System.out.print(enterMsg);
				
			} else {
		
			//checking string follow pattern
				if (type.equals(Validator.StringType.ALPHABET)) {
					if (!Validator.isAlplabet(str)) {
						System.out.println(errorMsg);
						System.out.print(enterMsg);
					} else {
						break;
					}
				}
				
				if (type.equals(Validator.StringType.ALPHANUM)) {
					if (!Validator.isAlplaNum(str)) {
						System.out.println(errorMsg);
						System.out.print(enterMsg);
					} else {
						break;
					}
				}
				if (type.equals(Validator.StringType.ALPHANUMWITHSPACE)) {
					if (!Validator.isAlplaNumWithSpace(str)) {
						System.out.println(errorMsg);
						System.out.print(enterMsg);
					} else {
						break;
					}
				}
				
				if (type.equals(Validator.StringType.STRING)) {
					if (!Validator.isString(str)) {
						System.out.println(errorMsg);
						System.out.print(enterMsg);
					} else {
						break;
					}
				}
			} 
		
				
				
		} while (true); 
		
		return str;
	}
	
}
