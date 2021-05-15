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
public class Vase extends Item{
	private int height;
	private String material;

	public Vase(){
		super();
		this.height = 0;
		this.material = "";
	}
	

	public Vase(int value, String creator,int height, String material){
		super(value,creator);
		this.height = height;
		this.material = material;
	}

	//Getter

	public int getHeight() {
		return this.height;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	//Setter

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setMaterial(String material) {
		this.material  = material;
	}
	
	//Method

	public void inputVase() {
		ScannerCus sc = new ScannerCus();	
		input();
		this.height = sc.getInt(1, Integer.MAX_VALUE, "Invalid value please try again", "Input a height: ");
		this.material = sc.getString(Validator.StringType.ALPHANUMWITHSPACE, 1, Integer.MAX_VALUE - 1, "Valid String, please try again","Input a material: ");

	}

	public void outputVase() {
		output();
		System.out.println("Height: " + this.height);
		System.out.println("Material: " + this.material);
	}
	
}


