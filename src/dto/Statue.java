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
public class Statue extends Item{
	private int weight;
	private String colour;

	public Statue(){
		super();
		this.weight = 0;
		this.colour = "";
	}
	

	public Statue(int value, String creator,int height, String material){
		super(value,creator);
		this.weight = height;
		this.colour = material;
	}

	//Getter

	public int getWeight() {
		return this.weight;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	//Setter

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setColour(String colour) {
		this.colour  = colour;
	}
	
	//Method

	public void inputStatue() {
		ScannerCus sc = new ScannerCus();	
		input();
		this.weight = sc.getInt(1, Integer.MAX_VALUE, "Invalid value please try again", "Input a weight: ");
		this.colour = sc.getString(Validator.StringType.ALPHANUMWITHSPACE, 1, Integer.MAX_VALUE - 1, "Valid String, please try again","Input a colour: ");

	}

	public void outputStatue() {
		output();
		System.out.println("Weight: " + this.weight);
		System.out.println("Colour: " + this.colour);
	}
	
}


