/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntiqueShop;

import dto.*;
import helper.MenuHelper;

/**
 *
 * @author Kaine
 */
public class Tester {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Item item = null;
		MenuHelper menu = new MenuHelper(4);
		menu.add("Create a Vase: ");
		menu.add("Create a Statue: ");
		menu.add("Create a Painting: ");
		menu.add("Display the Item: ");
		int choice = 0;
			
		do {
			choice = menu.getChoice(false);
			switch (choice) {
				case 1: 
					item = new Vase();
					((Vase)item).inputVase();
					break;
				case 2: 
					item = new Statue();
					((Statue)item).inputStatue();
					break;
				case 3: 
					item = new Painting();
					((Painting)item).inputPainting();
					break;
				case 4: 
					if (item != null) {
						if (item instanceof Vase)
							((Vase)item).outputVase();
						else if (item instanceof Statue)
							((Statue)item).outputStatue();
						else if (item instanceof Painting)
							((Painting)item).outputPainting();
					}
					else System.out.println("You need to create an object");
					break;
			}
		} while (choice <= 4); 
	}
}
