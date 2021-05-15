/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import helper.ScannerCus;
import helper.Validator;

/**
 *
 * @author Kaine
 */
public class Item {
	
	public int value;	
	public String creator;
	
	public Item(){
		this.value = 0;		
		this.creator = "";		
	}

	public Item(int value, String creator) {
		this.value = value;
		this.creator = creator;
	}

	//Getter

	public int getValue() {
		return this.value;
	}
	
	public String getCreator() {
		return this.creator;
	}
	
	//Setter

	public void setValue(int value) {
		this.value = value;
	}
	
	public void setCreator(String creator) {
		this.creator  = creator;
	}

	//Method

	public void input() {
		ScannerCus sc = new ScannerCus();	
		this.value = sc.getInt(1, Integer.MAX_VALUE, "Invalid value please try again", "Input a value: ");
		this.creator = sc.getString(Validator.StringType.ALPHANUMWITHSPACE, 1, Integer.MAX_VALUE - 1, "Valid String, please try again","Input a creator: ");

	}

	public void output() {
		System.out.println("This item is worth " + value + " pounds");
		System.out.println("This item is created by " + creator);
	}

}
